package io.github.owken64.SomeValue4s

trait SomeValue[T]

class Exact[T](val value: T) extends SomeValue[T]
class Approximate[T](val value: T) extends SomeValue[T]
class Exists[T] extends SomeValue[T]
