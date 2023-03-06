public class Student {
    private String name;
    private int matrikelnummer;
    private int semestreCount;

    public String getName (){
        return name;
    }
    public int getMatrikelnummer(){
        return matrikelnummer;
    }
    public int getSemestreCount(){
        return semestreCount;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setMatrikelnummer (int newMatrikelnummer)
    {
        matrikelnummer = newMatrikelnummer;
    }

    public void setSemestreCount(int newSemestreCount) {
        semestreCount = newSemestreCount;
    }
}
