package engine;

/**
 * Implements an object that stores the state of the game between levels.
 * 
 * @author <a href="mailto:RobertoIA1987@gmail.com">Roberto Izquierdo Amo</a>
 * 
 */
public class GameState {

	/** Current game level. */
	private int level;
	/** Current score. */
	private int p1Score;
	private int p2Score;
	/** Lives currently remaining. */
	private int p1LivesRemaining;
	private int p2LivesRemaining;
	/** Bullets shot until now. */
	private int bulletsShot;
	/** Ships destroyed until now. */
	private int shipsDestroyed;

	/**
	 * Constructor.
	 * 
	 * @param level
	 *            Current game level.
	 * @param p1Score
	 *
	 * @param p2Score
	 *            Current score.
	 * @param p2LivesRemaining
	 * @param P1LivesRemaining
	 *            Lives currently remaining.
	 * @param bulletsShot
	 *            Bullets shot until now.
	 * @param shipsDestroyed
	 *            Ships destroyed until now.
	 */
	public GameState(final int level, final int p1Score, final int p2Score,
			final int p1LivesRemaining, final int p2LivesRemaining ,final int bulletsShot,
			final int shipsDestroyed) {
		this.level = level;
		this.p1Score = p1Score;
		this.p2Score = p2Score;
		this.p1LivesRemaining = p1LivesRemaining;
		this.p2LivesRemaining = p2LivesRemaining;
		this.bulletsShot = bulletsShot;
		this.shipsDestroyed = shipsDestroyed;
	}

	/**
	 * @return the level
	 */
	public final int getLevel() {
		return level;
	}

	/**
	 * @return the score
	 */
	public final int getp1Score() {
		return p1Score;
	}

	public final int getp2Score() {
		return p2Score;
	}

	/**
	 * @return the livesRemaining
	 */
	public final int getp1LivesRemaining() {
		return p1LivesRemaining;
	}
	public final int getp2LivesRemaining() {
		return p2LivesRemaining;
	}

	/**
	 * @return the bulletsShot
	 */
	public final int getBulletsShot() {
		return bulletsShot;
	}

	/**
	 * @return the shipsDestroyed
	 */
	public final int getShipsDestroyed() {
		return shipsDestroyed;
	}

}
