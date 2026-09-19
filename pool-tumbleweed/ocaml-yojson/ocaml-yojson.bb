SUMMARY = "JSON parsing and pretty-printing library"
DESCRIPTION = "Yojson is an optimized parsing and printing library for the JSON format. It \
addresses a few shortcomings of json-wheel including 2x speedup, polymorphic \
variants and optional syntax for tuples and variants. \
 \
ydump is a pretty-printing command-line program provided with the yojson \
package. \
 \
The program atdgen can be used to derive OCaml-JSON serializers and \
deserializers from type definitions."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "ocaml-yojson-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "e29a55b6dfebc14ba19448319707a61e3e0721ff7e854f8096f94e4f66bc26a83689aac079a3109aa0940b29b7017b4f67b1258c10fe653b354e9b227f129ea0"

RPROVIDES:${PN} += "ocaml-yojson"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
