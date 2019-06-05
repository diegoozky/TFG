import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { PeliculaComponent } from './pelicula/pelicula.component';
import { ActorComponent } from './actor/actor.component';
import { DirectorComponent } from './director/director.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    PeliculaComponent,
    ActorComponent,
    DirectorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
