package org.firstinspires.ftc.team6942;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by gdesimone on 10/24/2018.
 */

public class Team6939Motor extends LinearOpMode{
    DcMotor dcMotor;

    @Override
    public void runOpMode() throws InterruptedException {
        dcMotor = hardwareMap.get(DcMotor.class, "fl");
        dcMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        waitForStart();
        while (opModeIsActive()) {
            dcMotor.setPower(1);
            dcMotor.setTargetPosition(400);

            if (dcMotor.getCurrentPosition() > 390) {
                dcMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
                break;
            }
        }
    }
}
