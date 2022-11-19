package com.example.bracalete;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {

    ImageView google_img;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        google_img=findViewById(R.id.google);

        gso= new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        gsc= GoogleSignIn.getClient(this,gso);

        google_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignIn();
            }
        });
    }

    private void SignIn() {

        Intent intent=gsc.getSignInIntent();
        startActivityForResult(intent,100);
    }

    //Esta comentado por que no funciona
    //@Override
    //protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
       // super.onActivityResult(requestCode, resultCode, data);

        //if (requestCode==100){
          //  Task<GoogleSignInAccount> task=GoogleSignIn.getSignedInAccountFromIntent(data);
           // try {
             //   task.getResult(ApiException.class);
               // Perfil();
           // } catch (ApiException e) {
             //   Toast.makeText(this,"Seleccione una cuenta",Toast.LENGTH_SHORT).show();
            //}

        //}
    //}

    public void Ingresar(View view){
        startActivity(new Intent(MainActivity.this, Perfil.class));
    }

}