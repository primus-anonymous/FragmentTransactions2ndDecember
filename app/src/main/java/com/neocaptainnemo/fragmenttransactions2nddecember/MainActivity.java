package com.neocaptainnemo.fragmenttransactions2nddecember;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.replace_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new OneFragment(), OneFragment.TAG)
                        .commit();
            }
        });

        findViewById(R.id.replace_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new TwoFragment(), TwoFragment.TAG)
                        .commit();
            }
        });

        findViewById(R.id.replace_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new ThreeFragment(), ThreeFragment.TAG)
                        .commit();
            }
        });

        findViewById(R.id.add_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, new OneFragment(), OneFragment.TAG)
                        .commit();

            }
        });

        findViewById(R.id.add_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, new TwoFragment(), TwoFragment.TAG)
                        .commit();

            }
        });


        findViewById(R.id.add_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, new ThreeFragment(), ThreeFragment.TAG)
                        .commit();

            }
        });

        findViewById(R.id.remove_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(OneFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .remove(fragment)
                            .commit();
                }
            }
        });

        findViewById(R.id.remove_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(TwoFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .remove(fragment)
                            .commit();
                }
            }
        });

        findViewById(R.id.remove_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(ThreeFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .remove(fragment)
                            .commit();
                }
            }
        });

        findViewById(R.id.hide_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(OneFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .hide(fragment)
                            .commit();
                }
            }
        });

        findViewById(R.id.hide_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(TwoFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .hide(fragment)
                            .commit();
                }
            }
        });

        findViewById(R.id.hide_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(ThreeFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .hide(fragment)
                            .commit();
                }
            }
        });


        findViewById(R.id.show_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(OneFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .show(fragment)
                            .commit();
                }
            }
        });

        findViewById(R.id.show_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(TwoFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .show(fragment)
                            .commit();
                }
            }
        });

        findViewById(R.id.show_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(ThreeFragment.TAG);

                if (fragment != null) {

                    getSupportFragmentManager()
                            .beginTransaction()
                            .show(fragment)
                            .commit();
                }
            }
        });

        findViewById(R.id.multiple_transaction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = getSupportFragmentManager().findFragmentByTag(ThreeFragment.TAG);

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container, new OneFragment(), OneFragment.TAG)
                        .add(R.id.container, new TwoFragment(), TwoFragment.TAG)
                        .remove(fragment)
                        .commit();
            }
        });

        findViewById(R.id.replace_transaction_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new OneFragment(), OneFragment.TAG)
//                        .addToBackStack("Transaction1")
                        .commit();
            }
        });

        findViewById(R.id.replace_transaction_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new TwoFragment(), TwoFragment.TAG)
                        .addToBackStack("Transaction2")
                        .commit();
            }
        });

        findViewById(R.id.replace_transaction_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new ThreeFragment(), ThreeFragment.TAG)
                        .addToBackStack("Transaction3")
                        .commit();
            }
        });

        findViewById(R.id.open_flow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new OneFragment(), OneFragment.TAG)
                        .commit();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new TwoFragment(), TwoFragment.TAG)
                        .addToBackStack("Transaction2")
                        .commit();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new ThreeFragment(), ThreeFragment.TAG)
                        .addToBackStack("Transaction3")
                        .commit();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new OneFragment(), OneFragment.TAG)
                        .addToBackStack("Transaction4")
                        .commit();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new TwoFragment(), TwoFragment.TAG)
                        .addToBackStack("Transaction5")
                        .commit();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new OneFragment(), OneFragment.TAG)
                        .addToBackStack("Transaction6")
                        .commit();

            }
        });

        findViewById(R.id.pop_flow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .popBackStack("Transaction3", 0);
            }
        });

        findViewById(R.id.commit_now).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new OneFragment(), OneFragment.TAG)
                        .commitNow();

                Fragment fragment = getSupportFragmentManager()
                        .findFragmentByTag(OneFragment.TAG);

                ((OneFragment) fragment).showToast("Hi there");
            }
        });

        findViewById(R.id.allowing_state_loss).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container, new OneFragment(), OneFragment.TAG)
                                .commitAllowingStateLoss();

                        recreate();

                    }
                }, 2000L);


            }
        });


    }



}