package co.com.sofkau.almacen;

import java.sql.SQLOutput;

public class Electrodomestico {

    String consumo, procedencia;
    float precioConsumo =0, precioProcedencia =0;

    public Electrodomestico(String consumo, String procedencia){
        this.consumo = consumo;
        this.procedencia = procedencia;
        precioConsumo();
        precioProcedencia();
    }

    public void precioConsumo(){
        if (consumo.equalsIgnoreCase("a")){
            precioConsumo = 450000;
        }else if (consumo.equalsIgnoreCase("b")){
            precioConsumo = 350000;
        }else if (consumo.equalsIgnoreCase("c")){
            precioConsumo = 250000;
        }else {
            System.out.println("Por favor ingrese una opción válida");
        }
    }

    public void precioProcedencia(){
        if (procedencia.equalsIgnoreCase("nacional")){
            precioProcedencia = 250000;
        }else if (procedencia.equalsIgnoreCase("importado")){
            precioProcedencia = 350000;
        }
    }
}
