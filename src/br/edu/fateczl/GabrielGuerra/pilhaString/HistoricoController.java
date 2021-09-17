package br.edu.fateczl.GabrielGuerra.pilhaString;

import java.net.URL;
import java.util.ArrayList;

public class HistoricoController {

    ArrayList<String> siteAtual = new ArrayList<String>();

    public void inserirSite(String nomeSite) {
        siteAtual.add(nomeSite);
    }

    public void removerSite(String url) {
        siteAtual.remove(url);
    }

    public void consultarSite() {
        System.out.println(siteAtual);
    }
}
