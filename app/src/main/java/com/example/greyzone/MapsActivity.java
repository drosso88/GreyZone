package com.example.greyzone;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Esto nos ha autogenerado un código que nos daba la ubicación y marca de Sydney,
        //lo cambiamos para que sea madrid.
        LatLng madrid = new LatLng(40.4165, -3.70256);
        //le pasamos la posicion para la variable y el parámetro de la marca
        mMap.addMarker(new MarkerOptions().position(madrid).title("Madrid"));

        //marca para cuando encuentre una plaza de garaje en el mapa
        LatLng plazaGaraje = null; //no le asignamos posición de momento ya que la pedirá el usuario
        mMap.addMarker(new MarkerOptions().position(plazaGaraje).title("Plaza disponible").icon(BitmapDescriptorFactory.fromResource(R.drawable.gzicono)));

        //camara a la que añadimos zoom
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid, 8));

        //para que funcione el "+-" en el mapa al hacer zoom
        mMap.getUiSettings().setZoomControlsEnabled(true);

        //codigo autogenerado paraque funcione la ubcicacion del dispositivo y nos pida permiso
        googleMap.setOnCameraIdleListener((GoogleMap.OnCameraIdleListener) this);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }//para acceder a nuestra ubicación
        mMap.setMyLocationEnabled(true);

    }
    //le damos un evento a las marcas
    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }
}