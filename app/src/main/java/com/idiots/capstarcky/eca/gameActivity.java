package com.idiots.capstarcky.eca;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class gameActivity extends AppCompatActivity {

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    TextView lifeno,text;
    int i,num1,num2,imageno,imageno1,points=0,life=5;
    ArrayList <Integer> list=new ArrayList <Integer>();
    Random rand= new Random();
    android.os.Handler customHandler=new android.os.Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent intent = getIntent();

        customHandler.postDelayed(updateTimerThread,0);
    }
    private Runnable updateTimerThread=new Runnable()
    {
    public void run(){
        text=(TextView)findViewById(R.id.text);
        lifeno = (TextView) findViewById(R.id.lifeno);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        lifeno.setText(life + "");
        //generating list of 1 to 9 numbers
        for(i=1;i<10;i++){

            list.add(i);
        }
        //shuffling the list of numbers
        Collections.shuffle(list);
        //assigning two shuffled && different numbers
        num1=list.get(1);
        num2=list.get(2);

        imageno=rand.nextInt(2);

        switch (num1){

            case 1:if(imageno==0){one.setBackgroundResource(R.drawable.devil1);
                                   new Handler().postDelayed(new Runnable() {
                                       @Override
                                       public void run() {
                                           one.setBackgroundResource(R.drawable.gun);imageno=2;
                                       }
                                   },1500) ;
                              }
                    else if(imageno==1){one.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        one.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                    break;
            case 2:if(imageno==0){two.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        two.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                    else if(imageno==1){two.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        two.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                break;
            case 3:if(imageno==0){three.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        three.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                    else if(imageno==1){three.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        three.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                break;
            case 4:if(imageno==0){four.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        four.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                     else if(imageno==1){four.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        four.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                break;
            case 5:if(imageno==0){five.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        five.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                     else if(imageno==1){five.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        five.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                break;
            case 6:if(imageno==0){six.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        six.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                     else if(imageno==1){six.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        six.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                break;
            case 7:if(imageno==0){seven.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        seven.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                      else if(imageno==1){seven.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        seven.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                break;
            case 8:if(imageno==0){eight.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        eight.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                      else if(imageno==1){eight.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        eight.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                break;
            case 9:if(imageno==0){nine.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nine.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                       else if(imageno==1){nine.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nine.setBackgroundResource(R.drawable.gun);imageno=2;
                    }
                },1500) ;}
                break;

        }
        imageno1=rand.nextInt(2);

        switch (num2){

            case 1:if(imageno1==0){one.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        one.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;
            }
            else if(imageno1==1){one.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        one.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;
            case 2:if(imageno1==0){two.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        two.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
            else if(imageno1==1){two.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        two.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;
            case 3:if(imageno1==0){three.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        three.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
            else if(imageno1==1){three.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        three.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;
            case 4:if(imageno1==0){four.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        four.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
            else if(imageno1==1){four.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        four.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;
            case 5:if(imageno1==0){five.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        five.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
            else if(imageno1==1){five.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        five.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;
            case 6:if(imageno1==0){six.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        six.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
            else if(imageno1==1){six.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        six.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;
            case 7:if(imageno1==0){seven.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        seven.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
            else if(imageno1==1){seven.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        seven.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;
            case 8:if(imageno1==0){eight.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        eight.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
            else if(imageno1==1){eight.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        eight.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;
            case 9:if(imageno1==0){nine.setBackgroundResource(R.drawable.devil1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nine.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
            else if(imageno1==1){nine.setBackgroundResource(R.drawable.bee1);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nine.setBackgroundResource(R.drawable.gun);imageno1=2;
                    }
                },1500) ;}
                break;

        }
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==1) {
                    if (imageno == 0) {
                        one.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        one.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==1) {
                    if (imageno1 == 0) {
                        one.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        one.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){one.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){one.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        one.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
                }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==2) {
                    if (imageno == 0) {
                        two.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        two.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==2) {
                    if (imageno1 == 0) {
                        two.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        two.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){two.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){two.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        two.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==3) {
                    if (imageno == 0) {
                        three.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        three.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==3) {
                    if (imageno1 == 0) {
                        three.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        three.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){three.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){three.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        three.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==4) {
                    if (imageno == 0) {
                        four.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        four.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==4) {
                    if (imageno1 == 0) {
                        four.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        four.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){four.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){four.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        four.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==5) {
                    if (imageno == 0) {
                        five.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        five.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==5) {
                    if (imageno1 == 0) {
                        five.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        five.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){five.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){five.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        five.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==6) {
                    if (imageno == 0) {
                        six.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        six.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==6) {
                    if (imageno1 == 0) {
                        six.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        six.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){six.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){six.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        six.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==7) {
                    if (imageno == 0) {
                        seven.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        seven.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==7) {
                    if (imageno1 == 0) {
                        seven.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        seven.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){seven.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){seven.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        seven.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==8) {
                    if (imageno == 0) {
                        eight.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        eight.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==8) {
                    if (imageno1 == 0) {
                        eight.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        eight.setBackgroundResource(R.drawable.ouch);
                        if (points != 0)  {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){eight.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){eight.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        eight.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1==9) {
                    if (imageno == 0) {
                        nine.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno == 1) {
                        nine.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                else if(num2==9) {
                    if (imageno1 == 0) {
                        nine.setBackgroundResource(R.drawable.blast1);
                        points += 10;
                    } else if (imageno1 == 1) {
                        nine.setBackgroundResource(R.drawable.ouch);
                        if (points == 0) {
                        } else {
                            points -= 5;
                        }
                        life--;
                        lifeno.setText(life + "");text.setText(points+"");
                        if (life == 0) {
                            end(points);
                        }
                    }
                }
                if(imageno1==2){nine.setBackgroundResource(R.drawable.gun);}
                if(imageno==2){nine.setBackgroundResource(R.drawable.gun);}
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        nine.setBackgroundResource(R.drawable.gun);
                    }
                },1500) ;
            }
        });

        customHandler.postDelayed(this,3000);

    }
    };
    public void end(int points){
        String point=points+"";
        Intent intent1 = new Intent(gameActivity.this, Final.class);
        intent1.putExtra("score", point);
        startActivity(intent1);
    }
}
