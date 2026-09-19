SUMMARY = "A statically typed compiled systems programming language"
DESCRIPTION = "Nim is a statically typed compiled systems programming language. It \
combines successful concepts from mature languages like Python, Ada \
and Modula. \
 \
Efficient: \
* Nim generates native dependency-free executables, not dependent on \
  a virtual machine, which are small and allow easy redistribution. \
* The Nim compiler and the generated executables support all major \
  platforms like Windows, Linux, BSD and macOS. \
* Nim's memory management is deterministic and customizable with \
  destructors and move semantics, inspired by C++ and Rust. It is \
  well-suited for embedded, hard-realtime systems. \
* Modern concepts like zero-overhead iterators and compile-time \
  evaluation of user-defined functions, in combination with the \
  preference of value-based datatypes allocated on the stack, lead \
  to extremely performant code. \
* Support for various backends: it compiles to C, C++ or JavaScript \
  so that Nim can be used for all backend and frontend needs. \
 \
Expressive: \
* Nim is self-contained: the compiler and the standard library are \
  implemented in Nim. \
* Nim has a powerful macro system which allows direct manipulation \
  of the AST, offering nearly unlimited opportunities. \
 \
Elegant: \
* Macros cannot change Nim's syntax because there is no need for it \
  — the syntax is flexible enough. \
* Modern type system with local type inference, tuples, generics and \
  sum types. \
* Statements are grouped by indentation but can span multiple lines."
LICENSE = "MIT"

PV = "2.2.12"

RPM_NAME = "nim-2.2.12-1.1.aarch64.rpm"
RPM_HASH = "517cc91e6c64acd8c86eb627c95547da611e99860ad30b0d7e1868e27491544f6c57910901779fc8616439c4aa465a9d81a21b8d809163e224383617fae34e51"

RPROVIDES:${PN} += "config-nim \
nim"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
