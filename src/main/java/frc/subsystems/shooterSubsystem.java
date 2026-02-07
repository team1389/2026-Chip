package frc.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.RobotMap;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;


public class shooterSubsystem extends SubsystemBase{
    private SparkFlex ShooterFlywheel;
    private TalonFX Indexer = new TalonFX(10);

    public shooterSubsystem() {
        ShooterFlywheel = new SparkFlex(14, MotorType.kBrushless);
        Indexer = new TalonFX(10);
        
    }

    public void MoveIndex(double IndexSpeed){
        Indexer.setControl(new VoltageOut((IndexSpeed*RobotMap.IndexerMaxSpeed)));
        
    }
    public void StopIndex(){
        Indexer.setControl(new VoltageOut(0));
    }

    public void RevShooter(){
        ShooterFlywheel.set(-32.0);
    }

    public void StopShooter(){
        ShooterFlywheel.set(0);
    }
}