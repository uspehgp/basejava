package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.model.Resume;

import static org.junit.Assert.*;

public class MapUuidStorageTest extends AbstractStorageTest{

    public MapUuidStorageTest(){
        super(new MapUuidStorage());
    }


}