package Domain;

public class Utilizator {
    int id,age;
    String nume;
    String prenume;
    String adresa_e_mail;
    String numar_telefon;

    /**
     *  constructor with parameters
     * @param id - id (int)
     * @param age - vasrta (int)
     * @param nume - numele utilizatorului (String)
     * @param prenume - prenume utilizator (String)
     * @param adresa_e_mail - adresa de mail utilizator (String)
     * @param numar_telefon - numar telefon (String)
     */
    public Utilizator(int id, int age, String nume, String prenume, String adresa_e_mail, String numar_telefon) {
        this.id = id;
        this.age = age;
        this.nume = nume;
        this.prenume = prenume;
        this.adresa_e_mail = adresa_e_mail;
        this.numar_telefon = numar_telefon;
    }

    //getter
    /**
     * id getter
     * @return - int -> id
     */
    public int getId() {
        return id;
    }

    /**
     * age getter
     * @return - int -> varsta
     */
    public int getAge() {
        return age;
    }

    /**
     * nume getter
     * @return - String -> nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * prenume getter
     * @return - String -> prenume
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * e-mail getter
     * @return - String -> e-mail
     */
    public String getAdresa_e_mail() {
        return adresa_e_mail;
    }
    /**
     * nr telefon getter
     * @return - String -> nr telefon
     */
    public String getNumar_telefon() {
        return numar_telefon;
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "id=" + id +
                ", age=" + age +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", adresa_e_mail='" + adresa_e_mail + '\'' +
                ", numar_telefon='" + numar_telefon + '\'' +
                '}';
    }

    //setter
    /**
     * id setter
     * @param id(int) - id-ul utilizatorului
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * age setter
     * @param age(int) - varsta utilizatorului
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * nume setter
     * @param nume(String) - numele utilizatorului
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * prenume setter
     * @param prenume(String) - prenumele utilizatorului
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    /**
     * e-mail setter
     * @param adresa_e_mail(String) - adresa de mail a utilizatorului
     */
    public void setAdresa_e_mail(String adresa_e_mail) {
        this.adresa_e_mail = adresa_e_mail;
    }

    /**
     * numar_telefon setter
     * @param numar_telefon(String) - numarul de telefon a utilizatorului
     */
    public void setNumar_telefon(String numar_telefon) {
        this.numar_telefon = numar_telefon;
    }
}
