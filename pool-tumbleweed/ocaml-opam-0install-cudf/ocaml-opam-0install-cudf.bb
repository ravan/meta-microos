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
LICENSE = "ISC"

PV = "0.5.0"

RPM_NAME = "ocaml-opam-0install-cudf-0.5.0-4.1.aarch64.rpm"
RPM_HASH = "d3fdeeaf507b2e0c57f0f73c352830518b90bf937563c3e41b67a19822492e2ead9255264fe9002c8f22a68cf70a260ed4aa4affd6f5a1b0407fafd3ca8ac7e6"

RPROVIDES:${PN} += "ocaml-opam-0install-cudf"

RDEPENDS:${PN} += ""

inherit rpm
