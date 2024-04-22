package day10.inter.practice;

public class AudioPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("오디오가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("오디오 재생이 일시정지 됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("오디오 재생이 중지됩니다.");
    }
}
