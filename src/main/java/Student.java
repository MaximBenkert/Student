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

    public void setName(String name){
        this.name = name;
    }

    public void setMatrikelnummer (int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public void setSemestreCount(int semestreCount) {
        this.semestreCount = semestreCount;
    }

    public String toString  () {
        return (this.name + " " + this.matrikelnummer + " " + this.semestreCount);
    }

    public Student(){

    }
    public Student (String name, int matrikelnummer, int semestreCount){
        this.matrikelnummer = matrikelnummer;
        this.name = name;
        this.semestreCount = semestreCount;
    }
}
