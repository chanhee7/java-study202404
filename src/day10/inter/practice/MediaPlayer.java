package day10.inter.practice;

import java.util.Arrays;

public // 미디어 플레이어 관리 클래스
class MediaPlayer {
    private MediaPlayable[] mediaList;

    public MediaPlayer() {
        this.mediaList = new MediaPlayable[0];
    }

    public void addMedia(MediaPlayable media) {
        // 주어진 media 를 mediaList 배열에 추가
        // 배열 복사 Arrays.copyOf (for 문 생략 가능)
        MediaPlayable[] temp = Arrays.copyOf(mediaList, mediaList.length + 1);

        temp[temp.length - 1] = media;
        this.mediaList = temp;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.play();
        }
    }
}
