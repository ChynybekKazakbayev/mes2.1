public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();

        Shelter sh = new Shelter("Dobrye ruki", "Kievskaya 5" );
        d.setShelter(sh);
        d.setColor(Color.BROWN);


        System.out.println(d.getInfo());
        Dog d2 = new Dog("Reks" , "Haski" , Color.BLASK, new Shelter("Dobrey ruki","Kievskaya 5"));
    }




}

