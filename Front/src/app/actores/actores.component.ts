import { Component, OnInit } from '@angular/core';
import { ActoresService } from './actores.service';
import { Actor } from '../Model/Actor';
import { Router } from '@angular/router';
import { $ } from 'protractor';

@Component({
  selector: 'app-actores',
  templateUrl: './actores.component.html',
  styleUrls: ['./actores.component.css']
})
export class ActoresComponent implements OnInit {

  public actores: Actor[];

  constructor(private actoresService: ActoresService,  private router: Router) {
    this.actores = new Array<Actor>();
   }

  ngOnInit() {
    this.loadActores();
  }

  public loadActores(): void{
    this.actoresService.loadActores().subscribe(res => {this.actores = res; console.log(this.actores);});
  }
  public cerrarSesion(): void{
    sessionStorage.clear();
    this.router.navigate(['/login']);

  }


}
