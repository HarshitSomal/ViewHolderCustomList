package harshit.viewholdercustomlist;

/**
 * Created by R206 on 05-03-2016.
 */
public class Actor {

    int PicName;
    String ActorName;
    String ActressName;

    public Actor(int picName, String actorName, String actressName) {
        PicName = picName;
        ActorName = actorName;
        ActressName = actressName;
    }



    public int getPicName() {
        return PicName;
    }

    public void setPicName(int picName) {
        PicName = picName;
    }

    public String getActorName() {
        return ActorName;
    }

    public void setActorName(String actorName) {
        ActorName = actorName;
    }

    public String getActressName() {
        return ActressName;
    }

    public void setActressName(String actressName) {
        ActressName = actressName;
    }
}
