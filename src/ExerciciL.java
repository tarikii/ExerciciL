import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ExerciciL {

    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyy");
        Persona p1 = new Persona("Arya", Persona.Genere.DONA, LocalDate.parse("25/12/2002",format) );
        Persona p2 = new Persona("Tyrion", Persona.Genere.HOME, LocalDate.parse("12/10/1980",format));
        Persona p3 = new Persona("Cersei", Persona.Genere.DONA, LocalDate.parse("10/01/1984",format));
        Persona p4 = new Persona("Eddard", Persona.Genere.HOME, LocalDate.parse("24/04/1974",format));
        Persona p5 = new Persona("Sansa", Persona.Genere.DONA, LocalDate.parse("24/04/1992",format));
        Persona p6 = new Persona("Jaime", Persona.Genere.HOME, LocalDate.parse("24/04/1979",format));
        Persona p7 = new Persona("Khal", Persona.Genere.HOME, LocalDate.parse("10/08/1979",format));
        Persona p8 = new Persona("Daenerys", Persona.Genere.DONA, LocalDate.parse("12/11/1992",format));
        Persona p9 = new Persona("Davos", Persona.Genere.HOME, LocalDate.parse("12/11/1965",format));
        Persona p10 = new Persona("Jon Neu", Persona.Genere.HOME, LocalDate.parse("12/11/1986",format));
        Persona p11 = new Persona("Brienne", Persona.Genere.DONA, LocalDate.parse("12/11/1989",format));

        Persona[] lpers = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11};
        List<Persona> llista_persones;
        llista_persones = new ArrayList<>(Arrays.asList(lpers));
        Map<Integer,Integer> mapPersones = new HashMap<>();


        System.out.println("\n1-2");
        Collections.sort(llista_persones, (Persona o1, Persona o2) -> p1.getNom().compareTo(p2.getNom()));



        List.of(llista_persones).forEach(p -> System.out.println(p));


        System.out.println("\n3-4");
        //ordenació alfabètica inversa del nom
        Collections.sort(llista_persones, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getNom().compareTo(o1.getNom());
            }
        });

        // 4 - Canvia per una crida al mètode per referència
        for(Persona p: llista_persones) {
            System.out.println(p);
        };



        llista_persones.forEach((Persona p) -> mapPersones.put(p.getAge(),1));



        mapPersones.forEach((K,V) -> System.out.println(K + ": " + V));



        /* 7 -
            Esbrina com s'utilitzen els mètodes de map següents
                map.putIfAbsent
                map.computeIfAbsent
                map.computeIfPresent
             per tal d'afegir correctament la feqüència d'edat de les persones.
             Si vols fes-ho primer sense els mètodes anomenats i sense lambdes
             i després amb els mètodes i amb lambdes
             Exemple de sortida:
                34 anys -> 1
                38 anys -> 1
                39 anys -> 2
                26 anys -> 2
                44 anys -> 1
                15 anys -> 1
         */

        for(Persona p: llista_persones){
            mapPersones.computeIfAbsent(p.getAge(),null);
        }


        // 8 - llistat de persones DONA amb lambda (stream)


        // 9 - Llistat dels dos HOMES més joves (stream)

        // 10- Esborrar (no filtrar o imprimir) del llistat les persones entre 30 i 40 anys (amb lambda)

        // 11 - Persones que tinguin una 'a' al seu nom
        System.out.println("\n11 Amb una 'A'");

        //12 - Llistat de les dates de naixament + dos dies
        System.out.println("\n12 - dates amb dos dies més");


        //13 - Rejovenir dos anys a totes les persones
        System.out.println("\n13 - Rejovenir dos anys a totes les persones");


    }


}