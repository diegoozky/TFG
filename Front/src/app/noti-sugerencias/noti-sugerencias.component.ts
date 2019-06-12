import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PeliculaService } from '../pelicula/pelicula.service';
import { Mensaje } from '../Model/Mensaje';

@Component({
  selector: 'app-noti-sugerencias',
  templateUrl: './noti-sugerencias.component.html',
  styleUrls: ['./noti-sugerencias.component.css']
})
export class NotiSugerenciasComponent implements OnInit {

  public m: Mensaje;

  constructor(private router: Router, private servicio: PeliculaService) { 
    this.m = new Mensaje();
    this.m.usuario = sessionStorage.getItem('user');
  }

  ngOnInit() {
  }

  public cerrarSesion(): void{
    sessionStorage.clear();
    this.router.navigate(['/login']);
  }
  public sendEmail(){
    this.servicio.sendCorreo(this.m).subscribe();
    alert('Se ha enviado un correo al administrador');
    window.location.reload();
  }

}
