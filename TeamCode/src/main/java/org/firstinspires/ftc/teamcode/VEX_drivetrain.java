package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "VEX_drivetrain", group = "summerProjects")
public class Vex_drivetrain extends OpMode{

    public DcMotor motorFrontRight;
    public DcMotor motorFrontLeft;
    public DcMotor motorBackRight;
    public DcMotor motorBackLeft; //rawrhhhh

    public void init() {

        //DRIVETRAIN\\
        motorFrontRight = hardwareMap.dcMotor.get("frontRight");
        motorFrontLeft = hardwareMap.dcMotor.get("frontLeft");
        motorBackRight = hardwareMap.dcMotor.get("backRight");
        motorBackLeft = hardwareMap.dcMotor.get("backLeft");


    }

    public void loop() {
        motorFrontRight.setPower(gamepad1.right_stick_y);
        motorFrontLeft.setPower(gamepad1.left_stick_y);
        motorBackRight.setPower(-gamepad1.right_stick_y);
        motorBackLeft.setPower(-gamepad1.left_stick_y);

            }

        }


