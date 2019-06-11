import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { PeliculaComponent } from './pelicula/pelicula.component';
import {MatPaginatorModule, MatTableModule, MatFormFieldModule, MatInputModule} from '@angular/material';
import { LoginComponent } from './login/login.component';


import { HttpClientModule} from '@angular/common/http';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ActoresComponent } from './actores/actores.component';
import { DirectoresComponent } from './directores/directores.component';
import { InicioComponent } from './inicio/inicio.component';
import { NotiSugerenciasComponent } from './noti-sugerencias/noti-sugerencias.component';



@NgModule({
  declarations: [
    AppComponent,
    PeliculaComponent,
    LoginComponent,
    ActoresComponent,
    DirectoresComponent,
    InicioComponent,
    NotiSugerenciasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatTableModule,
    BrowserAnimationsModule,
    MatPaginatorModule,
    MatFormFieldModule,
    MatInputModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
