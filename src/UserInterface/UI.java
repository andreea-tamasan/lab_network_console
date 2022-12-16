package UserInterface;

import Domain.Prietenie;
import Domain.Utilizator;
import Service.ServicePrietenie;
import Service.ServiceUtilizator;

import java.util.Scanner;

public class UI {
    ServiceUtilizator serviceUtilizator;
    ServicePrietenie servicePrietenie;

    /**
     * constructor default
     */
    public UI() {}

    /**
     * Constructor cu parametrii
     * @param serviceUtilizator - service utilizator
     * @param servicePrietenie - service prietenie
     */
    public UI(ServiceUtilizator serviceUtilizator, ServicePrietenie servicePrietenie) {
        this.serviceUtilizator = serviceUtilizator;
        this.servicePrietenie = servicePrietenie;
    }

    /**
     * meniu
     */
    public void run_menu(){
        boolean ok=true;
        Scanner sc = new Scanner(System.in);
        String option;
        while (ok){
            System.out.println();
            System.out.println("1. Acceseaza meniu utilizator.");
            System.out.println("2. Acceseaza meniu prietenie.");
            System.out.println("x. Exit.");

            System.out.println("Give option: ");
            option = sc.nextLine();
        switch (option){
            case "1":{
                ui_utilizator();
                break;
            }
            case "2":{
                ui_prietenie();
                break;
            }
            case "x":{
                ok = false;
                break;
            }
            default:
                System.out.println("Wrong option! Try again: ");
        }
    }}

    //utilizator --------------------------------------------------------
    /**
     * meniu utilizator
     */
    void ui_utilizator(){
        boolean ok=true;
        Scanner sc = new Scanner(System.in);
        String option;
        while (ok){
            System.out.println();
            System.out.println("1. Adauga utilizator.");
            System.out.println("2. Sterge utilizator.");
            System.out.println("3. Afiseaza utilizatori.");
            System.out.println("x. Exit.");
        System.out.println("Give option: ");
        option = sc.nextLine();
        switch (option){
            case "1":{
                ui_add_utilizator();
                break;
            }
            case "2":{
                ui_delete_utilizator();
                break;
            }
            case "3":{
                show_all();
                break;
            }
            case "x":{
                ok = false;
                break;
            }
            default:
                System.out.println("Wrong option! Try again: ");
        }
    }}

    /**
     * adauga utilizatorul
     */
    void ui_add_utilizator(){
        try{
        Scanner scanner=new Scanner(System.in);
        int id,varsta;
        String nume,prenume,adresa_de_mail,numar_telefon;
        System.out.println("Dati id utilizator: ");
        id = scanner.nextInt();
        System.out.println("Dati varsta utilizator: ");
        varsta = scanner.nextInt();
        System.out.println("Dati nume utilizator:");
        nume = scanner.next();
        System.out.println("Dati prenume utilizator");
        prenume = scanner.next();
        System.out.println("Dati adresa e-mail utilizator:");
        adresa_de_mail = scanner.next();
        System.out.println("Dati numar telefon utilizator: ");
        numar_telefon = scanner.next();

        Utilizator utilizator= new Utilizator(id,varsta,nume,prenume,adresa_de_mail,numar_telefon);
        serviceUtilizator.add(utilizator);}
        catch (Exception e){
            System.out.println("Eroare: ");
            System.out.println(e.getMessage());
        }
    }

    /**
     * sterge utilizatorii
     */
    void ui_delete_utilizator(){
        try{
            Scanner scanner=new Scanner(System.in);
            int id;
            System.out.println("Dati id de sters: ");
            id = scanner.nextInt();
            serviceUtilizator.delete(id);
        }
        catch (Exception e){
            System.out.println("Eroare: ");
            System.out.println(e.getMessage());
        }
    }

    /**
     * afiseaza utilizatorii
     */
    void show_all(){
        for(Utilizator utilizator: serviceUtilizator.get_all())
            System.out.println(utilizator);
    }

    //prietenie -----------------------------------------------------------
    /**
     * meniu prietenie
     */
    void ui_prietenie(){
        boolean ok=true;
        Scanner sc = new Scanner(System.in);
        String option;
        while (ok){
            System.out.println();
            System.out.println("1. Adauga prietenie.");
            System.out.println("2. Sterge prietenie.");
            System.out.println("3. Afiseaza prietenii.");
            System.out.println("x. Exit.");
            System.out.println("Give option: ");
            option = sc.nextLine();
            switch (option){
                case "1":{
                    ui_add_prietenie();
                    break;
                }
                case "2":{
                    ui_delete_prietenie();
                    break;
                }
                case "3":{
                    show_all_prietenie();
                    break;
                }
                case "x":{
                    ok = false;
                    break;
                }
                default:
                    System.out.println("Wrong option! Try again: ");
            }
        }
    }

    /**
     * adauga prietenie
     */
    void ui_add_prietenie(){
        try{
            Scanner scanner=new Scanner(System.in);
            int id,id_utilizator1,id_utilizator2;
            String mesaj;
            System.out.println("Dati id prietenie: ");
            id = scanner.nextInt();
            System.out.println("Dati id-ul primului utilizator: ");
            id_utilizator1 = scanner.nextInt();
            System.out.println("Dati id-ul la al doilea utilizator:");
            id_utilizator2 = scanner.nextInt();
            System.out.println("Dati mesajul: ");
            mesaj = scanner.next();

            Prietenie prietenie= new Prietenie(id,id_utilizator1,id_utilizator2,mesaj);
            servicePrietenie.add(prietenie);
        }
        catch (Exception e){
            System.out.println("Eroare: ");
            System.out.println(e.getMessage());
        }

    }

    /**
     * sterge prietenie
     */
    void ui_delete_prietenie(){
        try{
            Scanner scanner=new Scanner(System.in);
            int id;
            System.out.println("Dati id de sters: ");
            id = scanner.nextInt();
            servicePrietenie.delete(id);
        }
        catch (Exception e){
            System.out.println("Eroare: ");
            System.out.println(e.getMessage());
        }

    }

    /**
     * afiseaza prieteniile
     */
    void show_all_prietenie(){
        for(Prietenie prietenie: servicePrietenie.get_all())
            System.out.println(prietenie);

    }
}

