import java.util.*;
public class OriolesClient {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the team first name: ");
        String teamName1 = kb.nextLine();
        Orioles orioles1 = new Orioles();
        orioles1.setName(teamName1);
        System.out.println("Enter the second team name: ");
        String teamName2 = kb.nextLine();
        Orioles orioles2 = new Orioles(teamName2);
        System.out.println(orioles1.toString());
        System.out.println(orioles2.toString());
        System.out.println("TRUE or FALSE. Are both teams equal ? " + orioles1.equals(orioles2));
        kb.close();
    }
    
}