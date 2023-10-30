class Super {
    int x;

    Super(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("Superclass x: " + x);
    }
}

class Subclass extends Super {
    int y;

    Subclass(int x, int y) {
        super(x); 
        this.y = y;
    }

    @Override
    void display() {
        super.display(); 
        System.out.println("Subclass y: " + y);
    }
}

class Superclass {
    public static void main(String[] args) {
        Subclass obj = new Subclass(100, 200);
        obj.display();
    }
}
