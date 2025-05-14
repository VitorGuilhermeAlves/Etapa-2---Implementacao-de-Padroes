package strategy;

class EconomicRouteStrategy extends RouteStrategy{
  private double km_price = 0.5;
  private double trasnport_price = 1.2;

  private double trafic_time = 50;
  private double km_time = 0.20;
  private double climate_time = 30;
  private double transport_time = 30;

  public void calculateRoute(String origin, String Target) {
    InformationGetter info = new InformationGetter();

    System.out.println("Calculating economicRoute from " + origin + " to " + Target + "...");
    System.out.println("Estimated time: "+((info.getTraffic(origin, Target)*trafic_time)+(info.getDistance(origin, Target)*km_time)+(info.getclimate(origin, Target)*climate_time)+(info.getTransportType(origin, Target)*transport_time))+" min");
    System.out.println("Distance: " + info.getDistance(origin, Target) +" km");
    System.out.println("Cost: R$"+((info.getDistance(origin, Target)*km_price)*(info.getTransportType(origin, Target)*trasnport_price)));
  }
}