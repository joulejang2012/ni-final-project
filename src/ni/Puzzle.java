package ni;

/*
Data container for a puzzle, with external events 
that are triggered during events in puzzle's lifecycle.
*/

public class Puzzle {

  /* Gets the correct sequence of inputs for this puzzle.
   */
  public InputSequence answer ();

  /* Gets the event queue to be triggered when this puzzle is started.
   */
  public ExternalEvent[] onStart ();

  /* Gets the event queue to be triggered when this puzzle is successfully completed.
   */
  public ExternalEvent[] onComplete ();

  /* Gets the event queue to be triggered on the specified event index.
   */
  public ExternalEvent[] onInputElement (int index);

  /* Gets the event queue to be triggered on a wrong input.
   */
  public ExternalEvent[] onFail ();

}