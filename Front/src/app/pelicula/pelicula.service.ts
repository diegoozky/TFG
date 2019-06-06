import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pelicula } from '../Model/Pelicula';

@Injectable({
  providedIn: 'root'
})
export class PeliculaService {

  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  private url = 'http://localhost:8080/pelicula';

  constructor(private http: HttpClient) { }

  public loadPeliculas(): Observable<Pelicula[]>{
    return this.http.get<Pelicula[]>(this.url);
  }


}
