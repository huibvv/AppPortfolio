package nl.idesign.appportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sportifyStreamerButton = (Button)findViewById(R.id.button_spotify_streamer);
        sportifyStreamerButton.setOnClickListener(mOnSpotifyClickListener);

        Button scoresAppButton = (Button)findViewById(R.id.button_scores_app);
        scoresAppButton.setOnClickListener(mOnScoresClickListener);

        Button libraryButton = (Button)findViewById(R.id.button_library_app);
        libraryButton.setOnClickListener(mOnLibraryClickListener);

        Button buildItBiggerButton = (Button)findViewById(R.id.button_build_it_bigger);
        buildItBiggerButton.setOnClickListener(mOnBuildItClickListener);

        Button xyzButton = (Button)findViewById(R.id.butten_xyz_reader);
        xyzButton.setOnClickListener(mOnXYZClickListener);

        Button capstoneButton = (Button)findViewById(R.id.button_capstone);
        capstoneButton.setOnClickListener(mOnCapstoneClickListener);
    }

    private View.OnClickListener mOnSpotifyClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"This buttons will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener mOnScoresClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"This buttons will launch my Scores App", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener mOnLibraryClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"This buttons will launch my Library App", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener mOnBuildItClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"This buttons will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener mOnXYZClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"This buttons will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener mOnCapstoneClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"This buttons will launch my Capstne App", Toast.LENGTH_SHORT).show();
        }
    };



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
