package simpleclass;

import java.io.*;
import java.util.LinkedList;

public class Persistencia {
   
    private FileInputStream fileStream;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private boolean continua = true;
    private boolean moreRecords = true;
    private LinkedList<Usuario> user = new LinkedList<Usuario>();

    public LinkedList<Usuario> getUser() {
        return user;
    }

    public boolean getContinua() {
        return continua;
    }

  
    public void setupLer(String arquivo) {
        //Abre arquivo para leitura
        try {
            fileStream = new FileInputStream(arquivo);
            input = new ObjectInputStream(fileStream);
        }catch (EOFException eof) {
            continua = false; //arquivo está vazio
        }catch (IOException e) {
            System.err.println("Falha na Abertura do Arquivo para Leitura\n" + e.toString());
            System.exit(1);
        }
    }


    public void readRecords() {
        //Carrega todo o conteúdo do arquivo na Coleção produto
        try{
            while (moreRecords) {
                user.add((Usuario) input.readObject());
            }
        }catch(EOFException eof){
             moreRecords = false;
        }catch(IOException e){
             System.err.println("Erro durante leitura do arquivo\n" + e.toString());
             System.exit(1);
        }catch(ClassNotFoundException c){
             System.err.println("Erro durante leitura do arquivo - Objeto Inválido\n"+ c.toString());
        }
    }

    public void cleanupLer() {
    //Fechar o arquivo, após ter sido descarregado na coleção
        try{
            input.close();
        }catch (IOException e){
            System.err.println("Falha no Fechamento do Arquivo durante Leitura\n"+ e.toString());
            System.exit(1);
        }
    }

    public void setupGravar(String arquivo) {
    //Abre arquivo para gravar
        try{
            output = new ObjectOutputStream(new FileOutputStream(arquivo, false));
        }catch (IOException e) {
            System.err.println("Falha na Abertura do Arquivo para Gravação\n" + e.toString());
            System.exit(1);
        }
    }

    public void addRecords(LinkedList<Usuario> user) {
    //Carrega toda a coleção no arquivo
        try {
            for (Usuario a : user) {
                output.writeObject(a);
            }
        }catch (IOException e) {
            System.err.println("Erro durante gravação no arquivo\n" + e.toString());
            System.exit(1);
        }
    }

    public void cleanupGravar() {
    //Fechar o arquivo, após todos os objetos terem sido gravados
        try {
            output.flush();
            output.close();
        }catch (IOException e) {
            System.err.println("Falha no Fechamento do Arquivo – Durante Gravação!!\n" + e.toString());
            System.exit(1);
        }
    }
}