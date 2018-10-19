package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by gdesimone on 10/19/2018.
 */

public class Team6942 extends LinearOpMode {
    private DcMotor flipper;
    int x;
    @Override
    public void runOpMode()  {
        flipper = hardwareMap.get(DcMotor.class,"fl");
        waitForStart();
        while (opModeIsActive()){

         x = flipper.getCurrentPosition();
         telemetry.addData("",x);
         telemetry.update();

        }

    }
}
