public class Orioles{
    private String name;
    /**
     * @param name this is the name of the team
     */
    // Default constructer
    public Orioles(){}
    public Orioles(String name){
        this.name = name;
    }
    // Getter method for name
    public String getName(){
        return name;
    }
    // Setter method for name
    public void setName(String name){
        this.name = name;
    }
    // toString method to ouput
    public String toString(){
        return "The Team Name is: " + name;
    }
    // equals method to return true or not if they are equal
    public boolean equals(Orioles orioles){
        if(this.name.equals(orioles.name)){
            return true;
        }
        else{
            return false;
        }
    }
}