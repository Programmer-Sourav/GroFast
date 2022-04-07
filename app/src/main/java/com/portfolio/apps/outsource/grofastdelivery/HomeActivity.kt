package com.portfolio.apps.outsource.grofast

import android.graphics.Color
import android.graphics.Color.green
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.ImageViewCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.portfolio.apps.outsource.grofast.fragment.DisplayFragment
import com.portfolio.apps.outsource.grofastdelivery.R
import com.portfolio.apps.outsource.grofastdelivery.di.Injection
import com.portfolio.apps.outsource.grofastdelivery.viewmodel.GroFastProductsViewModel


class HomeActivity : AppCompatActivity() {

    lateinit var searchView: SearchView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home);


        val welcomeText : TextView = findViewById(R.id.welcome_text);
        val usernameText: TextView = findViewById(R.id.username_text);
        val userProfilePic: ImageView = findViewById(R.id.userprofile);
        searchView = findViewById(R.id.search_bar);
        val all : TextView = findViewById(R.id.all);
        val vegetable :  TextView = findViewById(R.id.vegetables);
        val fruits: TextView = findViewById(R.id.fruit);
        val meat : TextView = findViewById(R.id.meat);
        val diary: TextView = findViewById(R.id.diary);


        usernameText.setText("Sourav Nath");

        replaceFragment();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            all.setTextColor(getColor(R.color.green))
        }
        else{
            all.setTextColor(Color.parseColor("#4caf50"))
        }

        all.setOnClickListener{

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                all.setTextColor(getColor(R.color.green))
            }
            else{
                all.setTextColor(Color.parseColor("#4caf50"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                vegetable.setTextColor(getColor(R.color.grey))
            }
            else{
                vegetable.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                fruits.setTextColor(getColor(R.color.grey))
            }
            else{
                fruits.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                meat.setTextColor(getColor(R.color.grey))
            }
            else{
                meat.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                diary.setTextColor(getColor(R.color.grey))
            }
            else{
                diary.setTextColor(Color.parseColor("#78909c"))
            }

        }

        vegetable.setOnClickListener{

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                vegetable.setTextColor(getColor(R.color.green))
            }
            else{
                vegetable.setTextColor(Color.parseColor("#4caf50"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                all.setTextColor(getColor(R.color.grey))
            }
            else{
                all.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                fruits.setTextColor(getColor(R.color.grey))
            }
            else{
                fruits.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                meat.setTextColor(getColor(R.color.grey))
            }
            else{
                meat.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                diary.setTextColor(getColor(R.color.grey))
            }
            else{
                diary.setTextColor(Color.parseColor("#78909c"))
            }

        }

        fruits.setOnClickListener{

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                fruits.setTextColor(getColor(R.color.green))
            }
            else{
                fruits.setTextColor(Color.parseColor("#4caf50"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                vegetable.setTextColor(getColor(R.color.grey))
            }
            else{
                vegetable.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                all.setTextColor(getColor(R.color.grey))
            }
            else{
                all.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                meat.setTextColor(getColor(R.color.grey))
            }
            else{
                meat.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                diary.setTextColor(getColor(R.color.grey))
            }
            else{
                diary.setTextColor(Color.parseColor("#78909c"))
            }

        }

        meat.setOnClickListener{

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                meat.setTextColor(getColor(R.color.green))
            }
            else{
                meat.setTextColor(Color.parseColor("#4caf50"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                vegetable.setTextColor(getColor(R.color.grey))
            }
            else{
                vegetable.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                fruits.setTextColor(getColor(R.color.grey))
            }
            else{
                fruits.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                all.setTextColor(getColor(R.color.grey))
            }
            else{
                all.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                diary.setTextColor(getColor(R.color.grey))
            }
            else{
                diary.setTextColor(Color.parseColor("#78909c"))
            }

        }

        diary.setOnClickListener{

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                diary.setTextColor(getColor(R.color.green))
            }
            else{
                diary.setTextColor(Color.parseColor("#4caf50"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                vegetable.setTextColor(getColor(R.color.grey))
            }
            else{
                vegetable.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                fruits.setTextColor(getColor(R.color.grey))
            }
            else{
                fruits.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                meat.setTextColor(getColor(R.color.grey))
            }
            else{
                meat.setTextColor(Color.parseColor("#78909c"))
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                all.setTextColor(getColor(R.color.grey))
            }
            else{
                all.setTextColor(Color.parseColor("#78909c"))
            }

        }


    }
    fun replaceFragment(){
        var displayFragment = DisplayFragment()
        supportFragmentManager.beginTransaction()
                .replace(R.id.content_frame, displayFragment)
                .addToBackStack(null)
                .commit()
    }
}