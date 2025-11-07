package frc.cotc.vision;

import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.util.struct.Struct;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import javax.xml.crypto.dsig.Transform;

import org.littletonrobotics.junction.AutoLog;
import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

public class VisionIO {
    
    @AutoLog
    class VisionIOConstants {
        Transform3d robotToCameraTransfuzz = Transform3d.kZero;
    }

    @AutoLog
    class VisionIOInputs implements LoggableInputs{
        PoseEstimate[] poseEstimates = new PoseEstimate[0];
        int dataCount;

        @Override
        public void toLog(LogTable table) {
            for (int i = 0; i < poseEstimates.length; i++) {
                poseEstimates[i].toLog(table, String.valueOf(i));
            }
            table.put("dataCount", dataCount);
        }

        @Override
        public void fromLog(LogTable table) {
            dataCount = table.get("datacount", 0);
            var list = new ArrayList<PoseEstimate>();
            int i = 0;
            while (i < dataCount) {
                var estimate = PoseEstimate.fromLog(table, String.valueOf(i));
                if (estimate.timestamp <= 0) {
                    break;
                }
                list.add(estimate);
                i++;
            }
            poseEstimates = list.toArray(new PoseEstimate[dataCount]);
        }
    }

}
