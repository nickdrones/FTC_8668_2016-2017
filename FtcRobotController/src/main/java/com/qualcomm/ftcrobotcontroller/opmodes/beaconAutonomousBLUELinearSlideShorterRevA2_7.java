package com.qualcomm.ftcrobotcontroller.opmodes;

import android.graphics.Color;

import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.BACK_UP_FROM_BEACON1;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.BACK_UP_FROM_BEACON2;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.CHECK_COLOR_LOGIC1;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.CHECK_COLOR_LOGIC2;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.DRIVE_QUICKLY_STRAIGHT_TO_LINE;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.DRIVE_SLOWLY_TILL_FIND_LINE;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.DRIVE_STRAIGHT_FROM_WALL;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.DRIVE_TILL_TOUCH;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.DRIVE_TILL_TOUCH2;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.DRIVE_TO_VORTEX;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.SLIDE_SLOWLY_TILL_LINE;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.SLIDE_TO_OTHER_BEACON;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP1;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP2;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP3;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP4;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP_AFTER_BACKING_UP;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP_FINAL;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP_ON_LINE;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP_ON_WALL;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STOP_RESET_CAPTURE_POSITION;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.TURN_TOWARD_LINE;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.TURN_TOWARD_VORTEX;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.TURN_TOWARD_WALL;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.WAIT_FOR_PUSH1;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.WAIT_FOR_PUSH2;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.STRAFE_BACK_SLIGHTLY;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.RECOVERY;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.FAILSAFE_CODE;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.MOVE_LEFT;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.MOVE_RIGHT;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.CHECK_COLOR_AMOUNTS;

import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.MOVE_LEFT2;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.MOVE_RIGHT2;
import static com.qualcomm.ftcrobotcontroller.opmodes.beaconAutonomousBLUELinearSlideShorterRevA2_7.State.CHECK_COLOR_AMOUNTS2;


public class beaconAutonomousBLUELinearSlideShorterRevA2_7 extends Error404_Hardware_Tier2

{
  ///////////////////////////////////////////////////////////////////
    // This program will push two beacons and drive to the center vortex to park.
    ////////////////////////////////////////////////////////////////////
    public enum State {
      MOVE_LEFT,
      MOVE_RIGHT,
      CHECK_COLOR_AMOUNTS,
      MOVE_LEFT2,
      MOVE_RIGHT2,
      CHECK_COLOR_AMOUNTS2,
      DRIVE_STRAIGHT_FROM_WALL,
      RECOVERY,
      FAILSAFE_CODE,
      STOP1,
      TURN_TOWARD_LINE,
      STOP2,
      DRIVE_QUICKLY_STRAIGHT_TO_LINE,
      DRIVE_SLOWLY_TILL_FIND_LINE,
      STOP3,
      TURN_TOWARD_WALL,
      STOP4,
      DRIVE_TILL_TOUCH,
      STOP_RESET_CAPTURE_POSITION,
      CHECK_COLOR_LOGIC1,
      WAIT_FOR_PUSH1,
      BACK_UP_FROM_BEACON1,
      STOP_AFTER_BACKING_UP,
      SLIDE_TO_OTHER_BEACON,
      SLIDE_SLOWLY_TILL_LINE,
      STOP_ON_LINE,
      STRAFE_BACK_SLIGHTLY,
      DRIVE_TILL_TOUCH2,
      STOP_ON_WALL,
      CHECK_COLOR_LOGIC2,
      WAIT_FOR_PUSH2,
      BACK_UP_FROM_BEACON2,
      TURN_TOWARD_VORTEX,
      DRIVE_TO_VORTEX, STOP_FINAL,

  }

    private State state = RECOVERY;
    private int encoder=0;
    private int tempval=0;
    private int backupEncoder=0;
    private double powervalue;
    private int gyrovalatslow=0;
    private int gyroafterstraight;
    int zeroPoint=0;
    double rightVal=0.15;
    double leftVal=0.15;

