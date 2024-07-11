package com.Banke.Controller;

import com.Banke.Model.Carte;
import com.Banke.Service.CarteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carte")
public class CarteController {
    @Autowired
    private CarteServiceImpl carteService;

    @GetMapping("/")
    public List<Carte> getCartes() {
        return carteService.getAllCartes();
    }

    @GetMapping("/{id}")
    public Carte getCarte(@PathVariable int id) {
        return carteService.getCarteById(id);
    }

    @PostMapping("/add")
    public Carte addCarte(@RequestBody Carte carte) {
        return carteService.creerCarte(carte);
    }

    @DeleteMapping("/{id}")
    public String deleteCarte(@PathVariable int id) {
        carteService.deleteCarte(id);
        return "deleted";
    }

    @PostMapping("/{id}/activer")
    public String activerCarte(@PathVariable int id) {
        carteService.activerCarte(id);
        return "activated";
    }

    @PostMapping("/{id}/desactiver")
    public String desactiverCarte(@PathVariable int id) {
        carteService.desactiverCarte(id);
        return "deactivated";
    }
}