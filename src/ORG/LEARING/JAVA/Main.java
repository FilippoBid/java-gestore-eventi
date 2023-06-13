package ORG.LEARING.JAVA;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean okLetsGo =false;
    do {

        try {
            Scanner scan = new Scanner(System.in);
            String title;
            LocalDate date;
            int chairs;
            System.out.println("inserisi il nome del nuovo evento");
            title = scan.nextLine();
            System.out.println("inserisci la data dell'evento nel seguente formato anno-mese-giorno");
            date = LocalDate.parse(scan.nextLine());
            System.out.println("inserisci il numero di posti");
            chairs = scan.nextInt();
            Event event = new Event(title,date,chairs);
            System.out.println("evento generato correttamente");
            System.out.println(event.toString());
            System.out.println("quante prenotazioni vuoi fare?");
            int n = scan.nextInt();
            for (int i=0;i<n;i++){
                event.reserve();
            }
            System.out.println(event.getBookedChairs());
            System.out.println((event.getChairs())-event.getBookedChairs());
            System.out.println("quante prenotazioni vuoi cancellare?");
            n = scan.nextInt();
            for (int i=0;i<n;i++){
                event.delReserv();
            }
            System.out.println(event.getBookedChairs());
            System.out.println((event.getChairs())-event.getBookedChairs());

            okLetsGo = true;
        } catch (IllegalArgumentException | IllegalStateException e){
            System.out.println(e.getMessage());
        }catch (DateTimeParseException e){
            System.out.println("inserisci i dati corretttamente");
        };





    }while(!okLetsGo);



    }
}
