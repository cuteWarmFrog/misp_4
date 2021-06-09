package pointCounter;

import point.Point;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;
import java.util.List;

public class PointCounter extends NotificationBroadcasterSupport implements PointCounterMBean {

    private int sequenceCounter = 0;
    private long missCount;
    private long count;

    public void update(List<Point> points) {
        count = points.size();
        missCount = points.stream().filter(point -> !point.isHit()).count();
        if (points.size() % 10 == 0) {
            Notification notification = new Notification(
                    "dividesBy10", this, sequenceCounter++,
                    System.currentTimeMillis(), "Count divides by 10"
            );
            System.out.println("Points amount divides by 10!");
            this.sendNotification(notification);
        }
    }

    @Override
    public long getPointsCount() {
        return count;
    }

    @Override
    public long getMissCount() {
        return missCount;
    }
}
