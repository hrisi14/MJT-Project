package bg.sofia.uni.fmi.mjt.bookmarksmanager.server.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.exists;

public class FileCreator {
    public static void createFile(String pathStr)  {
        try {
        Path path = Paths.get(pathStr);
        if (!exists(path)) {
            Files.createFile(path);
          }
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
        }
    }
