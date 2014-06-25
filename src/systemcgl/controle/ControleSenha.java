/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl.controle;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import systemcgl.entidades.Usuario;
import systemcgl.repositorio.RepositorioUsuario;
/**
 *
 * @author zare
 */
public class ControleSenha {

    private static MessageDigest md = null;

    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
    }

    private static char[] hexCodes(byte[] text) {
        char[] hexOutput = new char[text.length * 2];
        String hexString;

        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.toUpperCase().getChars(hexString.length() - 2,
                    hexString.length(), hexOutput, i * 2);
        }
        return hexOutput;
    }

    public static String criptoSenha(String senha) {
        if (md != null) {
            return new String(hexCodes(md.digest(senha.getBytes())));
        }
        return null;
    }

    public static boolean comparaSenha(Usuario usr) throws ClassNotFoundException {
        RepositorioUsuario ru = new RepositorioUsuario();

        String senhaIn = usr.getSenha();
        senhaIn = criptoSenha(senhaIn);
        String senhaBD = ru.obterSenhaDb(usr.getId());
        System.out.println("recebeu a senha para comparar com a senha do BD ");
        if (senhaIn.equals(senhaBD)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void setSenha(Usuario usr) throws ClassNotFoundException{
        
        RepositorioUsuario ru = new RepositorioUsuario();

        String novaSenha = usr.getSenha();
        novaSenha = criptoSenha(novaSenha);

        ru.altSenhaDb(usr.getId(), novaSenha);
        
    }


}
