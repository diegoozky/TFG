import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Actor } from '../Model/Actor';

@Injectable({
  providedIn: 'root'
})
export class ActoresService {

  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  private url = 'http://localhost:8080/actor';

  constructor(private http: HttpClient) { }

  public loadActores(): Observable<Actor[]>{
    return this.http.get<Actor[]>(this.url);
  }
}
