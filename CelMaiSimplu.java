package Facts;

public class CelMaiSimplu {

    public static void main(String[] args) {
        System.out.println("Begin");
        int a = 1;
        int b = 12;
        int c = 123;
        int d = 1234;
        int e = 12345;
        int f = 123456;
        int h = 1234567;
        int g = 12345678;
        int y = 123456789;
        int u = 9;
        int a1 = 2;
        int b1 = 3;
        int c1 = 4;
        int d1 = 5;
        int e1 = 6;
        int f1 = 7;
        int h1 = 8;
        int g1 = 9;
        int y1 = 10;

        int one = one(a,u,a1);
        System.out.println(a+" x "+u+" + "+a1+" = "+one);
        int two = two(b,u,b1);
        System.out.println(b+" x "+u+" + "+b1+" = "+two);
        int three = three(c,u,c1);
        System.out.println(c+" x "+u+" + "+c1+" = "+three);
        int four = four(d,u,d1);
        System.out.println(d+" x "+u+" + "+d1+" = "+four);
        int five = five(e,u,e1);
        System.out.println(e+" x "+u+" + "+e1+" = "+five);
        int six = six(f,u,f1);
        System.out.println(f+" x "+u+" + "+f1+" = "+six);
        int seven = seven(h,u,h1);
        System.out.println(h+" x "+u+" + "+h1+" = "+seven);
        int eight = eight(g,u,g1);
        System.out.println(g+" x "+u+" + "+g1+" = "+eight);
        int nine = nine(y,u,y1);
        System.out.println(y+" x "+u+" + "+y1+" = "+nine);
        System.out.println("Ehd");
        System.out.println("                                to be continue....");
    }

    private static int nine(int y, int u, int y1) {
        return y*u+y1;
    }

    private static int eight(int g, int u, int g1) {
        return g*u+g1;
    }

    private static int seven(int h, int u, int h1) {
        return h*u+h1;
    }

    private static int six(int f, int u, int f1) {
        return f*u+f1;
    }

    private static int five(int e, int u, int e1) {
        return e*u+e1;
    }

    private static int four(int d, int u, int d1) {
        return d*u+d1;
    }

    private static int three(int c, int u, int c1) {
        return c*u+c1;
    }

    private static int two(int b, int u, int b1) {
        return b*u+b1;
    }

    private static int one(int a, int u, int a1) {
        return a*u+a1;
    }
}
