package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class AlexanderRobot2 extends LinearOpMode {
    private DcMotor flipper;

    @Override
    public void runOpMode()  {
        flipper = hardwareMap.get(DcMotor.class,"fl");
        waitForStart();
        while (opModeIsActive()) {
            int x = flipper.getCurrentPosition();
            telemetry.addData("pos",x);
            telemetry.update();
        }
    }
}
