package people;

import Class.CarStatusView;
import Class.CarStatusSearch;


public class ViewStatus {
    public ViewStatus() {
    }

    public void View() {
        CarStatusView carStatusView = new CarStatusView();
        carStatusView.StatusView();
    }

    public void Search(String value) {
        CarStatusSearch carStatusSearch = new CarStatusSearch();
        carStatusSearch.StatusSearch(value);
    }
}
