package by.it.shchur.at07;

public abstract class Var implements Operation{

    @Override
    public Var add(Var other) {
        System.out.println("Сложение "+this+" - "+other+" невозможно");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Сложение "+this+" - "+other+" невозможно");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Сложение "+this+" - "+other+" невозможно");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Сложение "+this+" - "+other+" невозможно");
        return null;
    }

    @Override
    public String toString() {
        return "Это абстрактая переменная";
    }
}
