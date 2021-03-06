package com.qualcomm.ftcrobotcontroller.opmodes;

public class beaconAutonomous10_31 extends Error404_Hardware_Tier2

{
  ///////////////////////////////////////////////////////////////////
  private int state = 0;
  private int encoder=0;
  private int test=0;
  public beaconAutonomous10_31()
  {
  }
   @Override public void init(){
    super.init();
    telemetry.addData("Out Red: ", beacon.red());
    telemetry.addData("Out Blue: ", beacon.blue());
    gyroCalibrate();
    telemetry.addData("Gyro: ", gyro.getHeading());
   }
  @Override public void start(){
    driveStright("RWOE", 0.0, "F", 0);
    resetAllEncoders_withWait();
    //gyroCalibrate();
    RGB.enableLed(false); //not sure why these are needed here.  Seems to help reset the LEDS so the next enable commands are obeyed.
    beacon.enableLed(false);


  }
  @Override public void loop ()
  {
    RGB.enableLed(true);
    beacon.enableLed(false);
    switch (state)
    {   case 0:
            resetAllEncoders_withWait();
      state++;
      break;
      case 1:
          driveStright("RUE",0.2,"r",0); //drive away from line

        if (is_encoder_reached(200, leftFront)) {

          state++;
          encoder=leftFront.getCurrentPosition();
        }
        break;
     case 2:
       set_power(0,rightFront);
       set_power(0,leftFront);
       set_power(0,rightRear);
       set_power(0,leftRear);
       state++;
        break;
      case 3:
        pointTurn("RUE",0.1,"r",0); //turn towards line
        if (gyro.getHeading()>24 && gyro.getHeading()<180) {   //the <180 is to compensate if the robot turns slightly to the left
          state++;
        }
        break;
      case 4:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        //resetAllEncoders_noWait();
        state++;
        encoder=leftFront.getCurrentPosition();
        break;
//    case 4:
//      resetAllEncoders_noWait();
//          state++;
//        break;
      case 5:
        driveStright("RUE",0.4,"r",0); //drive to line's general area
        if (is_encoder_reached((2200+encoder), leftFront)) {
          state++;
        }
        break;
      case 6:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        state++;
        break;
      case 7:
        //resetAllEncoders_noWait();
        state++;
        break;
      case 8:
        driveStright("RUE",0.1,"r",0); //drive until line is seen
        if(RGB.alpha()>5)
        {
        state++;
        }
        break;

        case 9:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            //resetAllEncoders_noWait();
            state++;
            encoder=leftFront.getCurrentPosition();
            driveStright("RUE",0.0,"r",0); //drive to line's general area
            break;

        case 10:
            driveStright("RUE",0.1,"r",0); //drive to line's general area
            if (is_encoder_reached((100+encoder), leftFront)) {
                state++;
            }
            break;
        case 11:
            state++;
            break;

      case 12:
        state++;
        break;
      case 13:
          state++;
        break;
      case 14:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        //resetAllEncoders_noWait();
        state++;
        break;
      case 15:
        pointTurn("RUE",0.1,"r",0); //turn onto line
        if (gyro.getHeading()>80) {
          state++;
        }
        break;
      case 16:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        //resetAllEncoders_noWait();
        state++;
        break;
      case 17:
        driveStright("RUE",0,"f",0);
        state++;
        break;
      case 18:
        driveStright("RUE",0.1,"r",0);
//        if ((ODS.getLightDetected()*100)>50) {
        if(touch.isPressed()){
          state++;
        }
        break;
      case 19:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        //resetAllEncoders_noWait();
        state++;
        break;
      case 20:
        driveStright("RUE",0,"f",0);
        //resetAllEncoders_noWait();
        state++;
        encoder=leftFront.getCurrentPosition();
        break;
      case 21:
        driveStright("RUE",0.1,"f",0); //drive to line's general area
        if (is_encoder_reached((encoder+200), leftFront)) {
          state++;
        }
        break;
      case 22:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        //resetAllEncoders_noWait();
        state++;
        break;
      case 23:
        slide_sideways("RUE",0,"l",0);
        encoder=leftFront.getCurrentPosition();
        //resetAllEncoders_withWait();
       state++;
        break;
      case 24:
        slide_sideways("RUE",0.1,"l",0); //drive to line's general area
        if (is_encoder_reached(encoder+210, leftFront)) {
          state++;
        }
        break;
      case 25:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        //resetAllEncoders_noWait();
        state++;
     case 26:
        driveStright("RUE",0,"r",0);
        encoder=leftFront.getCurrentPosition();
//        //resetAllEncoders_withWait();
        state=31;
        break;
      case 31:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        //resetAllEncoders_noWait();
        state++;
        break;
      case 32:
        driveStright("RUE",0,"f",0);
        encoder=leftFront.getCurrentPosition();
        state++;
        break;
      case 33:
          state = 37;
        break;
     case 37:
        set_power(0,rightFront);
        set_power(0,leftFront);
        set_power(0,rightRear);
        set_power(0,leftRear);
        state++;
        break;
        case 38:
            if(beacon.blue()>beacon.red())
        {
            telemetry.addData("It's BLUE!!!","");
            state = 40;
        }
            else
            {
                state=39;
            }
            break;
        case 39:
            if(beacon.red()>beacon.blue())
            {
                telemetry.addData("It's RED!!!","");
                state=41;
            }
            break;
        case 40: // blue case
            state=50;
            break;
        case 50:
            driveStright("RUE",0,"r",0);
            encoder=leftFront.getCurrentPosition();
            state++;
            break;
        case 51:
            driveStright("RUE",0.05,"r",0); //drive to line's general area
            if (is_encoder_reached(encoder+250, leftFront)) {
                state = 52;
            }
            break;
        case 52:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state = 56;
            break;
        case 41: // red case
            ///////////////////////////////////////////////
            slide_sideways("RUE",0,"l",0);
            encoder=leftFront.getCurrentPosition();
            state++;
            break;
        case 42:
            slide_sideways("RUE",0.1,"l",0); //drive to line's general area
            if (is_encoder_reached(encoder+300, leftFront)) {
                state++;
            }
            break;
        case 43:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state++;
            break;
        case 44:
            driveStright("RUE",0,"r",0);
            encoder=leftFront.getCurrentPosition();
            state++;
            break;
        case 45:
            driveStright("RUE",0.05,"r",0); //drive to line's general area
            if (is_encoder_reached(encoder+250, leftFront)) {
                state = 46;
            }
            break;
        case 46:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state = 56;
            break;
        case 56:
            //////////////////////////////
            driveStright("RUE",0,"f",0);
            encoder=leftFront.getCurrentPosition();
            state = 58;
            break;
        case 58:
            driveStright("RUE",0.05,"f",0); //drive to line's general area
            if (is_encoder_reached(encoder+500, leftFront)) {
                state = 60;
            }
            break;
        case 60:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state++;
            break;
        case 61:
            if (gyro.getHeading()>84){
                state=63;
                break;
            }
            else if(gyro.getHeading()<84)
            {
                state=62;
                break;
            }
            else
            {
                state = 64;
            }
        case 62:
            pointTurn("RUE",0.05,"r",0); //turn right
            if (gyro.getHeading()>83){
                state=64;
            }
            break;
        case 63:
            pointTurn("RUE",0.05,"l",0); //turn left
            if (gyro.getHeading()<85) {
                state=64;
            }
            break;
        case 64:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            slide_sideways("RUE",0,"r",0); //drive to line's general area
            state++;
            encoder=leftFront.getCurrentPosition();
            break;
        case 65:
            slide_sideways("RUE",0.3,"r",0); //drive to line's general area
            if (is_encoder_reached(encoder+2000, leftFront)) {
                state++;
            }
            break;
        case 66:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            slide_sideways("RUE",0,"r",0); //drive to line's general area
            state++;
            encoder=leftFront.getCurrentPosition();
            break;
        case 67:
            slide_sideways("RUE",0.1,"r",0); //drive to line's general area
            if (RGB.alpha()>4) {
                state++;
            }
            break;
        case 68:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            slide_sideways("RUE",0,"r",0); //drive to line's general area
            state++;
            encoder=leftFront.getCurrentPosition();
            break;
        case 69:
            slide_sideways("RUE",0.1,"r",0); //drive to line's general area
            if (is_encoder_reached(encoder+150, leftFront)) {
                state++;
            }
            break;
        case 70:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            slide_sideways("RUE",0,"r",0); //drive to line's general area
            state++;
            encoder=leftFront.getCurrentPosition();
            break;
        ///////////////////////////////////////////////
        /***********************************************/
        case 71:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            //resetAllEncoders_noWait();
            state++;
            break;
        case 72:
            driveStright("RUE",0,"f",0);
            state++;
            break;
        case 73:
            driveStright("RUE",0.1,"r",0);
//        if ((ODS.getLightDetected()*100)>50) {
            if(touch.isPressed()){
                state++;
            }
            break;
        case 74:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            //resetAllEncoders_noWait();
            state++;
            break;
        case 75:
            driveStright("RUE",0,"f",0);
            //resetAllEncoders_noWait();
            state++;
            encoder=leftFront.getCurrentPosition();
            break;
        case 76:
            driveStright("RUE",0.1,"f",0); //drive to line's general area
            if (is_encoder_reached((encoder+200), leftFront)) {
                state++;
            }
            break;
        case 77:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            //resetAllEncoders_noWait();
            state++;
            break;
        case 78:
            slide_sideways("RUE",0,"l",0);
            encoder=leftFront.getCurrentPosition();
            //resetAllEncoders_withWait();
            state++;
            break;
        case 79:
            slide_sideways("RUE",0.1,"l",0); //drive to line's general area
            if (is_encoder_reached(encoder+270, leftFront)) {
                state++;
            }
            break;
        case 80:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            //resetAllEncoders_noWait();
            state++;
        case 81:
            driveStright("RUE",0,"r",0);
            encoder=leftFront.getCurrentPosition();
//        //resetAllEncoders_withWait();
            state++;
            break;
        case 82:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            //resetAllEncoders_noWait();
            state++;
            break;
        case 83:
            driveStright("RUE",0,"f",0);
            encoder=leftFront.getCurrentPosition();
            state++;
            break;
        case 84:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state++;
            break;
        case 85:
            if(beacon.blue()>beacon.red())
            {
                telemetry.addData("It's BLUE!!!","");
                state = 87;
            }
            else
            {
                state=86;
            }
            break;
        case 86:
            if(beacon.red()>beacon.blue())
            {
                telemetry.addData("It's RED!!!","");
                state=91;
            }
            break;
        case 87: // blue case
            state++;
            break;
        case 88:
            driveStright("RUE",0,"r",0);
            encoder=leftFront.getCurrentPosition();
            state++;
            break;
        case 89:
            driveStright("RUE",0.05,"r",0); //drive to line's general area
            if (is_encoder_reached(encoder+250, leftFront)) {
                state = 90;
            }
            break;
        case 90:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state = 97;
            break;
        case 91: // red case
            ///////////////////////////////////////////////
            slide_sideways("RUE",0,"l",0);
            encoder=leftFront.getCurrentPosition();
            state++;
            break;
        case 92:
            slide_sideways("RUE",0.1,"l",0); //drive to line's general area
            if (is_encoder_reached(encoder+400, leftFront)) {
                state++;
            }
            break;
        case 93:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state++;
            break;
        case 94:
            driveStright("RUE",0,"r",0);
            encoder=leftFront.getCurrentPosition();
            state++;
            break;
        case 95:
            driveStright("RUE",0.05,"r",0); //drive to line's general area
            if (is_encoder_reached(encoder+250, leftFront)) {
                state = 96;
            }
            break;
        case 96:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state = 97;
            break;
        case 97:
            //////////////////////////////
            driveStright("RUE",0,"f",0);
            encoder=leftFront.getCurrentPosition();
            state = 98;
            break;
        case 98:
            driveStright("RUE",0.05,"f",0); //drive to line's general area
            if (is_encoder_reached(encoder+400, leftFront)) {
                state = 99;
            }
            break;
        case 99:
            set_power(0,rightFront);
            set_power(0,leftFront);
            set_power(0,rightRear);
            set_power(0,leftRear);
            state++;
            break;

        /***********************************************/
        ///////////////////////////////////////////////
        default:
            break;


    }
    telemetry.addData("RightFront: ", get_position(rightFront));
    telemetry.addData("LeftFront: ", get_position(leftFront));
    telemetry.addData("RightRear: ", get_position(rightRear));
    telemetry.addData("LeftRear: ", get_position(leftRear));
    telemetry.addData("1. State: ", state);
    telemetry.addData("2. White down: ", RGB.alpha());
    telemetry.addData("3. Red out: ", beacon.red());
    telemetry.addData("3. Blue out: ", beacon.blue());
    telemetry.addData("Gyro: ", gyro.getHeading());
  } // loop
} //
