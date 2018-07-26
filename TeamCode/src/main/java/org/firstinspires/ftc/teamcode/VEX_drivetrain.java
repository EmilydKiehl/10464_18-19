package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "VEX_Drivetrain", group = "summerProjects")
public class Vex_Drivetrain extends OpMode {
    private DcMotor motorFrontRight;
    private DcMotor motorFrontLeft;
    private DcMotor motorBackRight;
    private DcMotor motorBackLeft;
    private DcMotor launcher;
    private DcMotor transport;
    private DcMotor collector;

    public void init() {
        motorFrontRight = hardwareMap.dcMotor.get("frontRight");
        motorFrontLeft = hardwareMap.dcMotor.get("frontLeft");
        motorBackRight = hardwareMap.dcMotor.get("backRight");
        motorBackLeft = hardwareMap.dcMotor.get("backLeft");

        motorFrontRight.setDirection(DcMotor.Direction.REVERSE);
        motorBackRight.setDirection(DcMotor.Direction.REVERSE);

        launcher = hardwareMap.dcMotor.get("launcher");
        transport = hardwareMap.dcMotor.get("transport");
        collector = hardwareMap.dcMotor.get("collector");

        launcher.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        launcher.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        launcher.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void loop() {
        motorFrontRight.setPower(gamepad1.right_stick_y);
        motorFrontLeft.setPower(gamepad1.left_stick_y);
        motorBackRight.setPower(gamepad1.right_stick_y);
        motorBackLeft.setPower(gamepad1.left_stick_y);

        if(gamepad2.dpad_up) {
            launcher.setPower(85);
        } else if(gamepad2.dpad_down) {
            launcher.setPower(60);
        } else {
            launcher.setPower(0);
        }

        if(gamepad2.a) {
            collector.setPower(1.0);
        } else if(gamepad2.b) {
            collector.setPower(-1.0);
        } else {
            collector.setPower(0.0);
        }

        if(gamepad2.x) {
            transport.setPower(1.0);
        } else if(gamepad2.y) {
            transport.setPower(-1.0);
        } else {
            transport.setPower(0.0);
        }
    }
}
//CHANGE IS NECESSARY