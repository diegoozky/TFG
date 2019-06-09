import { Component, OnInit } from '@angular/core';
import { ActoresService } from './actores.service';
import { HttpClient } from '@angular/common/http';
import { Actor } from '../Model/Actor';

@Component({
  selector: 'app-actores',
  templateUrl: './actores.component.html',
  styleUrls: ['./actores.component.css']
})
export class ActoresComponent implements OnInit {

  public actores: Actor[];

  constructor(private actoresService: ActoresService, private http: HttpClient) {
    this.actores = new Array<Actor>();
   }

  ngOnInit() {
    this.loadActores();
  }

  public loadActores(): void{
    this.actoresService.loadActores().subscribe(res => {this.actores = res; console.log(this.actores);});
  }

}
