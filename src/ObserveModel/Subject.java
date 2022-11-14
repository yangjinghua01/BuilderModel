package ObserveModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject{
    private final List<Observer> observerList = new ArrayList<>();
    /**
     * 新增订阅者Observer
     */
    public boolean attach(Observer observer){
        System.out.println("添加了观察者");
        return observerList.add(observer);
    }
    public boolean detach(Observer observer){
        return observerList.remove(observer);
    }
    protected void notifyObservers(){
        if (observerList.isEmpty()){
            return;
        }
        for (Observer observer : observerList){
            observer.priceChanged(this);
        }
    }
}
