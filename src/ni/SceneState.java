package ni;

/*
State of the piece; receives user input and propagates into puzzles; 
moves from puzzle to puzzle; sends events out to trigger video / other actions.
*/

public class SceneState {
  
  /* Constructs a new SceneState with the provided puzzles, 
   *   starting at the beginning of the first puzzle.
   */
  public SceneState (Puzzle[] puzzles) {
    // TODO
  }

  /* Transitions from old state `from` on event `evt`.
   * Returns a tuple of the new state, and a list of `ExternalEvent` triggered by the transition.
   */
  public Tuple<SceneState, ExternalEvent[]> transition (SceneState from, UserInputEvent evt) {
    // TODO
  }

  /* Gets the current state of the current puzzle.
   */
  public PuzzleState puzzleState () {
    // TODO
  }

  /* Gets the scene's puzzle sequence.
   */
  public Puzzle[] puzzleSequence () {
    // TODO
  }

}
