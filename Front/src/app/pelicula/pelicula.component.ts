import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { Pelicula } from '../Model/Pelicula';
import { PeliculaService } from './pelicula.service';
import { Router } from '@angular/router';
import { Actor } from '../Model/Actor';
import { Director } from '../Model/Director';
import { Genero } from '../Model/Genero';
import { ActoresService } from '../actores/actores.service';
import { DirectoresService } from '../directores/directores.service';
@Component({
  selector: 'app-pelicula',
  templateUrl: './pelicula.component.html',
  styleUrls: ['./pelicula.component.css']
})
export class PeliculaComponent implements OnInit {

  public p: Pelicula;
  public peliculas: Pelicula[];
  public dataSource: any;
  public a: Actor;
  public d: Director;
  public peliculaCreada: Pelicula;
  public rol: string;
  public generos: Array<Genero>;
  public generoString: Array<string>;
  public actoresString: Array<string>;
  public actores: Actor[];
  public directores: Director[];
  // tslint:disable-next-line: max-line-length
  constructor(private peliculaService: PeliculaService, private router: Router, private actorService: ActoresService, private directorService: DirectoresService) {
    this.peliculas = new Array<Pelicula>();
    this.p = new Pelicula();
    this.a = new Actor();
    this.d = new Director();
    this.peliculaCreada = new Pelicula();
    this.rol = sessionStorage.getItem('rol');
    this.generos = new Array<Genero>();
    this.peliculaCreada.director = new Director();
    this.peliculaCreada.listaGeneros = new Array<Genero>();
    this.peliculaCreada.listaActores = new Array<Actor>();
    this.generoString = new Array<string>();
    this.actoresString = new Array<string>();
    this.actores = new Array<Actor>();
    this.directores = new Array<Director>();


  }
  displayedColumns: string[] = ['caratula', 'titulo', 'descripcion'];

  @ViewChild(MatPaginator, { static: true }) paginator: MatPaginator;
  ngOnInit() {
    this.loadPeliculas();
    this.loadGeneros();
    this.actorService.loadActores().subscribe(res => { this.actores = res; });
    this.directorService.loadDirectores().subscribe(res => { this.directores = res });
    if (sessionStorage.getItem('user') == null) {
      this.router.navigate(['/login']);
    }
  }
  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
  public loadPeliculas(): void {
    this.peliculaService.loadPeliculas().subscribe(res => {
    this.peliculas = res;
      this.dataSource = new MatTableDataSource<Pelicula>(this.peliculas);
      this.dataSource.paginator = this.paginator;

    });
  }
  public cerrarSesion(): void {
    sessionStorage.clear();
    this.router.navigate(['/login']);

  }
  public verInfo(p: Pelicula): void {
    this.p = p;
    console.log(p);
  }
  public trailer(): void {
    window.open(this.p.trailer);
  }
  public eliminar(p: any): void {
    this.peliculaService.borrarPelicula(p.id).subscribe();
    window.location.reload();
  }
  public editar(): void {
    this.peliculaService.editarPeli(this.p).subscribe(res => { console.log(res) });
    window.location.reload();

  }
  public actor(a: Actor): void {
    this.a = a;
  }
  public director(d: Director): void {
    this.d = d;
  }
  public loadGeneros() {
    this.peliculaService.loadGeneros().subscribe(res => { this.generos = res; console.log(this.generos) })
  }
  public addPeli() {
    for (let cadena of this.generoString) {
      let g = new Genero();
      g.genero = cadena;
      this.peliculaCreada.listaGeneros.push(g);
    }
    for (let cadena of this.actoresString) {
      let a = new Actor();
      a.nombre = cadena;
      this.peliculaCreada.listaActores.push(a);
    }
    this.peliculaService.addPeli(this.peliculaCreada).subscribe();
    window.location.reload();
  }
}
