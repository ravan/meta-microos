SUMMARY = "Various signed and unsigned integer types for OCaml"
DESCRIPTION = "The ocaml-integers library provides a number of 8-, 16-, 32- and 64-bit \
signed and unsigned integer types, together with aliases such as long \
and size_t whose sizes depend on the host platform."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "ocaml-integers-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "7c8b767818b4dc63595bf74a30057c8e564f521d2f51ebac7527e09068968be55535356394260fe79f05dd9bf38e4a039287426839f838cbf06a320f82890a0e"

RPROVIDES:${PN} += "ocaml-integers"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
