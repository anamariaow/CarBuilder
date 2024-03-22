public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.setColore("Bianco");
        builder.setNumeroDiPorte(2);
        builder.setPropulsione("Benzina");
        builder.setTipo("Sportiva");
        Car macchina1 = builder.build();

        System.out.println("Macchina uno: " + macchina1);

//        Car macchina2 = new Car(4, "Rosso", "Diesel", "SUV");
//        System.out.println("Macchina due: " + macchina2);
        //aggiungendo un nuovo field si spacca CarBuilder e anche l'istanza macchina2 perché aggiungendo
        //al costruttore devo per forza riempire tutti i campi, mentre macchina1 no perché sono opzionali
    }
}