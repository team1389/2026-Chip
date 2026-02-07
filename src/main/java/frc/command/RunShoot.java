package frc.command;

import frc.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;

public class RunShoot extends Command {
    public shooterSubsystem IntakeSubsystem;

    public RunShoot(shooterSubsystem IntakeSubsystem) {
        this.IntakeSubsystem = IntakeSubsystem;
    }

    public void initialize(){
        //put things that need to be initialized here (such as a timer). No need to @Override.
    }

    @Override
    public void execute() {
        //This gets called when the command does. 
        IntakeSubsystem.RevShooter();
    }

    @Override
    public void end(boolean interrupted) {
        //this gets called when the input stops being given. 
        IntakeSubsystem.StopShooter();
    }

    @Override
    public boolean isFinished(){
        //If true is returned, the command will stop being run. Can be used to check if a encoder is at right place or limit switch is press (for example)
        return false;
    }
}
