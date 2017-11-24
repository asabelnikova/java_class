package tasks.filereader;

abstract class FileProcessor {
    private String a;

    public FileProcessor(final String a) {
        this.a = a;
    }

    abstract void fileExists();
}
