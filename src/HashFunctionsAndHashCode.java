import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashFunctionsAndHashCode {
    public static void main(String[] args) {
        Map<Person,Diamond> map = new HashMap<>();

        map.put(new Person("Jamila"),new Diamond("A Diamond"));

        //get the value of this key
        map.get(new Person("Jamila"));

        String s ="s;";


    }
    record Person(String name){
        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if (obj ==null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return Objects.equals(name,person.name);
        }
    }
    record Diamond(String name){}
}
