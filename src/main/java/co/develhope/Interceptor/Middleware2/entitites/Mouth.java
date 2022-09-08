package co.develhope.Interceptor.Middleware2.entitites;



public class Mouth {
   private int mouthNumber;
   private String englishName;
   private String italianName;
   private String germanName;

   public Mouth(int mouthNumber,String englishName,String italianName,String germanName){
       this.mouthNumber=mouthNumber;
       this.englishName=englishName;
       this.germanName=germanName;
       this.italianName=italianName;
   }

   private Mouth(){
   }

    public int getMouthNumber() {
        return mouthNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getGermanName() {
        return germanName;
    }

    public String getItalianName() {
        return italianName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    public void setMouthNumber(int mouthNumber) {
        this.mouthNumber = mouthNumber;
    }
}
