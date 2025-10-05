package pe.edu.upeu.msproducto.dto;

import lombok.Data;

@Data

public class ProductoDto {


    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer idCategoria;
    private CategoriaDto categoria;

}
