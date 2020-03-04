package src;

import src.Brand.*;
import src.Country.*;
import src.Product.*;
import src.Provider.*;


public class Exec {

    public static void main(String[] args) {
        Currency moeda = new Currency();
        Country pais = new Country();
        Provider fornecedor = new Provider();
        Brand marca = new Brand();
        Product produto = new Product();

        moeda.setName("Real");

        pais.setName("Brasil");
        pais.setLanguage("Português");
        pais.setCurrency(moeda);

        fornecedor.setName("Nestlé");
        fornecedor.setCountry(pais);

        marca.setName("Charge");
        marca.setProvider(fornecedor);

        produto.setPrice(1.90);
        produto.setBrand(marca);
    }
}