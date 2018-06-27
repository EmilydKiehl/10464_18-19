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
    public DcMotor launcher;
    public DcMotor transport;
    public DcMotor collector;

    public void init() {
        motorFrontRight = hardwareMap.dcMotor.get("frontRight");
        motorFrontLeft = hardwareMap.dcMotor.get("frontLeft");
        motorBackRight = hardwareMap.dcMotor.get("backRight");
        motorBackLeft = hardwareMap.dcMotor.get("backLeft");

        launcher = hardwareMap.dcMotor.get("launcher");
        transport = hardwareMap.dcMotor.get("transport");
        collector = hardwareMap.dcMotor.get("collector");

        launcher.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        launcher.setMode(DcMotor.RunMode.RUN_USING_ENCODER); //rawrhhh
        launcher.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void loop() {
        motorFrontRight.setPower(gamepad1.right_stick_y);
        motorFrontLeft.setPower(gamepad1.left_stick_y);
        motorBackRight.setPower(-gamepad1.right_stick_y);
        motorBackLeft.setPower(-gamepad1.left_stick_y);

        if(gamepad2.dpad_up) {
            launcher.setTargetPosition(launcher.getTargetPosition() + 10);
        } else if(gamepad2.dpad_down) {
            launcher.setTargetPosition(launcher.getTargetPosition() + 5);
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
//CHANGE IS BAD