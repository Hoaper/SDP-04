import java.util.ArrayList;
import java.util.List;


class SmartDevice implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String deviceName;
    private boolean isOn = false;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void turnOn() {
        isOn = true;
        notifyObservers(deviceName + " включен");
    }

    public void turnOff() {
        isOn = false;
        notifyObservers(deviceName + " выключен");
    }
}
