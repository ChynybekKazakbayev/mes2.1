    public class Pet {
    private int age = generateDefaultAge();
    private  Color color;
    private Shelter shelter;

    public Pet () {}
    private int generateDefaultAge(){
        return 10;
    }
    public String getInfo(){
    return    age + " " + " " + color +" " + " "+ shelter.getName() +" "+  shelter.getAdress();

    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }
}
