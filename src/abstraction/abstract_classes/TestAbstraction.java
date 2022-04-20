package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {
        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);


        int count = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null;
        for (Phone phone: phones) {
            System.out.println(phone);
            if (phone.isConvertible())count++;
            if (phone.price > max) mostExpensivePhone = phone;
        }

        System.out.println("The most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());
        System.out.println(count);

        System.out.println(Iphone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone phone : phones){
            phone.ring();
            phone.call();
            phone.text();
        }
    }
}
