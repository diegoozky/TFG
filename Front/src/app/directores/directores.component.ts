import { Component, OnInit } from '@angular/core';
import { DirectoresService } from './directores.service';
import { Director } from '../Model/Director';
import { Router } from '@angular/router';

@Component({
  selector: 'app-directores',
  templateUrl: './directores.component.html',
  styleUrls: ['./directores.component.css']
})
export class DirectoresComponent implements OnInit {

  public directores: Director[];
  public d: Director;
  public rol: string;
  public directorCreado: Director;

  constructor(private directorService: DirectoresService, private router: Router) {

    this.directores = new Array<Director>();
    this.d = new Director();
    this.rol = sessionStorage.getItem('rol');
    this.directorCreado = new Director();
  }

  ngOnInit() {
    this.loadDirectores();
  }

  public loadDirectores(): void {
    this.directorService.loadDirectores().subscribe(res => { this.directores = res; console.log(this.directores); });
  }
  public cerrarSesion(): void {
    sessionStorage.clear();
    this.router.navigate(['/login']);

  }
  public mantener(d: Director) {
    this.d = d;
  }
  public editar() {
    this.directorService.editarDirector(this.d).subscribe(res => { console.log(res) });
    window.location.reload();
  }
  public eliminar(a: any) {
    this.directorService.eliminarActor(a.id).subscribe(res => { console.log(res) });


  }
  public addDirector() {
    this.directorService.addDirector(this.directorCreado).subscribe();
  }
}
