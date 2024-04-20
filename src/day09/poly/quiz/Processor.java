package day09.poly.quiz;

// 서브 클래스 Processor
public class Processor extends ComputerPart {

    public Processor(String partName, int partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Processor: " + partName + ", Price: " + partPrice);
    }
}
