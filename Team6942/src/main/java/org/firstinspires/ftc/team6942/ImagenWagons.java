package org.firstinspires.ftc.team6942;

import com.disnodeteam.dogecv.CameraViewDisplay;
import com.disnodeteam.dogecv.detectors.roverrukus.GoldAlignDetector;
import com.disnodeteam.dogecv.detectors.roverrukus.SamplingOrderDetector;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDevice;

@TeleOp
public class ImagenWagons extends LinearOpMode{
    private SamplingOrderDetector.GoldLocation silver;
    private SamplingOrderDetector samplingOrderDetector;
    @Override
    public void runOpMode(){
        samplingOrderDetector = new SamplingOrderDetector();
        samplingOrderDetector.init(hardwareMap.appContext, CameraViewDisplay.getInstance());
        samplingOrderDetector.useDefaults();
        waitForStart();
        while(opModeIsActive()){
            silver = samplingOrderDetector.getCurrentOrder();
            telemetry.addData("acaption",silver.toString());
            telemetry.update();

        }
    }
}
