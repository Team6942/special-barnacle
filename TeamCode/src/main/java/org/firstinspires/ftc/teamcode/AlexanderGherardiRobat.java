

package org.firstinspires.ftc.teamcode;

import com.disnodeteam.dogecv.CameraViewDisplay;
import com.disnodeteam.dogecv.DogeCV;

import com.disnodeteam.dogecv.detectors.roverrukus.GoldAlignDetector;
import com.disnodeteam.dogecv.detectors.roverrukus.GoldDetector;
import com.disnodeteam.dogecv.detectors.roverrukus.SamplingOrderDetector;
import com.disnodeteam.dogecv.filters.HSVColorFilter;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.opencv.*;
@TeleOp()

public class AlexanderGherardiRobat extends OpMode
{
    private SamplingOrderDetector detector;
    private GoldAlignDetector goldAlignDetector;
    private DcMotor fl;
    private DcMotor br;
    private DcMotor bl;
    private DcMotor fr;

    @Override
    public void init() {
        telemetry.addData("Status", "alexander is ta bomb");
        //Initialise motors
        fl = hardwareMap.get(DcMotor.class,"fl");
        br = hardwareMap.get(DcMotor.class,"br");
        bl = hardwareMap.get(DcMotor.class,"bl");
        fr = hardwareMap.get(DcMotor.class,"fr");
        //Initialise detectors
        detector = new SamplingOrderDetector();
        detector.init(hardwareMap.appContext, CameraViewDisplay.getInstance());
        detector.useDefaults();

        goldAlignDetector = new GoldAlignDetector();
        goldAlignDetector.init(hardwareMap.appContext, CameraViewDisplay.getInstance());
        goldAlignDetector.useDefaults();

        detector.enable();


    }

    @Override
    public void init_loop() {
    }


    @Override
    public void start() {

    }


    @Override
    public void loop() {
        telemetry.addData("Current Order" , detector.getCurrentOrder().toString());
        telemetry.addData("Last Order" , detector.getLastOrder().toString());
        if (detector.getCurrentOrder() == SamplingOrderDetector.GoldLocation.CENTER) {
            //todo do thing hear
        } if (detector.getCurrentOrder() == SamplingOrderDetector.GoldLocation.LEFT) {
            //todo do thing hear
            double x = goldAlignDetector.getXPosition();
            if (x < 0){
                telemetry.addData("Gold Current Order" , "bbbb");

            }

        } if (detector.getCurrentOrder() == SamplingOrderDetector.GoldLocation.RIGHT) {
            //todo do thing hear
            double x = goldAlignDetector.getXPosition();
            if (0 < x){
                telemetry.addData("Gold Current Order" , "ccccc");

            }
        }

        telemetry.update();
    }


    @Override
    public void stop() {
        detector.disable();
    }

}
