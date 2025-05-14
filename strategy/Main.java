package strategy;

public class Main {
  
  public static void main(String[] args) {
    RoutePlanner planner = new RoutePlanner();
    planner.setRouteStrategy(new FastestRouteStrategy());
    planner.planRoute("Av. Paulista", "USP");

    planner.setRouteStrategy(new EcoFriendlyStrategy());
    planner.planRoute("Av. Paulista", "USP");

    planner.setRouteStrategy(new ShortestRouteStrategy());
    planner.planRoute("Av. Paulista", "USP");

    planner.setRouteStrategy(new EconomicRouteStrategy());
    planner.planRoute("Av. Paulista", "USP");
  }
}
