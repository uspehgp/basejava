package ru.javawebinar.basejava.storage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ListStorageTest.class,
        SortedArrayStorageTest.class,
        ArrayStorageTest.class,
        MapUuidStorageTest.class,
        MapResumeStorageTest.class
})

public class AllStorageTest {
}
