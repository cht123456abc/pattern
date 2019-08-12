package abstractfactory;

public interface CarFactory {

	Engine createEngine();
	Seat createSeat();
	Car createCar();
}
