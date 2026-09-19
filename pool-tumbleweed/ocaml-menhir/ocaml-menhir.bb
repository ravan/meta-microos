SUMMARY = "LR(1) parser generator for the OCaml programming language"
DESCRIPTION = "LR(1) parser generator"
LICENSE = "LGPL-2.0"

PV = "20260209"

RPM_NAME = "ocaml-menhir-20260209-1.2.aarch64.rpm"
RPM_HASH = "b0818d18426cd390d3411a60d41b730af23d640cb71106ae59d91942419d8dae6f81f641734898edaf2cd3621ea792e57e54a554bd863e0f8b358906035aa11d"

RPROVIDES:${PN} += "ocaml-menhir"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
