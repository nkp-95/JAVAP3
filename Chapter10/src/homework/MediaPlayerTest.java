package homework;

import java.util.Scanner;

//인터페이스
interface Playable{
	
	void play();
	void stop();
	void pause();
	void volumeUp();
	void volumeDown();
	void nextTrack();
	void prevTrack();
	
}

class MediaPlayer implements Playable{
	//멤버변수
	private MediaType mediatype; //미디어 타입(음악, 동영상, 사진)
	//나머지 매개변수
	private int volume;
	private boolean isPlaying ;
	private int currentTrack;
	
	
	//생성자
	public MediaPlayer(MediaType mediaType) {
		this.mediatype = mediaType;
		volume = 50;
		isPlaying = false;
		currentTrack = 1;
	
		//나머지 초기화 volume, isPlaying, currentTrack
				
		
	}
	@Override
	public void play() {
	
		
		if(isPlaying == false) {
			System.out.println("미니어를 재생 합니다.");
		isPlaying = true;
			
		}
		
	}
	@Override
	public void stop() {
		
		
		if(isPlaying != false) {
			System.out.println("미디어를 중지합니다.");
			isPlaying = false;
		}else {
			System.out.println("중지된 미디어 입니다.");
		}
	}
	@Override
	public void pause() {

		if(isPlaying != false ) {
			System.out.println("미디어 일시정지");
			isPlaying = false;
		}
		
	}
	@Override
	public void volumeUp() {
		
		if(volume < 100) {
			System.out.println("볼륨을 올립니다.");
			volume++;
		}
		
	}
	@Override
	public void volumeDown() {
		if(volume > 0) {
			System.out.println("볼륨을 내립니다.");
			volume--;
		}
		
	}
	@Override
	public void nextTrack() {
		if(isPlaying == false) {
			System.out.println("다음 트랙 재생합니다");
		}else {
			System.out.println("멈춘 미디어를 건너 뜁니다.");
		}
		
	}
	@Override
	public void prevTrack() {
		if(isPlaying != false) {
			System.out.println("이전 트랙 재생합니다");
		}
		
	}
	public MediaType getMediatype() {
		return mediatype;
	}
	public void setMediatype(MediaType mediatype) {
		this.mediatype = mediatype;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isPlaying() {
		return isPlaying;
	}
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	public int getCurrentTrack() {
		return currentTrack;
	}
	public void setCurrentTrack(int currentTrack) {
		this.currentTrack = currentTrack;
	}

	
	//추상메서드 구현
	
	
	//겟터 셋터
	
	
}

enum MediaType{
	MUSIC, VIDEO, POTO
}


public class MediaPlayerTest {

	public static void main(String[] args) {
		//미디어 플레이어 테스트
		MediaPlayer player = new MediaPlayer(MediaType.MUSIC);

		player.play();
		player.pause();
		player.volumeUp();
		player.nextTrack();
		player.volumeDown();
		player.prevTrack();
		player.stop();
		
		System.out.println();
		System.out.println("현재 미디어 타입: " + player.getMediatype());
		System.out.println("현재 볼륨: " + player.getVolume());
		System.out.println("현재 재생중인지 여부: " + player.isPlaying());
		System.out.println("현재 재생중인 트랙: " + player.getCurrentTrack());

		
	}

}
