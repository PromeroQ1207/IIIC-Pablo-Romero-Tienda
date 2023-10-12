package Tienda_PabloRomero.demo.dao;
import Tienda_PabloRomero.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long>{
    
}
