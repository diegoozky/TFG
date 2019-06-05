import { Genero } from './Genero';
import { Actor } from './Actor';
import { Director } from './Director';

export class Pelicula {
    public titulo: string;
    public duracion: string;
    public productora: string;
    public premios: string;
    public estreno: string;
    public presupuesto: string;
    public rutaImg: string;
    public descripcion: string;
    public listaGeneros: Genero[];
    public listaActores: Actor[];
    public director: Director;
}
