package tn.esprit.test.Services;

import tn.esprit.test.entity.Menu;

import java.util.List;

public interface IMenuService {
    Menu saveMenu(Menu menu);
    Menu getMenuById(Long id);
    List<Menu> getAllMenus();
    Menu updateMenu(Long id, Menu menu);
    void deleteMenu(Long id);
    List<Menu> addMenus(List<Menu> menus);
}
