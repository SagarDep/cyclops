package patterns;

import cyclops.function.Predicates;
import patterns.Person.Female;
import patterns.Person.Male;
import org.junit.Test;

import java.util.Optional;

import static cyclops.function.Predicates.*;
import static patterns.CaseClass1._CASE_;
import static patterns.CaseClass2._CASE_;
//import static patterns.Person.Female.female;
//import static patterns.Person.Male.male;

/**
 * Created by johnmcclean on 11/08/2017.
 */
public class CaseTest {
/**
    @Test
    public void test(){

        //match on type, have to handle both cases
        Female.female("alice",41)
                .match(m->"male",f->"female");

        //female

       Optional<String> hello = Male.male("bob",30)
                                    .one(t2-> t2.limit1())
                                    .match(_CASE_(name->name.equals("bob"), name->"hello"));


        //matching solely on the fields
        int res =  Male.male("bob",30).matchWhen((name, age)->-1,
                                                        _CASE_( when((String name, Integer age) -> age>21)
                                                                        .and(_1(in("bob","alice"))),(name, age)->age+30),

                                                        _CASE_((String name,Integer age)-> age<50,(name, age)->age-40),

                                                        _CASE_(when(Predicates.<String,Integer>_2(greaterThan(60))),(name, age)->44));


        //30


        //match on both type and fields
        String res2 =Female.female("alice",41)
                            .match(male->male.matchWhen((name,age)->"male unknown",
                                                  _CASE_((String name, Integer a)-> a>21, (name,age)->"male over 21")),
                                    female->"female");
        //female
    }
    **/
}
