package com.example.projet2.projet2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/postgres")
public class EtudiantController {

    @Autowired
    private EtudiantInterface etudiantInterface;

    @GetMapping(path = "/getSub")
    public List<Etudiants> getEtudiant()
    {
        return etudiantInterface.findAll();
    }

    @RequestMapping(path = "/addNote")
    public Boolean insertNote(@RequestParam(name = "num_etudiant",defaultValue = "null")
                                          String num_etudiant,@RequestParam(name = "nom_matiere",defaultValue = "null")
            String nom_matiere,@RequestParam(name = "note") int note)
    {
        etudiantInterface.save(new Etudiants(num_etudiant,nom_matiere,note));
        return true;
    }
    @PostMapping(path = "/insertSub")
    private @ResponseBody Etudiants insertEtudiant(@RequestBody Etudiants e)
    {
        return etudiantInterface.save(e);
    }
}
