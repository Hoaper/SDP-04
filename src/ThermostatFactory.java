class ThermostatFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice() {
        return new SmartDevice("Термостат");
    }
}
