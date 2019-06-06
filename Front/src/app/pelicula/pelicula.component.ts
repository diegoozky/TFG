import {Component, OnInit, ViewChild} from '@angular/core';
import {MatPaginator} from '@angular/material/paginator';
import {MatTableDataSource} from '@angular/material/table';
import { Pelicula } from '../Model/Pelicula';
import { PeliculaService } from './pelicula.service';
@Component({
  selector: 'app-pelicula',
  templateUrl: './pelicula.component.html',
  styleUrls: ['./pelicula.component.css']
})
export class PeliculaComponent implements OnInit {

  public peliculas: Pelicula[];
  public dataSource: any;

  constructor(private peliculaService: PeliculaService) {
    this.peliculas = new Array<Pelicula>();
   }
  displayedColumns: string[] = ['caratula','titulo', 'descripcion'];

  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  ngOnInit() {
    this.loadPeliculas();
  }
  applyFilter(filterValue: string) {
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
  public loadPeliculas(): void{
    this.peliculaService.loadPeliculas().subscribe(res => {this.peliculas = res; 
                                                           this.dataSource = new MatTableDataSource<Pelicula>(this.peliculas);
                                                           this.dataSource.paginator = this.paginator;

      ;});
  }

}
