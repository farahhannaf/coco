package e.asus.cocoaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ScrollView;

public class Clothes_coll extends AppCompatActivity {

    CardView btnCol1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes_coll);

        Bundle bundle = getIntent().getExtras();

        btnCol1=(CardView)findViewById(R.id.col1);
        btnCol1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Clothes_coll.this,Info_clothes.class);
                startActivity(intent);
            }
        });

    }
}
