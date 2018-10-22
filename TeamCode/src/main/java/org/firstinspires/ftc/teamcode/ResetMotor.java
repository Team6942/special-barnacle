package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by gdesimone on 10/22/2018.
 */
@TeleOp
public class ResetMotor  extends LinearOpMode {
    private DcMotor flipper;

    public void runOpMode()  {
        flipper = hardwareMap.get(DcMotor.class,"fl");
        waitForStart();
        while (opModeIsActive()){
            flipper.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        }
    }
}
