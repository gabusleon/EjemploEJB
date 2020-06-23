package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String nombre;
    private double costoUnitario;
    @ManyToOne
    private Category categoria;

    public Product() {

    }

    public Product(String nombre, double costoUnitario) {
	super();
	this.nombre = nombre;
	this.costoUnitario = costoUnitario;
    }

    public int getCodigo() {
	return codigo;
    }

    public void setCodigo(int codigo) {
	this.codigo = codigo;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public double getCostoUnitario() {
	return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
	this.costoUnitario = costoUnitario;
    }

    public Category getCategoria() {
	return categoria;
    }

    public void setCategoria(Category categoria) {
	this.categoria = categoria;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + codigo;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Product other = (Product) obj;
	if (codigo != other.codigo)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Producto [nombre=" + nombre + ", costoUnitario=" + costoUnitario + "]";
    }

}
