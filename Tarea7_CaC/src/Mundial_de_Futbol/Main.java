package Mundial_de_Futbol;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //Se crean los paises de los jugadores del mundial

        Pais ReinoUnido = new Pais("Reino Unido", "Europa", "Londres", 67330000);
        Pais Argentina = new Pais("Argentina", "America", "Capital Federal", 47327047);
        Pais Espania = new Pais("España", "Europa", "Madrid", 47330000);
        Pais Inglaterra = new Pais("Inglaterra", "Europa", "Londres", 55980000);
        Pais Portugal = new Pais("Portugal", "Europa", "Lisboa", 10300000);
        Pais Francia = new Pais("Francia", "Europa", "Paris", 6750000);
        Pais Italia = new Pais("Italia", "Europa", "Roma", 59070000);
        Pais Alemania = new Pais("Alemania", "Europa", "Berlin", 83130000);
        Pais EstadosUnidos = new Pais("Estados Unidos", "America", "Washington D.C",331900000);

        //Se crean los clubs de los jugadores del mundial

        Club AstonVilla = new Club("Aston Villa","Villa Park","Birmingham", ReinoUnido);
        Club River = new Club("River", "Monumental", "Buenos Aires", Argentina);
        Club AtleticoMadrid = new Club("Atlético de Madrid", "Cívitas Metropolitano", "Madrid", Espania);
        Club Tottenham = new Club("Tottenham Hotspur", "Tottenham Spur", "Tottenham", Inglaterra);
        Club Benfica = new Club("Sport Lisboa e Benfica", "Estádio da Luz", "Lisboa", Portugal);
        Club Sevilla = new Club("Sevilla Fútbol Club", "Estadio Ramón Sánchez-Pizjuán", "Sevilla", Espania);
        Club RealBetis = new Club("Real Betis Balompié", "Estadio Benito Villamarín", "Sevilla", Espania);
        Club ManchesterUnited = new Club("Manchester United Football Club", "Estadio Old Trafford", "Old Trafford", Inglaterra);
        Club PSG = new Club("París Saint-Germain Football Club", "Parque de los Príncipes", "Paris", Francia);
        Club VillaReal = new Club("Villarreal Club de Fútbol", "Estadio de la Cerámica", "Villareal", Espania);
        Club Juventus = new Club("Juventus de Turín", "Estado Juventus", "Turín", Italia);
        Club Inter = new Club("Inter de Milán", "Estadio Giuseppe Meazza", "Milán", Italia);
        Club ManchesterCity = new Club("Manchester City Football Club", "Etihad Stadium", "Manchester", Inglaterra);
        Club AtlantaUnited = new Club("Atlanta United Football Club", "Mercedes-Benz Stadium/Fifth Third Bank Stadium","Atlanta, Georgia", EstadosUnidos);
        Club Brighton = new Club("Brighton & Hove Albion Football Club", "Falmer Stadium", "Brighton & Hove", ReinoUnido);
        Club Roma = new Club("Associazione Sportiva Roma", "Estadio Olímpico de Roma", "Roma", Italia);
        Club OlympiqueLyon = new Club("Olympique de Lyon","Parc Olympique Lyonnais","Lyon", Francia);
        Club BayerLeverkusen = new Club("Bayer 04 Leverkusen","BayArena"," Leverkusen", Alemania);




        // Se crea Técnicos de Selección (en este caso solo Scaloni)

        Tecnico Scaloni = new Tecnico("Lionel", "Scaloni", 4, 1);

        //Se crean a los arqueros convocados
        ArrayList<Jugador> ArgentinaJugadores = new ArrayList<>();

        ArgentinaJugadores.add( new Jugador("Emiliano", "Martinez", "Arquero", 23, AstonVilla));
        ArgentinaJugadores.add(new Jugador("Gerónimo", "Rulli", "Arquero", 12, VillaReal));
        ArgentinaJugadores.add(new Jugador("Franco", "Armani", "Arquero", 1, River));

        // Se crean a los defensores convocados
        ArgentinaJugadores.add(new Jugador("Nahuel", "Molina", "Defensor", 26, AtleticoMadrid));
        ArgentinaJugadores.add(new Jugador("Gonzalo", "Montiel", "Defensor", 4, Sevilla));
        ArgentinaJugadores.add(new Jugador("Cristian", "Romero", "Defensor", 13, Tottenham));
        ArgentinaJugadores.add(new Jugador("Germán", "Pezella", "Defensor", 6, RealBetis));
        ArgentinaJugadores.add(new Jugador("Nicolás", "Otamendi", "Defensor", 19, Benfica));
        ArgentinaJugadores.add(new Jugador("Lisandro", "Martinez","Defensor", 25, ManchesterUnited));
        ArgentinaJugadores.add(new Jugador("Marcos", "Acuña", "Defensor", 8, Sevilla));
        ArgentinaJugadores.add(new Jugador("Nicolás","Tagliafico", "Defensor", 3, OlympiqueLyon));
        ArgentinaJugadores.add(new Jugador("Foyth","Juan", "Defensor", 2, VillaReal));


        //Se crean a los mediocampiststas convocados
        ArgentinaJugadores.add(new Jugador("Rodrigo", "De Paul", "Mediocampista", 7,AtleticoMadrid));
        ArgentinaJugadores.add(new Jugador("Leandro", "Paredes", "Mediocampista", 5, Juventus));
        ArgentinaJugadores.add(new Jugador("Alexis", "Mac Allister", "Mediocampista", 20, Brighton));
        ArgentinaJugadores.add(new Jugador("Guido", "Rodríguez", "Mediocampista", 18, RealBetis));
        ArgentinaJugadores.add(new Jugador("Alejandro", "Gómez", "Mediocampista", 17, Sevilla));
        ArgentinaJugadores.add(new Jugador("Enzo", "Fernández", "Mediocampista", 24, Sevilla));
        ArgentinaJugadores.add(new Jugador("Exequiel", "Palacios", "Mediocampista", 14, BayerLeverkusen));
        ArgentinaJugadores.add(new Jugador("Thiago", "Almada", "Mediocampista", 16, AtlantaUnited));


        // se crean a los delanteros convocados

        ArgentinaJugadores.add(new Jugador("Ángel", "Di María", "Delantero", 11, Juventus));
        ArgentinaJugadores.add(new Jugador("Lautaro", "Martinez", "Delantero", 22, Inter));
        ArgentinaJugadores.add(new Jugador("Julián", "Álvarez", "Delantero", 9, ManchesterCity));
        ArgentinaJugadores.add(new Jugador("Paulo", "Dybala", "Delantero", 21, Roma));
        ArgentinaJugadores.add(new Jugador("Ángel", "Correa", "Delantero", 16, AtleticoMadrid));
        ArgentinaJugadores.add(new Jugador("Lionel", "Messi", "Delantero", 10, PSG));

        //Se crea a la selección Argentina con todos sus atributos
        Seleccion ArgentinaSeleccion = new Seleccion("Argentina", Scaloni, Argentina, ArgentinaJugadores, 2);
        ArgentinaJugadores.sort(Comparator.comparing(Jugador::getNroJugador));
        System.out.println(ArgentinaSeleccion.getNombre());
        System.out.println(ArgentinaSeleccion.getTecnico());
        System.out.println(ArgentinaSeleccion.getPais());
        System.out.println(ArgentinaSeleccion.getRanking());
        for (Jugador x: ArgentinaJugadores) {
            System.out.println(x.toString());
        }


    }
}