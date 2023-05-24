public class AdapterPatternDemo {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "Beyond the Horizon.mp3");
        audioPlayer.play("mp4", "Alone.mp4");
        audioPlayer.play("vlc", "Far Far Away.vlc");
        audioPlayer.play("avi", "Mind me.avi");
    }
}