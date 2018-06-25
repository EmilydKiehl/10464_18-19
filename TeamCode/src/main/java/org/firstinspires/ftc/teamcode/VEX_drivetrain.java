package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "VEX_drivetrain", group = "summerProjects")
public class Vex_drivetrain extends OpMode{

    public DcMotor motorFrontRight;
    public DcMotor motorFrontLeft;
    public DcMotor motorBackRight;
    public DcMotor motorBackLeft;

    public void init() {

        //DRIVETRAIN\\
        motorFrontRight = hardwareMap.dcMotor.get("frontRight");
        motorFrontLeft = hardwareMap.dcMotor.get("frontLeft");
        motorBackRight = hardwareMap.dcMotor.get("backRight");
        motorBackLeft = hardwareMap.dcMotor.get("backLeft");


    }

    public void loop(){
        if(gamepad1.left_trigger > .1 || gamepad1.right_trigger > .1){
            if(gamepad1.left_trigger > gamepad1.right_trigger){
                motorFrontRight.setPower(gamepad1.left_trigger);
                motorFrontLeft.setPower(gamepad1.left_trigger);
                motorBackRight.setPower(-gamepad1.left_trigger);
                motorBackLeft.setPower(-gamepad1.left_trigger);
            }
            else{
                motorFrontRight.setPower(-gamepad1.right_trigger);
                motorFrontLeft.setPower(-gamepad1.right_trigger);
                motorBackRight.setPower(gamepad1.right_trigger);
                motorBackLeft.setPower(gamepad1.right_trigger);
            }
        }
        else{
            motorFrontRight.setPower(-gamepad1.left_stick_x);
            motorFrontLeft.setPower(-gamepad1.left_stick_x);
            motorBackRight.setPower(gamepad1.left_stick_y);
            motorBackLeft.setPower(gamepad1.left_stick_y);
    }

    }


    }


