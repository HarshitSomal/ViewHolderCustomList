package harshit.viewholdercustomlist;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by R206 on 04-03-2016.
 */
public class ViewHolder {

    public TextView tvActorName;
    public  TextView tvactressName;
    public ImageView pic;

//This method help to set data from Actor into viewholder

    public void setDataIntoViewHolder(Actor actor){
        tvActorName.setText(actor.getActorName());
        tvactressName.setText(actor.getActressName());
        pic.setImageResource(actor.getPicName());
    }
}
