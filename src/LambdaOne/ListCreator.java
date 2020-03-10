//package LambdaOne;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class ListCreator  <T> {
//
//    List<T> mylist;
//
//    public ListCreator(List<T> list){
//
//        mylist = new ArrayList<>(list);
//
//    }
//
//    public static <T> ListCreator collectFrom(List<T> t){
//
//        return new ListCreator<T>(t);
//    }
//
//    public ListCreator<T> when(Selector sel){
//        Iterator myItr = mylist.iterator();
//
//        T element;
//
//        while(myItr.hasNext()){
//
//            element = (T)myItr.next();
//
//            if(!sel.select(element)){
//                myItr.remove();
//            }
//
//        }
//        return this;
//    }
//
//    public List<T> mapEvery(Mapper map){
//
//        Iterator myItr = mylist.iterator();
//
//        T element;
//
//        while(myItr.hasNext()){
//            element = (T)myItr.next();
//            mylist.set(mylist.indexOf(element), (T)map.map(element));
//        }
//
//        return mylist;
//    }
//
//}
