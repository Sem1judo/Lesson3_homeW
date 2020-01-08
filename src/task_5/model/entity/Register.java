package task_5.model.entity;

import java.util.ArrayList;

public class Register<T> {

    private ArrayList<Student> obj = new ArrayList<>();

    public Register() {

    }

    public Register(ArrayList<Student> obj) {
        this.obj = obj;
    }

    public ArrayList<Student> getObj() {
        return obj;
    }

    public void setObj(ArrayList<Student> obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Register{" +
                "obj=" + obj +
                '}';
    }
}

