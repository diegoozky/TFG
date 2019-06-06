import { Component, OnInit } from '@angular/core';
import { Usuario } from '../Model/Usuario';
import { LoginService } from './login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public usuarioEnvio: Usuario;
  public usuarioCreado: Usuario;
  public cadena: string;

  constructor(private loginService: LoginService, private router: Router) { 
    this.usuarioEnvio = new Usuario();
    this.usuarioCreado = new Usuario();
    this.cadena = '';
  }

  ngOnInit() {
  }
  public verificar(): void{
    if(this.usuarioEnvio.username != null && this.usuarioEnvio.password != null){
      this.loginService.verificacion(this.usuarioEnvio).subscribe(res=>{
        if(res != null){
          sessionStorage.setItem('user', res.username);
          sessionStorage.setItem('rol', res.rolModel.rol);
          alert('Usuario correcto');
          this.router.navigate(['/pelicula']);
        } else{
          alert('Alguna credencial es incorrecta, vuelve a intentarlo');
        }
      })
    } else{
      alert('Introduzca las credenciales correctamente.');
    }

  }

  public crearUsuario(): void{
      if(this.usuarioCreado.password === this.cadena ){
          this.loginService.crear(this.usuarioCreado).subscribe(res=>{
            if(res){
                alert('Usuario creado correctamente.');
            } else{
                alert('Correo no disponible.');
            }
          })
      } else{
        alert('Las contraseñas no coinciden');
      }
  }

}
