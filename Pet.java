public class Pet {

    private String name = "";

    private boolean clean;

    //contrutor
    public void pet(final String name){
        this.name =  name;
        this.clean = false;
    }

    
    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }
    
     public void setClean(boolean clean) {
        this.clean = clean;
    }


}