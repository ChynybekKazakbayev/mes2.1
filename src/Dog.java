public final class  Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;

    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.setColor(color);
        this.setShelter(shelter);
        this.commands = commands;
    }

    public void makeVoice(){
        System.out.println("Gav");

    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }
    public void makeVoice (String voice,int namber){
        for (int i=0;i<namber;i++){
        System.out.println(voice);}
    }
    public String getInfo(){
        return getName()+getBreed()+commands+super.getInfo();
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }
}
