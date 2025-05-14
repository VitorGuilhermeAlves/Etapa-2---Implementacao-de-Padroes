package strategy;

class InformationGetter{

  public int getclimate(String origin, String target){
    return 1; //1 para clima ruim e 0 para clima bom
  }

  public int getTraffic(String origin, String target){
    return 1; //1 para transito ruim e 0 para transito bom
  }

  public int getDistance(String origin, String target){
    return 10; //devolve a distancia em km
  }

  public int getTransportType(String origin, String target){
    return 1; //0 para moto, 1 para carro
  }
}