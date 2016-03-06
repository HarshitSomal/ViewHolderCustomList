package harshit.viewholdercustomlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Actor> Actorlist;
    //Creat Data & use arrayAdpater to set data to ListView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Actorlist = new ArrayList<>();
        Actorlist.add(new Actor(R.drawable.harshit,"Mona", "Harshit"));
        Actorlist.add(new Actor(R.drawable.harshit, "pooja", "Harsh"));
        Actorlist.add(new Actor(R.drawable.harshit, "Susan", "Sonu Nigam"));
        Actorlist.add(new Actor(R.drawable.harshit, "pooja", "Sonia"));


        ListView listv=(ListView)findViewById(R.id.listView);
        ActorAdapter adapter=new ActorAdapter(this,R.layout.list_items,Actorlist);
        listv.setAdapter(adapter);





    }



}
