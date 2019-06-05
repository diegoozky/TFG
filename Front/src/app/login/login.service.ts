import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'});
  private url = 'http://localhost:8080/user';
  constructor() { }
}
