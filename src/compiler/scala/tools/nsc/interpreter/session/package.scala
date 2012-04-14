/* NSC -- new Scala compiler
 * Copyright 2005-2011 LAMP/EPFL
 * @author Paul Phillips
 */

package scala.tools.nsc
package interpreter
import language.implicitConversions

/** Files having to do with the state of a repl session:
 *  lines of text entered, types and terms defined, etc.
 */
package object session {
  type JIterator[T]     = java.util.Iterator[T]
  type JListIterator[T] = java.util.ListIterator[T]

  private[interpreter] implicit def charSequenceFix(x: CharSequence): String = x.toString
}
