/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: JugadorRemoto.java 641 2006-11-14 16:22:14Z da-romer $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License versi�n 2.1
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n12_batallaNaval
 * Autor: Mario S�nchez - 23/02/2006
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.batallaNaval.servidor;

/**
 * Esta clase representa a un jugador que se conect� al servidor para jugar batalla naval y est� participando en un encuentro.<br>
 * <b>inv:</b><br>
 * registroJugador != null<br>
 * puntosEncuentro >= 0
 */
public class JugadorRemoto
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Registro con la informaci�n de los partidos del jugador antes de iniciar el encuentro
     */
    private RegistroJugador registroJugador;

    /**
     * El puntaje del jugador en el encuentro actual
     */
    private int puntosEncuentro;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el objeto para mantener la informaci�n del jugador remoto. <br>
     * Al iniciar el encuentro, el puntaje es 0.
     * @param registro El registro del jugador antes de empezar el encuentro actual - registro != null
     */
    public JugadorRemoto( RegistroJugador registro )
    {
        registroJugador = registro;
        puntosEncuentro = 0;
        verificarInvariante( );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el registro del jugador
     * @return registroJugador
     */
    public RegistroJugador darRegistroJugador( )
    {
        return registroJugador;
    }

    /**
     * Retorna los puntos del jugador en el encuentro actual
     * @return puntosEncuentro
     */
    public int darPuntosPartida( )
    {
        return puntosEncuentro;
    }

    /**
     * Aumenta en una determinada cantidad el n�mero de puntos
     * @param cantidad La cantidad que debe aumentarse el n�mero de puntos - cantidad >= 0
     */
    public void aumentarPuntosEncuentro( int cantidad )
    {
        puntosEncuentro += cantidad;
        verificarInvariante( );
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    /**
     * Verifica el invariante de la clase<br>
     * <b>inv</b><br>
     * registroJugador != null<br>
     * puntosEncuentro >= 0;
     */
    private void verificarInvariante( )
    {
        assert ( registroJugador != null ) : "El registros de un jugador no puede ser null";
        assert ( puntosEncuentro >= 0 ) : "El n�mero de puntos de un jugador debe ser mayor o igual a 0";
    }
}