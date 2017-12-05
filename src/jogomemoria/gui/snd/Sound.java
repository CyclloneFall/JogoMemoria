/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui.snd;
import java.applet.Applet;
import java.applet.AudioClip;
/**
 *
 * @author barbara
 */
public class Sound {
    public static final AudioClip ABERTURA = Applet.newAudioClip(Sound.class.getResource("BARK.wav"));
    public static final AudioClip CERTO = Applet.newAudioClip(Sound.class.getResource("acerto.wav"));
    public static final AudioClip ERRO = Applet.newAudioClip(Sound.class.getResource("erro.wav"));
}
