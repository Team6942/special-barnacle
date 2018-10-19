package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
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

         x = flipper.getCurrentPosition();
         flipper.setTargetPosition(500);
         flipper.setPower(1);
         telemetry.addData("motor pos",x);
         telemetry.update();

        }

    }
}
