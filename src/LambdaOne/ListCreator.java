package LambdaOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListCreator  <T> {

    List<T> mylist;

    public ListCreator(List<T> list){

        mylist = new ArrayList<>(list);

    }

    public static <T> ListCreator collectFrom(List<T> t){

        return new ListCreator<T>(t);
    }

    public ListCreator<T> when(Predicate predicate){
        Iterator myItr = mylist.iterator();

        T element;

        while(myItr.hasNext()){

            element = (T)myItr.next();

            if(!predicate.test(element)){
                myItr.remove();
            }

        }
        return this;
    }

    public List<T> mapEvery(Function function){

        Iterator myItr = mylist.iterator();

        T element;

        while(myItr.hasNext()){
            element = (T)myItr.next();
            mylist.set(mylist.indexOf(element), (T)function.apply(element));
        }

        return mylist;
    }

}
