# GoogleMapMarkers


the applications helps to load trackers of different places. 


## **ADDING COORDINATES AS LATITUDES AND LONGITUDES**

We use the following code to create markers position

```
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
```


## adding Markers to Map

we add markers to the map through

```
mThai= mMap.addMarker(new MarkerOptions().position(Thai).title(" Thai Chi Restaurant"));
mAngithi=mMap.addMarker(new MarkerOptions().position(Angithi).title("Anghiti Restaurant"));
mAnkara= mMap.addMarker(new MarkerOptions().position(Ankara).title("Ankara Food Court"));
        
```

## Setting the Zoom level


we set the zoom level by adding the following code

```
mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Hamdi,25));
```
![Markers](Screenshot_20190303-153934.png)

## Adding Googlr Map api
```
<string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">*****</string>
```

## add internet and location permissions



```
 <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
 <uses-permission-sdk-23 android:name="android.permission.INTERNET"/>
```
## add fonts
 
 this is done by adding font resource file and calling it on the layout.
 
 ## add layout design
 ![LAYOUT](Screenshot_20190417-085543[1].png)
 
 ```
 <?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
tools:context=".SignUpActivity">


<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    android:background="@drawable/shalom">

    <ImageView
        android:layout_width="85dp"
        android:layout_height="100dp"
        android:layout_centerHorizontal="true"
        android:layout_centerVertical="true"
        android:background="@drawable/app_logo" />

</RelativeLayout>


<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    android:background="@drawable/blowdry">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerVertical="true"
        android:orientation="vertical"
        android:paddingLeft="15dp"
        android:paddingRight="15dp">

        <EditText
            android:id="@+id/editTextEmail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:fontFamily="@font/dancing"
            android:hint="email"
            android:inputType="textEmailAddress"
            android:paddingBottom="15dp"
            android:background="@drawable/rectangle"
            android:textColorHint="@color/colorAccent" />

        <EditText
            android:id="@+id/editTextPassword"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:fontFamily="@font/dancing"
            android:hint="password"
            android:inputType="textPassword"
            android:paddingBottom="15dp"
            android:textColorHint="@color/colorAccent"
            android:background="@drawable/rectangle"/>

        <Button
            android:id="@+id/buttonSignUp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:layout_margin="7dp"
            android:background="@drawable/rectangle"
            android:text="Sign Up"
            android:textAllCaps="false"
            android:fontFamily="@font/dancing"
            android:textColor="@color/colorAccent" />

        <TextView
            android:id="@+id/textViewLogin"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="15dp"
            android:text="Already have an account? Login"
            android:fontFamily="@font/dancing"
            android:textAlignment="center"
            android:textAppearance="@style/Base.TextAppearance.AppCompat.Medium"
            android:textColor="@color/colorAccent" />


    </LinearLayout>

    <ProgressBar
        android:id="@+id/progressbar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_centerVertical="true"
        android:visibility="gone" />


</RelativeLayout>


</LinearLayout>

 ```
