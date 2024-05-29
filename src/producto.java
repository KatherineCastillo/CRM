public class producto {
    private int id;
    private String nombre;
    private String marca;
    private double precio;

    public producto() {}

    public producto(int pId, String pNombre, String pMarca, double pPrecio) {
        this.id = pId;
        this.nombre = pNombre;
        this.marca = pMarca;
        this.precio = pPrecio;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Marca: " + marca + ", Precio: " + precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        this.id = pId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String pMarca) {
        this.marca = pMarca;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double pPrecio) {
        this.precio = pPrecio;
    }

}
