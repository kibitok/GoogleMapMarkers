package com.midterm;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    // Starting the coordinates Strings

    private static final LatLng Thai = new LatLng(-1.2885061,36.8192397);
    private static final LatLng Tin = new LatLng(-1.2895481,36.8209602);
    private static final LatLng Kilimanjaro = new LatLng(-1.2878796,36.817894);
    private static final LatLng Bhandini = new LatLng(-1.2903792,36.8177583);
    private static final LatLng JavaHouse = new LatLng(-1.2883569,36.823042);
    private static final LatLng Hamdi = new LatLng(-1.2883071,36.8225929);
    private static final LatLng Berbers = new LatLng(-1.2902842,36.8237106);
    private static final LatLng Smothers = new LatLng(-1.2878401,36.8182002);
    private static final LatLng Ankara = new LatLng(-1.2883561,36.820183);
    private static final LatLng Angithi = new LatLng(-1.2898624,36.8235066);


    //Creating Markers
    private Marker mThai;
    private Marker mTin;
    private Marker mKilimanjaro;
    private Marker mBhandini;
    private Marker mJavaHouse;
    private Marker mHamdi;
    private Marker mBerbers;
    private Marker mSmothers;
    private Marker mAnkara;
    private Marker mAngithi;
    //private Marker mThai;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

        // Add a marker in Sydney and move the camera
       // LatLng sydney = new LatLng(-34, 151);
        mThai= mMap.addMarker(new MarkerOptions()
                .position(Thai)
                .title(" Thai Chi Restaurant"));
        mAngithi=mMap.addMarker(new MarkerOptions()
                .position(Angithi)
                .title("Anghiti Restaurant"));
        mAnkara= mMap.addMarker(new MarkerOptions()
                .position(Ankara)
                .title("Ankara Food Court"));
        mTin=mMap.addMarker(new MarkerOptions()
                .position(Tin)
                .title("Tin Tin Restaurant"));
        mKilimanjaro= mMap.addMarker(new MarkerOptions()
                .position(Kilimanjaro)
                .title("Kilimanjaro Jamia"));
        mBhandini=mMap.addMarker(new MarkerOptions()
                .position(Bhandini)
                .title("Bhandini Indian Restaurant"));
        mJavaHouse= mMap.addMarker(new MarkerOptions()
                .position(JavaHouse)
                .title("Java House - Mama Ngina S"));
        mHamdi=mMap.addMarker(new MarkerOptions()
                .position(Hamdi)
                .title("Hamdi Cuisine & Cafe"));
        mBerbers= mMap.addMarker(new MarkerOptions()
                .position(Berbers)
                .title("Berbers Oasis"));
        mSmothers=mMap.addMarker(new MarkerOptions()
                .position(Smothers)
                .title("Smothers Restaurant"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Hamdi,25));
    }
}
