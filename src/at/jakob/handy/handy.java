package at.jakob.handy;

public class handy {
    private String color;
    private sim sim;
    private camera cam;
    private sd sd;

    public handy(String color, sim sim, camera cam, sd sd){
        this.color = color;
        this.sim = sim;
        this.cam = cam;
        this.sd = sd;
    }

    public void takePicture(){
        this.sd.saveFile(this.cam.makePicture());
    }

    public void makeCall(String tel){
        this.sim.doCall(tel);
    }

    public int getFreeSpace(){
        return this.sd.getFreeSpace();
    }

}
