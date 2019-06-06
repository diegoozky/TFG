import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Usuario } from '../Model/Usuario';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  private url = 'http://localhost:8080/user';
  constructor(private http: HttpClient) { }
  public verificacion(u: Usuario): Observable<Usuario> {
    return this.http.post<Usuario>(this.url, u, {headers: this.httpHeaders});
  }

  public crear(u: Usuario): Observable<boolean> {
    return this.http.post<boolean>(this.url + '/create', u , {headers: this.httpHeaders});
  }
}
