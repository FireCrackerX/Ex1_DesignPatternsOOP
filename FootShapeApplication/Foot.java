package FootShapeApplication;

import java.util.Scanner;

public class Foot {
    private FootShape footShape;

    public Foot(FootShape fs){
        this.footShape = fs;
    }

    public void draw(int type) {
        switch (type) {
            case 1:
                footShape.drawAsEllipse();
                break;
            case 2:
                footShape.drawAsRectangle();;
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FootShape fs = new FootShape();
        Foot foot = new Foot(fs);

        System.out.print("Please choose shape type 1. Ellipse, 2. Rectangle : ");
        int type = sc.nextInt();

        foot.draw(type);

        sc.close();
    }
}
