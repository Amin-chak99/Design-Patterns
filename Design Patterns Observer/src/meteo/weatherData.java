package meteo;

import java.util.ArrayList;

public class weatherData {
private int x;
private ArrayList<Affichage> list = new ArrayList<Affichage>();
public void setX (int x) {
	this.x = x ;
	notifier();
}
private void notifier() {
	for(Affichage a : list) {
		a.update(x);
	}
}
}
