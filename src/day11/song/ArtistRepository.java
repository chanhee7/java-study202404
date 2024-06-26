package day11.song;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 가수객체 여러개를 관리 (조회, 수정, 삭제, 생성, 탐색, 정력 ...)
public class ArtistRepository {

    // 가수들을 담을 자료구조 선언
    // key: 가수이름, value: 가수 객체(가수명, 노래리스트)
    private Map<String, Artist> artistMap = new HashMap<>();


    public int count() {
        return artistMap.size();
    }

    /**
     * 주어진 가수명이 artistMap 에 저장되어 있는지 확인하는 메서드
     * @param singerName - 저장이 되었는지 확인할 가수의 이름
     * @return - map 에 저장된 가수라면 true, 아니라면 false
     */
    public boolean isRegistered(String singerName) {
        return artistMap.containsKey(singerName);
    }

    public void addNewArtist(String singerName, String songName) {
        // 주어진 정보를 map 에 저장
        Artist newArtist = new Artist(singerName); // 신규 가수 객체 생성
        // 첫번째 노래 songList 에 추가
        newArtist.addSong(songName);
        artistMap.put(singerName, newArtist);
    }

    public boolean addNewSong(String singerName, String songName) {
        // map 에서 기존 가수 정보를 가져옴
        Artist foundArtist = artistMap.get(singerName);
        // 이 가수의 노래리스트에 새 노래를 추가해줌
        return foundArtist.addSong(songName);
    }

    /**
     *  등록된 가수의 노래리스트를 반환하는 메서드
     * @param singerName - 가수 이름으로 map 에서 해당 가수 정보를 꺼내와서
     * @return - 그 가수 정보 안에 있는 노래리스트를 반환
     */
    public Set<String> getSongList(String singerName) {

        Artist foundArtist = artistMap.get(singerName);
        return foundArtist.getSongList();
    }

} // end class
