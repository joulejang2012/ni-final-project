package ni;

/*
Sequence of `UserInputEvent`s, with some convenience methods.
*/

public class InputSequence {

  /* Pushes `evt` onto the InputSequence `onto`.
   * Returns the new InputSequence.
   */
  public static InputSequence push (UserInputEvent evt, InputSequence onto) {
    // TODO
  }

  /* Checks if this `InputSequence` is prefixed by the InputSequence `prefix`.
   */
  public boolean hasPrefix (InputSequence prefix) {
    // TODO
  }

  /* Returns a view of this InputSequence as an array of `UserInputEvent`.
   */
  public UserInputEvent[] asEventList () {
    // TODO
  }

  @Override
  public boolean equals (Object o) {
    // TODO
  }
  
}