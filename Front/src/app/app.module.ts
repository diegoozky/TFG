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



@NgModule({
  declarations: [
    AppComponent,
    PeliculaComponent,
    LoginComponent,
    ActoresComponent,
    DirectoresComponent
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
