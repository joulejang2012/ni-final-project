package ni;

/*
State of interacting with a single puzzle; receives user input pushed 
from `SceneState`, transitioning to new state.
*/

public interface IPuzzleState {
  /* Transitions from old state `from` on event `evt`.
   * Returns the new state.
   */
  public static PuzzleState transition (PuzzleState from, UserInputEvent evt);

  /* Gets the `Puzzle` which this state is talking about.
   */
  public Puzzle puzzle ();

  /* Gets what input events the user has already input.
   */
  public InputSequence pastUserInput ();
}