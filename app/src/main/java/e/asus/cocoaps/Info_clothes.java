package e.asus.cocoaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Info_clothes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_info_clothes);

        Bundle bundle = getIntent().getExtras();
    }
}
