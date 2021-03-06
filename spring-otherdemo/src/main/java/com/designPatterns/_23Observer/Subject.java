package com.designPatterns._23Observer;

public interface Subject {
    /**
     * 增加观察者
     */
    void add(Observer observer);

    /**
     * 删除观察者
     */
    void del(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();

    /**
     * 自身的操作
     */
    void operation();

}
