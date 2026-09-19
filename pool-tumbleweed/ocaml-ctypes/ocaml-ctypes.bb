SUMMARY = "Combinators for binding to C libraries without writing any C"
DESCRIPTION = "ctypes is a library for binding to C libraries using pure OCaml. The primary aim is to make writing C extensions as straightforward as possible. \
 \
The core of ctypes is a set of combinators for describing the structure of C types -- numeric types, arrays, pointers, structs, unions and functions. You can use these combinators to describe the types of the functions that you want to call, then bind directly to those functions -- all without writing or generating any C!"
LICENSE = "ISC"

PV = "0.24.0"

RPM_NAME = "ocaml-ctypes-0.24.0-2.3.aarch64.rpm"
RPM_HASH = "ea0c85883d10f4dbe4c6bdfb649f8534c9eeeb13d3bd80d90e468cac80cfe2a3b289f0464b977bc23379d54751e820c024a7fa6db45f4a08547f63ac68c45770"

RPROVIDES:${PN} += "ocaml-ctypes"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8"

inherit rpm
