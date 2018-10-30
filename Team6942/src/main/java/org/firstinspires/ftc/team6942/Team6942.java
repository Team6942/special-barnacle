package org.firstinspires.ftc.team6942;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
public class Team6942 extends LinearOpMode {
    private DcMotor flipper;
    private int x;
    @Override
    public void runOpMode()  {
        flipper = hardwareMap.get(DcMotor.class,"fl");
        flipper.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        waitForStart();
        while (opModeIsActive()){
         telemetry.addData("11",flipper.getConnectionInfo());
         x = flipper.getCurrentPosition();
         flipper.setTargetPosition(360);
         flipper.setPower(1);
         telemetry.addData("motor pos",x);
         telemetry.update();
         if (x > 350) {
             flipper.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
             break;
         }
        }

    }
}
