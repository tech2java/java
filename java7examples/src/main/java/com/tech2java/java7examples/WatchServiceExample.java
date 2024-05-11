package com.tech2java.java7examples;

import java.io.IOException;
import java.nio.file.*;

public class WatchServiceExample {

    public static void main(String[] args) throws IOException, InterruptedException {

        WatchService watchService =FileSystems.getDefault().newWatchService();

        Path path= Paths.get("E://FileWatcherDir");

        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY,StandardWatchEventKinds.ENTRY_DELETE);

        boolean poll=true;
        WatchKey key=watchService.take();

        while (poll){
            for(WatchEvent<?> event:key.pollEvents()){
                System.out.println("event kind::"+event.kind() +"--for the file::"+event.context());
            }

            poll=key.reset();
        }

    }
}
