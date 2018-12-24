package tk.alltrue.mybrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FirstAct extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

    }
    public void onClick(View view) {
        Intent intent = new
                Intent("tk.alltrue.Browser");
        intent.setData(Uri.parse("http://alltrue.tk/"));
        startActivity(intent);
    }
}
