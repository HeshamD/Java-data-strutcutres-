import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List colors = new ArrayList();

        // Adding
        colors.add("blue");
        colors.add("purple");
        colors.add(1);
        colors.add(new Object());

        //creating
        List<String> colors1 = new ArrayList<String>();

        //Inserting // adding
        colors1.add("blue");
        colors1.add("purple");
        colors1.add("pink");
        colors1.add("yellow");

        // to check for the size // get size
        System.out.println(colors1.size());

        //check for an element // Search
        System.out.println(colors1.contains("yellow"));

        //print //display
        System.out.println(colors1);

        //loop through the list

        for(String color:colors1)
        {
            System.out.println(color);
        }

        //to access to it's index itself
        for(int i=0; i<colors.size();i++)
        {
            System.out.println(colors1.get(i));
        }

    }
}
