package com.example.gameboard.beans;

public enum MenuOption {
    
    start(1,"Start Game"),point(2,"Show Point"),exit(3,"Exit");
    
    private Integer id;
    private String name;
    
    MenuOption(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public static MenuOption getMenuOptionById(Integer id){
        MenuOption[] menuOptions = MenuOption.values();
        for(MenuOption mo : menuOptions){
            if(mo.getId().equals(id)){
                return mo;
            }
        }
        
        return null;
    }
    
    public static void printMenuOptions(){
        MenuOption[] menuOptions = MenuOption.values();
        for(MenuOption mo : menuOptions){
            System.out.println(mo.getId()+"."+mo.getName());
        }
    }

}
