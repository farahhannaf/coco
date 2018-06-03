package e.asus.cocoaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {
    CardView btnInterPria;
    CardView btnLokalPria;
    Button btnWanita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btnInterPria=(CardView)findViewById(R.id.btnInterPria);
        btnLokalPria=(CardView)findViewById(R.id.btnLokalPria);

        btnInterPria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Category.this,Clothes_coll.class);
                startActivity(intent);
            }
        });
        btnLokalPria.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Category.this,Clothes_coll.class);
                startActivity(intent);
            }
        });

    }
}
