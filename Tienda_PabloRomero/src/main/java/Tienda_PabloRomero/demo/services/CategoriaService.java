package Tienda_PabloRomero.demo.services;

import Tienda_PabloRomero.demo.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se obtiene un listado de categorias en una List
    public List<Categoria> getCategoria(boolean activos);
    
}
