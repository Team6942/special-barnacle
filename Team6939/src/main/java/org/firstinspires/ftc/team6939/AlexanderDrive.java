package org.firstinspires.ftc.team6939;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by gdesimone on 10/17/2018.
 */

public class AlexanderDrive extends LinearOpMode {
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private DcMotor flipper;
    private DcMotor rotateThingey;
    private Servo servo;
    private ColorSensor colorSensor;
    private float drive;
    private float turn;
    private float left;
    private float right;
    private float max;
    @Override
    public void runOpMode()  {
        leftMotor = hardwareMap.get(DcMotor.class,"leftMotor");
        rightMotor = hardwareMap.get(DcMotor.class,"rightMotor");
        flipper = hardwareMap.get(DcMotor.class,"flipper");
        rotateThingey = hardwareMap.get(DcMotor.class,"rotateThingey");
        colorSensor = hardwareMap.get(ColorSensor.class,"colorSensor");
        servo = hardwareMap.get(Servo.class,"servo");

        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.right_bumper) {
                int x = flipper.getCurrentPosition();

                flipper.setTargetPosition(x);

          
            drive = -gamepad1.left_stick_y;
            turn  =  gamepad1.right_stick_x;

            // Combine drive and turn for blended motion.
            left  = drive + turn;
            right = drive - turn;

            // Normalize the values so neither exceed +/- 1.0
             max = Math.max(Math.abs(left), Math.abs(right));
            if (max > 1.0)
            {
                left /= max;
                right /= max;
            }

            // Output the safe vales to the motor drives
            leftMotor.setPower(left);
            rightMotor.setPower(right);
            
            }
        }
    }
}
