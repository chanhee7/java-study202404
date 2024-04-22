package day10.inter.practice;

public class ImageDisplay implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지 재생이 일시정지됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지 재생이 중지됩니다.");
    }
}
