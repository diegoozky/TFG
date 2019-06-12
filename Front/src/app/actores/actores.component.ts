import { Component, OnInit } from '@angular/core';
import { ActoresService } from './actores.service';
import { Actor } from '../Model/Actor';
import { Router } from '@angular/router';


@Component({
  selector: 'app-actores',
  templateUrl: './actores.component.html',
  styleUrls: ['./actores.component.css']
})
export class ActoresComponent implements OnInit {

  public actores: Actor[];
  public a: Actor;
  public rol: string;
  public actorCreado: Actor;

  constructor(private actoresService: ActoresService, private router: Router) {
    this.actores = new Array<Actor>();
    this.a = new Actor();
    this.rol = sessionStorage.getItem('rol');
    this.actorCreado = new Actor();
  }

  ngOnInit() {
    this.loadActores();
  }

  public loadActores(): void {
    this.actoresService.loadActores().subscribe(res => { this.actores = res; console.log(this.actores[19].fechaDefuncion); });
  }
  public cerrarSesion(): void {
    sessionStorage.clear();
    this.router.navigate(['/login']);

  }
  public mantener(a: Actor) {
    this.a = a;
  }
  public editar() {
    this.actoresService.editarActor(this.a).subscribe();
    window.location.reload();
  }
  public eliminar(a: any) {
    this.actoresService.eliminarActor(a.id).subscribe();
    window.location.reload();

  }
  public addActor() {
    this.actoresService.addActor(this.actorCreado).subscribe();
    window.location.reload();
  }

}
