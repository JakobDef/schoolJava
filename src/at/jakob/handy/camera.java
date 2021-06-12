package at.jakob.handy;

public class camera {
    private float resolution;

    public file makePicture(){
        return new file((int)(resolution*10));
    }


}
