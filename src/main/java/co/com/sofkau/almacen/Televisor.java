package co.com.sofkau.almacen;

public class Televisor extends Electrodomestico {

    float tamano, precioTamano;

    public Televisor (String consumo, String procedencia, float capacidad){
        super (consumo,procedencia);
        this.tamano = tamano;

    }
    public void precioTamano(){
        if (this.tamano > 40){
            precioTamano = (float) ((precioConsumo + precioProcedencia)*0.3);
        }

    }


}