    public beaconAutonomousBLUELinearSlideShorterRevA2_7()
  {
  }
   @Override public void init(){
       super.init();
       RGB.enableLed(true);
         //Not sure why this is needed.  Seems to helps reset so the next enable commands are obeyed.
       telemetry.addData("Out Red: ", beacon.red()); //Show color sensor readings.
       telemetry.addData("Out Blue: ", beacon.blue());
       telemetry.addData("Down White: ", RGB.alpha());

       gyroCalibrate();
       telemetry.addData("Gyro: ", gyro.getHeading()); //print gyro data after calibration
       telemetry.addData("","V 6");

       setServoPos(rightPush, rightVal);  // initialize servos to initial positions
       setServoPos(leftPush, leftVal);

   }
  @Override public void start(){
      driveStright("RWOE", 0.0, "F", 0);
      resetAllEncoders_withWait();
     RGB.enableLed(false); //not sure why this is needed.
      beacon.enableLed(false);
      beacon2.enableLed(false);
  }


  @Override public void loop ()
  {
    RGB.enableLed(true);
    beacon.enableLed(false);
    beacon2.enableLed(false);
      float[] hsvValues2 = {0F, 0F, 0F};
      Color.RGBToHSV(beacon2.red()*8, beacon2.green()*8, beacon2.blue()*8, hsvValues2);

      float[] hsvValues = {0F, 0F, 0F};
      Color.RGBToHSV(beacon.red()*8, beacon.green()*8, beacon.blue()*8, hsvValues);

      switch (state) {
        case RECOVERY:
              //check to see if color sensor reads 255 (this means color sensor is disconnected)
              // If color sensor has error, go to failsafe and stop so we dont accidentally push
              // oppoents side of the beacon
              if(beacon.red()==255 && beacon.blue()==255){
                  state=FAILSAFE_CODE;
              }
              else {
                  state = DRIVE_STRAIGHT_FROM_WALL; // If color sensor is OK, proceed on with code
              }
              break;

        case FAILSAFE_CODE:
              telemetry.addData("Oops, color sensor didn't work!","  ;-)");
              //This will soon implement another full backup program in case the color sensor fails
              break;

        case DRIVE_STRAIGHT_FROM_WALL:
            driveStright("RUE", 0.2, "r", 0);
            if (is_encoder_reached(200, leftFront)) {
                state = TURN_TOWARD_LINE;
                left_set_power(0.0);
                right_set_power(0.0);
            }
            break;

        case TURN_TOWARD_LINE:
            turn_gyro_power_new(30, 0.1, 0.6, "r");
            if (gyro.getHeading() > 30 && gyro.getHeading() < 180) {
                //the <180 is to compensate if the robot turns slightly to the left
                state = DRIVE_QUICKLY_STRAIGHT_TO_LINE;
                left_set_power(0.0);
                right_set_power(0.0);
                driveStright("RUE", 0, "r", 0);
                encoder = leftFront.getCurrentPosition();
            }
            break;

        case DRIVE_QUICKLY_STRAIGHT_TO_LINE:
            driveStright("RUE", 0.4, "r", 0);
            if (is_encoder_reached((2200 + encoder), leftFront)) {
                state = DRIVE_SLOWLY_TILL_FIND_LINE;
            }
            break;

        case DRIVE_SLOWLY_TILL_FIND_LINE:
            driveStright("RUE", 0.1, "r", 0);
            if (RGB.alpha() > 5) {
                left_set_power(0.0);
                right_set_power(0.0);
                state = TURN_TOWARD_WALL;
            }
            break;

        case TURN_TOWARD_WALL:
            pointTurn("RUE", 0.1, "r", 0);
            if (gyro.getHeading() > 80) {
                left_set_power(0.0);
                right_set_power(0.0);
                state = DRIVE_TILL_TOUCH;
            }
            break;

        case DRIVE_TILL_TOUCH:  //drive till both touch sensors pressed on wall
            driveStright("RUE", 0.2, "r", 0);
            if (touch.isPressed() && touch2.isPressed()) {
                left_set_power(0.0);
                right_set_power(0.0);
                state = STOP_RESET_CAPTURE_POSITION;
            }
            break;

        case STOP_RESET_CAPTURE_POSITION:
            zeroPoint = gyro.getHeading();
            //capture gyro reading for gyro correction after backing away from beacon
            driveStright("RUE", 0, "f", 0);
            state = CHECK_COLOR_AMOUNTS;
            encoder = leftFront.getCurrentPosition();
            break;

        case CHECK_COLOR_AMOUNTS: //Check what each of the two color sensors see
              //If the right color sensor sees all zeroe, then
              //it's off the beacon. So, the robot slides left to center on the beacon.
              //If the left sensor sees all zeroes, the robot slides to the right.
              if(beacon.blue()==0 && beacon.red()==0 && hsvValues[0]==0){
                  slide_sideways("RUE", 0, "r", 0);
                  encoder = leftFront.getCurrentPosition();
                  state=MOVE_LEFT;
              }
              else if(beacon2.blue()==0 && beacon2.red()==0 && hsvValues2[0]==0){
                  slide_sideways("RUE", 0, "l", 0);
                  encoder = leftFront.getCurrentPosition();
                  state=MOVE_RIGHT;
              }
              else {
                  state=CHECK_COLOR_LOGIC1;
                  driveStright("RUE", 0, "f", 0);
              }
              break;

        case MOVE_LEFT:
              slide_sideways("RUE", 0.1, "r", 0);
              if (is_encoder_reached((150 + encoder), leftFront)) { //move left slightly
                  left_set_power(0.0);
                  right_set_power(0.0);
                  driveStright("RUE", 0, "f", 0);
                  state = CHECK_COLOR_LOGIC1;
                  encoder = leftFront.getCurrentPosition();
              }
              break;

        case MOVE_RIGHT:
              slide_sideways("RUE", 0.1, "l", 0);
              if (is_encoder_reached((150 + encoder), leftFront)) { //move right slightly
                  left_set_power(0.0);
                  right_set_power(0.0);
                  driveStright("RUE", 0, "f", 0);
                  state = CHECK_COLOR_LOGIC1;
                  encoder = leftFront.getCurrentPosition();
              }
              break;

        case CHECK_COLOR_LOGIC1:  //uses color sensor on right pusher
              if (hsvValues[0]<260 && hsvValues[0]>180 && beacon.blue()>0) {
                  telemetry.addData("It's BLUE!!!", "");
                  rightPush.setPosition(.5);
                  state = WAIT_FOR_PUSH1;
              } else if ((hsvValues[0]<41 && hsvValues[0]>=0 && beacon.red()>0)||(hsvValues[0]<361 && hsvValues[0]>299 && beacon.red()>0)){
                  telemetry.addData("It's RED!!!", "");
                  leftPush.setPosition(.5);
                  state = WAIT_FOR_PUSH1;
              } else {
                  state = WAIT_FOR_PUSH1;
              }  //if see no beacon color, then just stop program
              break;

        case WAIT_FOR_PUSH1: //wait one sec for pushers to finish moving and pressing button
            try {
                Thread.sleep(1550);                 // one second.
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            state = BACK_UP_FROM_BEACON1;
            break;

        case BACK_UP_FROM_BEACON1: // back away from beacon slightly and retract beacon pushers
            driveStright("RUE", 0.25, "f", 0);
            rightPush.setPosition(0.15);
            leftPush.setPosition(0.15);
            if (is_encoder_reached(encoder + 450, leftFront)) {
                left_set_power(0.0);
                right_set_power(0.0);
                state = STOP_AFTER_BACKING_UP;
            }
            break;

        case STOP_AFTER_BACKING_UP:
            slide_sideways("RUE", 0, "r", 0);
            encoder = leftFront.getCurrentPosition();
            state = SLIDE_TO_OTHER_BEACON;
            break;

        case SLIDE_TO_OTHER_BEACON:
            slide_sideways("RUE", 0.5, "r", 0);                             ///////////
            if (is_encoder_reached(encoder + 2000, leftFront)) {  //slide to other beacon
                state = SLIDE_SLOWLY_TILL_LINE;
            }
            break;

        case SLIDE_SLOWLY_TILL_LINE:
            slide_sideways("RUE", 0.06, "r", 0);
            if (RGB.alpha() > 4) {
                left_set_power(0.0);
                right_set_power(0.0);
                state = STOP_ON_LINE;
            }
            break;

        case STOP_ON_LINE:
            slide_sideways("RUE", 0, "l", 0);
            encoder = leftFront.getCurrentPosition(); //stop on line in front of beacon
            state = DRIVE_TILL_TOUCH2;
            break;

        case DRIVE_TILL_TOUCH2:            // drive straight till both touch sensors see the wall
            driveStright("RUE", 0.2, "r", 0);
            if (touch.isPressed() && touch2.isPressed()) {
                state = STOP_ON_WALL;
            }
            break;

        case STOP_ON_WALL:
            left_set_power(0.0);
            right_set_power(0.0);
            state = CHECK_COLOR_AMOUNTS2;
            driveStright("RUE", 0, "f", 0);
            encoder = leftFront.getCurrentPosition();
            break;

        case CHECK_COLOR_AMOUNTS2:
            //Check what each of the two color sensors see.  If the right color sensor sees all
            // zeroes, then it's off the beacon. So, the robot slides left to center on the beacon.
            //If the left sensor sees all zeroes, the robot slides to the right.
              if(beacon.blue()==0 && beacon.red()==0 && hsvValues[0]==0){
                  slide_sideways("RUE", 0, "r", 0);
                  encoder = leftFront.getCurrentPosition();
                  state=MOVE_LEFT2;
              }
              else if(beacon2.blue()==0 && beacon2.red()==0 && hsvValues2[0]==0){
                  slide_sideways("RUE", 0, "l", 0);
                  encoder = leftFront.getCurrentPosition();
                  state=MOVE_RIGHT2;
              }
              else {
                  state=CHECK_COLOR_LOGIC2;
                  driveStright("RUE", 0, "f", 0);
              }
              break;

        case MOVE_LEFT2:
              slide_sideways("RUE", 0.1, "r", 0);
              if (is_encoder_reached((150 + encoder), leftFront)) {
                  left_set_power(0.0);
                  right_set_power(0.0);
                  driveStright("RUE", 0, "f", 0);
                  state = CHECK_COLOR_LOGIC2;
                  encoder = leftFront.getCurrentPosition();
              }
              break;

        case MOVE_RIGHT2:
              slide_sideways("RUE", 0.1, "l", 0);
              if (is_encoder_reached((150 + encoder), leftFront)) {
                  left_set_power(0.0);
                  right_set_power(0.0);
                  driveStright("RUE", 0, "f", 0);
                  state = CHECK_COLOR_LOGIC2;
                  encoder = leftFront.getCurrentPosition();
              }
              break;

        case CHECK_COLOR_LOGIC2:  //use color sensor on right pusher
              if (hsvValues[0]<260 && hsvValues[0]>180 && beacon.blue()>0) {
                  telemetry.addData("It's BLUE!!!", "");
                  rightPush.setPosition(.45);
                  state = WAIT_FOR_PUSH2;
              } else if ((hsvValues[0]<41 && hsvValues[0]>=0 && beacon.red()>0)||(hsvValues[0]<=360 && hsvValues[0]>=300 && beacon.red()>0)){
                  telemetry.addData("It's RED!!!", "");
                  leftPush.setPosition(.45);
                  state = WAIT_FOR_PUSH2;
              } else {
                  state = WAIT_FOR_PUSH2;
              }  //if see no beacon color, then just stop program
              break;

        case WAIT_FOR_PUSH2: //wait one sec for pushers to finish moving and pressing button
            try {
                Thread.sleep(1550);                 // one second.
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            state = BACK_UP_FROM_BEACON2;
            break;

        case BACK_UP_FROM_BEACON2: // back away from beacon slightly and retract beacon pushers
            driveStright("RUE", 0.25, "f", 0);
            rightPush.setPosition(0.15);
            leftPush.setPosition(0.15);
            if (is_encoder_reached(encoder + 450, leftFront)) {
                state = TURN_TOWARD_VORTEX;
            }
            break;

        case TURN_TOWARD_VORTEX:              // turn slightly to face center vortex
            pointTurn("RUE", 0.2, "l", 0);
            if (gyro.getHeading() < 70 && gyro.getHeading() > 1) {
                state = DRIVE_TO_VORTEX;
                driveStright("RUE", 0, "f", 0);
                encoder = leftFront.getCurrentPosition();
           }
            break;

        case DRIVE_TO_VORTEX:
            driveStright("RUE",0.4,"f",0); //drive to line's general area
            if (is_encoder_reached(encoder+2600, leftFront)) {
                state=STOP_FINAL;
            }
            break;

        case STOP_FINAL:
            left_set_power(0.0);
            right_set_power(0.0);
            break;

        default:
            break;
    }

    telemetry.addData("2.          Hue   Red   Blue", "");
    telemetry.addData("3. right  "+ hsvValues[0] +"   "+ beacon.red() +"   "+ beacon.blue(), "");
    telemetry.addData("4. left   "+ hsvValues2[0] +"   "+ beacon2.red() +"   "+ beacon2.blue(), "");
    telemetry.addData("7. State: ", state);
    telemetry.addData("1. Gyro: ", gyro.getHeading());

  }
}