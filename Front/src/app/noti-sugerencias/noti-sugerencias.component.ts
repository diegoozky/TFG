import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-noti-sugerencias',
  templateUrl: './noti-sugerencias.component.html',
  styleUrls: ['./noti-sugerencias.component.css']
})
export class NotiSugerenciasComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  public cerrarSesion(): void{
    sessionStorage.clear();
    this.router.navigate(['/login']);

  }

}
