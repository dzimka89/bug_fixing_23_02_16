package com.bugs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionProblem1 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class userClass = Class.forName(User.class. getName());
        Method[] methods = userClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Constructor constructor = userClass.getConstructor(String.class, String.class, int.class, String.class); // I found only one way to make it work using original code is to make the default
        Object o = constructor.newInstance("name", "surname", 1, "companyName");                                 // constructor in User. The other way to send arguments is using the Constructor class.
        if (o instanceof User){                                                                                  // Am I right?)
            User user = (User) o;
            user.getName();
            user.getSurName();
        }

//        Object object = userClass.newInstance("name", "surname", 1, "companyName");
//        if (object instanceof User) {
//            User user = (User) object;
//            user.getName();
//            user.getSurName();
//        }

    }

}


