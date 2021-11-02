class a {
    public void metodo(){
        System.out.println("a");
    }
}

class b extends a{
    public void metodo(){
        System.out.println("b");
        super.metodo();
    }

    public void metodo2() {
        System.out.println("c");
        metodo();//chama 'b' e 'a' por causa do metodo de 'b'
        super.metodo(); //chama 'b' e 'a' por causa do metodo de 'b', tmb chama 'a' da super
    }
}

public class testa {
    public static void main(String[] args) {
        b a1 = new b();
        a1.metodo();
        a1.metodo2();
    }
}