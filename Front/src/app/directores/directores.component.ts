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

  constructor(private directorService: DirectoresService, private router: Router) { 

    this.directores = new Array<Director>();

  }

  ngOnInit() {
    this.loadDirectores();
  }
  
  public loadDirectores(): void{
    this.directorService.loadDirectores().subscribe(res =>{this.directores=res; console.log(this.directores);});
  }
  public cerrarSesion(): void{
    sessionStorage.clear();
    this.router.navigate(['/login']);

  }

}
