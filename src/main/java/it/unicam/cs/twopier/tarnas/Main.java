package it.unicam.cs.twopier.tarnas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello from tarnas");

        RNAFormatTranslator db = new DBTranslator();


        var header = List.of("Filename: d.5.a.P.occultum.bpseq",
                "Organism: Pyrodictium occultum",
                "Accession Number: M21086",
                "Citation and related information available at http://www.rna.ccbb.utexas.edu");

        RNASecondaryStructure rnas = new RNASecondaryStructure();
        //rnas.s

        System.out.println(db.translateToBPSEQ(new RNAFile(header, rnas)));

    }

}
