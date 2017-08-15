package multdex.test.com.multdexdemotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.mmin18.methodpool2.A;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.testMulti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A a = new A();
                a.method_0();
            }
        });
    }
}
