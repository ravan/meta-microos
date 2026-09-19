SUMMARY = "Minimal XML parser and printer for OCaml"
DESCRIPTION = "Xml-Light is a minimal XML parser & printer for OCaml. It provides \
functions to parse an XML document into an OCaml data structure, work \
with it, and print it back to an XML document. It support also DTD \
parsing and checking, and is entirely written in OCaml, hence it does \
not require additional C library."
LICENSE = "LGPL-2.1+"

PV = "2.5"

RPM_NAME = "ocaml-xml-light-2.5-2.1.aarch64.rpm"
RPM_HASH = "6adc4088842f54cba19cc015eb72b27ecad4555d8cf0a992e7a9951031db4250d5a2a607687913e7b07e533e132d215cc9d51ed9b55d59dc83c50c90140f54a7"

RPROVIDES:${PN} += "ocaml-xml-light"

RDEPENDS:${PN} += ""

inherit rpm
