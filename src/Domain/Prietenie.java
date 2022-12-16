package Domain;

public class Prietenie {
    int id;
    int id_prietenie_trimisa;
    int id_prietenie_primita;
    String mesaj;

    /**
     *  constructor with parameters
     * @id - id (int)
     * @param id_prietenie_primita (int)- id-ul prietenie primite
     * @param id_prietenie_trimisa (int)- id-ul prieteniei trimise
     * @param mesaj (String)- mesaj ul  trimis
     */
    public Prietenie(int id, int id_prietenie_trimisa, int id_prietenie_primita, String mesaj) {
        this.id = id;
        this.id_prietenie_trimisa = id_prietenie_trimisa;
        this.id_prietenie_primita = id_prietenie_primita;
        this.mesaj = mesaj;
    }

    //getter and setter
    /**
     * id getter
     * @return - int -> id
     */
    public int getId() {
        return id;
    }

    /**
     * id setter
     * @param id - id-ul prieteniei
     */
    public void setId(int id) {this.id = id;}

    /**
     * id prietenie trimisa getter
     * @return - int -> id
     */
    public int getId_prietenie_trimisa() {
        return id_prietenie_trimisa;
    }

    /**
     * id setter
     * @param id_prietenie_trimisa - id-ul prieteniei trimise
     */
    public void setId_prietenie_trimisa(int id_prietenie_trimisa) {
        this.id_prietenie_trimisa = id_prietenie_trimisa;
    }

    /**
     * id prietenie primita getter
     * @return - int -> id
     */
    public int getId_prietenie_primita() {
        return id_prietenie_primita;
    }

    /**
     * id setter
     * @param id_prietenie_primita - id-ul prieteniei primite
     */
    public void setId_prietenie_primita(int id_prietenie_primita) {
        this.id_prietenie_primita = id_prietenie_primita;
    }

    /**
     * mesaj getter
     * @return - String -> mesaj
     */
    public String getMesaj() {
        return mesaj;
    }

    /**
     * mesaj setter
     * @param mesaj - mesajul trimis
     */
    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    //to string
    /**
     * @return - prietenie
     */
    @Override
    public String toString() {
        return "Prietenie{" +
                "id=" + id +
                ", id_prietenie_trimisa=" + id_prietenie_trimisa +
                ", id_prietenie_primita=" + id_prietenie_primita +
                ", mesaj='" + mesaj + '\'' +
                '}';
    }
}
