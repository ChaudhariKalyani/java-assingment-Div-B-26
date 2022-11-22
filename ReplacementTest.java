public class ReplacementTest{
    public static void main(String[] args){
            try {
                Equipment standardFuelEquipment = new StandardEquipment("Binnings Rake","model01",2017,0.6);
                Equipment standardFuelEquipments = new StandardEquipment("Binnings Spade","model02",2019,0.3);
                
                Equipment batteryPoweredEquipment = new BatteryPoweredEquipment("Botch Mower","model03",2020,2);
                Equipment batteryPoweredEquipments = new BatteryPoweredEquipment("Havana Chain Saw","model04",2019,1);
                
                Equipment fuelEquipment = new FuelPoweredEquipment("Nikita Edge Trimmer","ewe",2021,50);
                Equipment fuelEquipments = new FuelPoweredEquipment("Nikita Edge Trimmer","ewe",2021,100);
                
                standardFuelEquipment.showDetails();
                standardFuelEquipments.showDetails();
                
                batteryPoweredEquipment.showDetails();
                batteryPoweredEquipments.showDetails();
                
                fuelEquipment.showDetails();
                fuelEquipments.showDetails();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }    
    }
}