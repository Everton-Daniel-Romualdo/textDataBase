package entities;

import entities.Writer_and_reader.*;

public class textDataBase {
    private String name;
    private String filePatch;
    private int amountInformationPerLine;
    private String textSepator;
    private GeneralReader generalReader;
    private GeneralWriter generalWriter;


    public textDataBase(String name, String filePatch, int amountInformationPerLine, String textSepator) {
        this.name = name;
        this.filePatch = filePatch;
        this.amountInformationPerLine = amountInformationPerLine;
        this.textSepator = textSepator;
        this.generalReader = new GeneralReader();
        this.generalWriter = new GeneralWriter();
    }
    
}
