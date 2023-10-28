class LampFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice() {
        return new SmartDevice("Лампа");
    }
}
