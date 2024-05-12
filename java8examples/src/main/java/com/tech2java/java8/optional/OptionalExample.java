package com.tech2java.java8.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * java.util.Optional
 * Optional.empty()
 * Optional.of(employee)
 * Optional.ofNullable(employee)
 * Optional.get()
 * Optional.ifPresent()
 * Optional.orElse()
 * Optional.map()
 * Optional.filter()
 * Optional.isPresent()
 * Optional.orElseGet
 * Optional.orElseThrow
 */
public class OptionalExample {

    public static void main(String[] args) {
        //Exception:Cannot invoke "String.toUpperCase()" because "strArray[5]" is null
        //beforeJava8();
        withJava8();
    }
    private static void beforeJava8(){
        String[] strArray=new String[10];
        String element=strArray[5].toUpperCase();
        System.out.println(element);
    }
    private static void withJava8(){

        String[] strArray=new String[10];
        strArray[5]="tech2java";

        Optional<String> empty  =Optional.empty();
        System.out.println(empty);

        //get
        Optional<String> value=Optional.of(strArray[5]);
        System.out.println(value);//Optional[tech2java]
        System.out.println(value.get());

        //strArray[4]  ==> no value present
        //ifPresent
        //orElese
        Optional<String> nullValue=Optional.ofNullable(strArray[4]);
        nullValue.ifPresent(x->System.out.println("Value::"+x));
        nullValue.ifPresent(System.out::println);
        System.out.println(nullValue.orElse("No value found!!"));

        //map
        Optional<String> nonEmptyString =Optional.of("tech2java");
        Optional<String> emptyString=Optional.empty();

        //flatmap (it will flaten the multiple layers of Options

        System.out.println("=============================================");
        Optional<Optional<String>> langOptional  =Optional.of(Optional.of("java"));
        System.out.println(langOptional.map(i->i.map(x->x.toUpperCase())));//Optional[Optional[JAVA]]
        System.out.println(langOptional.map(i->i.map(x->x.toUpperCase())).get());//Optional[JAVA]]
        System.out.println(langOptional.map(i->i.map(x->x.toUpperCase())).get().get());//[JAVA]]

        System.out.println(langOptional.flatMap(x->x.map(i->i.toUpperCase())));//Optional[JAVA]
        System.out.println(langOptional.flatMap(x->x.map(i->i.toUpperCase())).get());//[JAVA]
        System.out.println("=============================================");

        System.out.println(nonEmptyString.map(x->x.toUpperCase()));
        System.out.println(nonEmptyString.map(String::toUpperCase).get());
        System.out.println(emptyString.map(String::toUpperCase));

        //filter
        Optional<String> country=Optional.of("INDIA");
        Optional<String> emptyCountry=Optional.empty();

        System.out.println(country.filter(c->c.equals("india")));
        System.out.println(country.filter(c->c.equalsIgnoreCase("INDIA")));
        System.out.println(emptyCountry.filter(c->c.equalsIgnoreCase("INDIA")));

        //isPresent
        if(country.isPresent()){
            System.out.println("Value is available::"+country.get());
        }

        //orElseGet
        System.out.println(emptyCountry.orElseGet(()-> "No Country data available.."));

        //orElseThrow
        System.out.println(emptyCountry.orElseThrow(()-> new NoSuchElementException()));
        System.out.println(emptyCountry.orElseThrow(NoSuchElementException::new));

    }
}
