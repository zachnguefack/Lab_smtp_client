package mail;

import java.util.LinkedList;
import java.util.List;

/*
 *@authors zacharie nguefack
 *description: cette classe spécifit toutes les actions que nous allons appliqueés sur nos membre de groupes 
 */
public class Group {
    
    
    private List<Person> groupMembers = new LinkedList<>();    

    public int size() {
        return groupMembers.size();
    }

    public boolean isEmpty() {
        return groupMembers.isEmpty();
    }

    public boolean contains(Person p) {
        return groupMembers.contains(p);
    }

    public void add(Person p) {
         groupMembers.add(p);
    }

    public void remove(Person p) {
       groupMembers.remove(p);
    }

    public void clear() {
        groupMembers.clear();
    }
    
    public List<Person> getMembers(){
       return groupMembers;
   }  
    
}
