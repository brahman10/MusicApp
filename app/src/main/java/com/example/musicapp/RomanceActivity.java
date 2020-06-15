package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RomanceActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);
        ArrayList<Musicc> Musicces = new ArrayList<Musicc>();

        // Adding Musicces to an array.
        Musicces.add(new Musicc("Arijit Singh", "Teri Meri Kahani"));
        Musicces.add(new Musicc("Arijit Singh", "Pachhtaoge"));
        Musicces.add(new Musicc("Arijit Singh", "Lambiyan Si Judaiyan"));
        Musicces.add(new Musicc("Arijit Singh", "Ishq Mubarak"));
        Musicces.add(new Musicc("Vilen", "Ek Raat"));
        Musicces.add(new Musicc("Jubin Nautiyal", "Chitthi"));
        Musicces.add(new Musicc("Sachet Tandon", "Bekhayali"));
        Musicces.add(new Musicc("B Praak", "Filhaal"));
        Musicces.add(new Musicc("Ved Sharma", "Malang(The Title Track)"));
        Musicces.add(new Musicc("Arijit Singh", "Tera Yaar Hoon"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        MusiccAdapter adapter = new MusiccAdapter(this, Musicces);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // play_list file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // Set OnClickListener on ListView to identify the item on ListView clicked by user
        // Text on the ListView item clicked is passed on to PlayerActivity
        listView.setOnItemClickListener(this);
    }

    /**
     * Method to identify ListView item clicked and launch PlayerActivity
     */
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        // Get the selected Musicc.
        Musicc currentMusicc = (Musicc) adapterView.getItemAtPosition(position);

        // Extract strings from Musicc object.
        String MusiccForPlaying = currentMusicc.getMusicc();
        String composerForPlaying = currentMusicc.getNameOfComposer();

        // Sending the name of composer and his Musicc to PlayerActivity.
        Intent MusiccIntent = new Intent(this, PlayingActivty.class);
        MusiccIntent.putExtra("Musicc", MusiccForPlaying);
        MusiccIntent.putExtra("composer", composerForPlaying);
        startActivity(MusiccIntent);
    }
}
