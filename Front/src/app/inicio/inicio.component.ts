import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
    if (sessionStorage.getItem('user') == null) {
      this.router.navigate(['/login']);
    }
  }
  peliculas(): void {
    this.router.navigate(['/pelicula']);

  }
  cerrarSesion(): void {
    sessionStorage.clear();
    this.router.navigate(['/login']);
  }
}
