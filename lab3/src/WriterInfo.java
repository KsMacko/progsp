public class WriterInfo {
    public static void ShowInfo(Auto auto){
        System.out.println("Марка: "+auto.getBrand()+
                "\nТип двигателя: "+auto.getEngineType()+
                "\nМощность(кВт): "+auto.getPower()+
                "\nВес (кг): "+auto.getWeight()+
                "\nПробег (км): "+auto.getMileage());
    }
    public static void ShowInfo(Car car){
        System.out.println("\n--Car--");
        ShowInfo((Auto) car);
        System.out.println("Расход топлива на 100 км (л): "+car.getFuelConsumption()+
                "\nРазгон до 100км/ч (с)"+car.getAccelerationTime());
    }
    public static void ShowInfo(Truck truck){
        System.out.println("\n--Truck--");
        ShowInfo((Auto) truck);
        System.out.println("Тип кузова: "+truck.getBodyType()+
                "\nГрузоподъемность (т): "+truck.getLoadCapacity());
    }
    public static void ShowInfo(Bus bus){
        System.out.println("\n--Bus--");
        ShowInfo((Auto) bus);
        System.out.println("Количество мест: "+bus.getAmountOfPlaces());
    }
}
