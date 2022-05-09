package iftm.edu.br.iblood;

import androidx.fragment.app.FragmentActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Localizacoes extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacoes);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        setTitle(getIntent().getStringExtra("MESSAGE0"));
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng hemo_ura = new LatLng(-19.7568086, -47.932933);
        mMap.addMarker(new MarkerOptions().position(hemo_ura).title("Hemocentro de Uberaba"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hemo_ura, 13));

        LatLng hemo_franca = new LatLng(-20.5192955,-47.396441);
        mMap.addMarker(new MarkerOptions().position(hemo_franca).title("Hemocentro de Franca"));

        LatLng my_position = new LatLng(-19.7186233,-47.9599519);
        mMap.addMarker(new MarkerOptions().position(my_position).title("Sua Atual Localização"));
    }
}
