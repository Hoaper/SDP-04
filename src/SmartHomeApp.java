class SmartHomeApp implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Уведомление от системы умного дома: " + message);
    }
}
