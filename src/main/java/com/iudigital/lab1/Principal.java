package com.iudigital.lab1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    
    private static Date obtenerDecha(String fechaString) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(fechaString);
    }
    
    private static void serializar() throws ParseException, JsonProcessingException {
        Producto producto = new Producto();
        producto.setId(1L);
        producto.setNombre("Zapatos Negros");
        producto.setCategoria("Calzado");
        producto.setMarca("Adidas");
        
        Precio precio = new Precio();
        precio.setPrecio(2000D);
        precio.setPrecioConDescuento(1500D);
       
        precio.setPrecioConDescValidoHasta(obtenerDecha("2022-03-31"));
        
        producto.setPrecio(precio);
        
        Dimensiones dimensiones = new Dimensiones();
        dimensiones.setAlto(2.5);
        dimensiones.setAncho(12.3);
        dimensiones.setLargo(3D);
        dimensiones.setPeso(10.5);
        
        producto.setDimensiones(dimensiones);
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        String prodSerializado = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(producto); 
        
        System.out.println("Objeto serealizado");
        System.out.println(prodSerializado);
        
    }
    
    private static void deserealizar() throws JsonProcessingException {
        String prodSer = "{\n" +
"  \"id\" : 1,\n" +
"  \"nombre\" : \"Zapatos Negros\",\n" +
"  \"precio\" : {\n" +
"    \"precio\" : 2000.0,\n" +
"    \"precioConDescuento\" : 1500.0,\n" +
"    \"precioConDescValidoHasta\" : 1648702800000\n" +
"  },\n" +
"  \"dimensiones\" : {\n" +
"    \"alto\" : 2.5,\n" +
"    \"largo\" : 3.0,\n" +
"    \"ancho\" : 12.3,\n" +
"    \"peso\" : 10.5\n" +
"  },\n" +
"  \"categoria\" : \"Calzado\",\n" +
"  \"marca\" : \"Adidas\"\n" +
"}";
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        Producto producto = objectMapper.readValue(prodSer, new TypeReference<Producto>(){});
        
        System.out.println("Objeto deserealizado");
        System.out.println(producto);
        
    }
    
    public static void main(String[] args) {
        
        try {
            serializar();
        } catch (ParseException | JsonProcessingException ex) {
            ex.printStackTrace();
        }
        
        try {
            deserealizar();
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }
    
}
