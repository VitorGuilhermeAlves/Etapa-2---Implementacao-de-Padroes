package strategy;

class RoutePlanner {
  private RouteStrategy routeStrategy;

  public RoutePlanner(){
    this.routeStrategy = new EconomicRouteStrategy();
  }

  public void setRouteStrategy(RouteStrategy routeStrategy) {
    this.routeStrategy = routeStrategy;
  }

  public void planRoute(String origin, String target){
    routeStrategy.calculateRoute(origin, target);
  }
}