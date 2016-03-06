package harshit.viewholdercustomlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class ActorAdapter extends ArrayAdapter <Actor> {
    List<Actor> Actorlist;
    LayoutInflater inflater;



    public ActorAdapter(Context context, int resource, List<Actor> objects) {
        super(context, resource, objects);

        Actorlist = objects;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
          //To set data in a listview using viewholder
            View view=convertView;
            ViewHolder viewHolder;
            if(view==null){
                view=inflater.inflate(R.layout.list_items,null);
                viewHolder=new ViewHolder();
                viewHolder.tvActorName=(TextView)view.findViewById(R.id.textView);
                viewHolder.tvactressName=(TextView)view.findViewById(R.id.textView2);
                viewHolder.pic=(ImageView)view.findViewById(R.id.imageView);
                view.setTag(viewHolder);
            }
            else{
                viewHolder=(ViewHolder)view.getTag();
            }

            Actor actor=Actorlist.get(position);
            viewHolder.setDataIntoViewHolder(actor);

            return view;
        }


    }

