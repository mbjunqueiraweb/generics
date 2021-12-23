 package Generics;

 import java.util.Arrays;
 import java.util.ArrayList;
// import java.util.List;

 public class Main{

        public static void main(String[] args) {

            Pessoa p1 = new Pessoa("Maria", "02020202020");
            Pessoa p2 = new Pessoa("Jose", "02020202021");
            Pessoa p3 = new Pessoa("Alberto", "02020202031");

            Celular c1 = new Celular(100089345L, "Jose");
            Celular c3 = new Celular(100089378L, "Maria");
            Celular c2 = new Celular(100089367L, "Alberto");

            Pessoa[] arr = {p1, p2, p3};
            SortUtil.sort(arr);
            for(Pessoa p: arr) {
                System.out.println(p);
            }
            Celular[] celarr = {c1, c3, c2};
            SortUtil.sort(celarr);
            for(Celular c: celarr) {
                System.out.println(c);
            }

        }

}
