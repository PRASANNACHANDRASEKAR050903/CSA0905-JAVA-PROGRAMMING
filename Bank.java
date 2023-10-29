class Bank {
    double getRateOfInterest() {
        return 0.0; // Default implementation, to be overridden by specific banks
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 8.4;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 7.3;
    }
}

class AXIS extends Bank {
    double getRateOfInterest() {
        return 9.7;
    }
}

public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("Rate of Interest from SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of Interest from ICICI: " + icici.getRateOfInterest() + "%");
        System.out.println("Rate of Interest from AXIS: " + axis.getRateOfInterest() + "%");
    }
}