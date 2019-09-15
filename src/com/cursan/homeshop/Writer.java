package com.cursan.homeshop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * Write on line
     */
    public void writeLine(String line);

    /**
     * Stop writing
     */
    public void stop();
}
