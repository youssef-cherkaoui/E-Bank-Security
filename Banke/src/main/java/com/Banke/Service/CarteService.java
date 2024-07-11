package com.Banke.Service;

import com.Banke.Model.Carte;
import java.util.List;
import java.util.Optional;

public interface CarteService {

    Carte creerCarte(Carte carte);

    List<Carte> getAllCartes();

    Carte getCarteById(int id);

    void deleteCarte(int id);

    void activerCarte(int id);

    void desactiverCarte(int id);

    Carte save(Carte carte);

    Optional<Carte> findById(int id);
}

