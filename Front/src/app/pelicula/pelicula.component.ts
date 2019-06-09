import {Component, OnInit, ViewChild} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatTableDataSource} from '@angular/material/table';
import { Pelicula } from '../Model/Pelicula';
import { PeliculaService } from './pelicula.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-pelicula',
  templateUrl: './pelicula.component.html',
  styleUrls: ['./pelicula.component.css']
})
export class PeliculaComponent implements OnInit {

  public p: Pelicula;
  public peliculas: Pelicula[];
  public dataSource: any;

  constructor(private peliculaService: PeliculaService,  private router: Router) {
    this.peliculas = new Array<Pelicula>();
    this.p = new Pelicula();
   }
  displayedColumns: string[] = ['caratula','titulo', 'descripcion'];

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  ngOnInit() {
    this.loadPeliculas();
    if(sessionStorage.getItem('user') == null){
      this.router.navigate(['/login']);
    }
  }
  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
  public loadPeliculas(): void{
    this.peliculaService.loadPeliculas().subscribe(res => {this.peliculas = res; 
                                                           this.dataSource = new MatTableDataSource<Pelicula>(this.peliculas);
                                                           this.dataSource.paginator = this.paginator;

      });
  }
  public cerrarSesion(): void{
    sessionStorage.clear();
    this.router.navigate(['/login']);

  }
  public verInfo(p: Pelicula): void{
    this.p = p;
    console.log(p);
  }
  public trailer(): void{
    window.open(this.p.trailer);
  }
}
