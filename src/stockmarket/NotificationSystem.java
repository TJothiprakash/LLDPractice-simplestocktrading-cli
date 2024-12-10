package stockmarket;

import entities.User;

/*
Notification System:
Sends updates to users in real time.
Could use the Observer Pattern for decoupling.
*/
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
    // Enhanced Notification System
    public class NotificationSystem {
        private Map<String, List<User>> subscribers = new ConcurrentHashMap<>(); // Thread-safe

        public void subscribe(User user, String notificationType) {
            subscribers.putIfAbsent(notificationType, Collections.synchronizedList(new ArrayList<>()));
            subscribers.get(notificationType).add(user);
        }

        public void unsubscribe(User user, String notificationType) {
            if (subscribers.containsKey(notificationType)) {
                subscribers.get(notificationType).remove(user);
            }
        }

        public void notify(String notificationType, String message) {
            if (subscribers.containsKey(notificationType)) {
                synchronized (subscribers.get(notificationType)) {
                    for (User user : subscribers.get(notificationType)) {
                        user.receiveNotification(message);
                    }
                }
            }
        }

        public void sendNotification(User user, String message) {
            // Send the notification to the user
            //
            //
            //

        }
    }

