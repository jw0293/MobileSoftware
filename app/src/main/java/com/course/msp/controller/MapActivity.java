package com.course.msp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.course.msp.MainActivity;
import com.course.msp.R;
import com.course.msp.domain.dto.Position;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Position position = new Position();
    private String curPos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.position);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Button saveButton = (Button) findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InputActivity.class);
                intent.putExtra("positionInfor", curPos);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        // 마커를 동국대로 위치시키고 카메라를 이동시킴
        LatLng dongguk = new LatLng(37.55827, 126.998425);
        mMap.addMarker(new MarkerOptions().position(dongguk).title("현 위치"));
        // 줌 기능 활성화
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        // 현재 위치로 이동
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dongguk));
        //줌 레벨 설정
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(@NonNull LatLng latLng) {
                MarkerOptions mOptions = new MarkerOptions();
                // 마커 타이틀
                mOptions.title("마커 좌표");
                Double latitude = latLng.latitude;
                Double longtitude = latLng.longitude;

                position.setLatitude(latitude.toString());
                position.setLongitude(longtitude.toString());

                Log.d("Info", latitude.toString() + " : " + longtitude.toString());

                // 마커의 텍스트 설정
                mOptions.snippet(latitude.toString() + ", " + longtitude.toString());

                mOptions.position(new LatLng(latitude, longtitude));
                googleMap.addMarker(mOptions);

                TextView showPosition  = (TextView) findViewById(R.id.showPosition);
                curPos = "위도 : " + latitude.toString() + " 경도 : " + longtitude.toString();
                showPosition.setText(curPos);
            }
        });

    }
}
