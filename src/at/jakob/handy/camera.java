package at.jakob.handy;

public class camera {
    private float resolution;

    public camera (int res){
        this.resolution = res;
    }

    public file makePicture(){
        return new file((int)(resolution*10));
    }


}
