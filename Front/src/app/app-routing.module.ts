import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PeliculaComponent } from './pelicula/pelicula.component';
import { LoginComponent } from './login/login.component';
import { ActoresComponent } from './actores/actores.component';
import { DirectoresComponent } from './directores/directores.component';

const routes: Routes = [
  {path: 'pelicula', component: PeliculaComponent},
  {path: '', redirectTo:'/login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'actores', component: ActoresComponent},
  {path: 'directores', component: DirectoresComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
