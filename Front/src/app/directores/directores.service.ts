import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Director } from '../Model/Director';
@Injectable({
  providedIn: 'root'
})
export class DirectoresService {
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  private url = 'http://localhost:8080/director';
  constructor(private http: HttpClient) { }

  public loadDirectores(): Observable<Director[]>{
    return this.http.get<Director[]>(this.url);
  }
  public editarDirector(d: Director): Observable<boolean>{
    return this.http.put<boolean>(this.url, d , {headers: this.httpHeaders});
    
  }
  public eliminarActor(id: number): Observable<boolean>{
    return this.http.delete<boolean>(this.url+'?id='+ id);
  }
}
