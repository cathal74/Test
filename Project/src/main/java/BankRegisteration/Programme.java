package BankRegisteration;

import java.util.*;
import org.joda.time.DateTime;


/**
 *
 * @author fergalbroderick
 */
public class Programme {

    private String Name;
    private ArrayList<Module> Modules;
    private DateTime Start;
    private DateTime End;

    public Programme(String name, DateTime start, DateTime end){

        this.Name = name;
        this.Start = start;
        this.End = end;
        this.Modules = new ArrayList();
    }

    //getters and setters
    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        this.Name = Name;
    }


    public DateTime getStart() {
        return Start;
    }


    public void setStart(DateTime Start) {
        this.Start = Start;
    }


    public DateTime getEnd() {
        return End;
    }

    public ArrayList<Module> getModules(){
        return Modules;
    }


    public void setEnd(DateTime End) {
        this.End = End;
    }

    //add and remove modules
    public void addModule(Module mod){
        Modules.add(mod);

    }

    public void deleteModule(Module mod){
        Modules.remove(mod);
    }

    @Override
    public String toString(){
        return "Course: " + this.Name;

    }
}

