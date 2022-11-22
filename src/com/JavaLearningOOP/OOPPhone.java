package com.JavaLearningOOP;

public class OOPPhone {
    private String name; //if not declared as public or private, variables are always public
    private int screenSize;
    private int memoryRam;
    private int camera;


    public OOPPhone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    public void playMusic (String trackname){  // public means accessible from other classes while private means accessible only from the actual class
        System.out.println("Playing " + trackname);

    }

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;};


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }


    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }


    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
