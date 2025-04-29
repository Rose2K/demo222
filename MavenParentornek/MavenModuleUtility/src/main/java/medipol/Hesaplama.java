package medipol;

public class Hesaplama {

    
    public int topla(int a, int b) {
        return a + b;
    }

    public int cikar(int a, int b) {
        return a - b;
    }

    public int bol(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Bölme işlemi için payda sıfır olamaz.");
        }
        return a / b;
    }
}
