SUMMARY = "Graph library for OCaml"
DESCRIPTION = "OCamlgraph is a graph library for Objective Caml."
LICENSE = "LGPL-2.1"

PV = "2.2.0"

RPM_NAME = "ocaml-ocamlgraph-2.2.0-2.1.aarch64.rpm"
RPM_HASH = "c26762308d066a5215a406c923163226eac7d7caf5376da0840ec0b2f7a71bd5d243d735fb44e9bfb7d84e42929192be7f2e2018b28637208bce2107dcc00a9c"

RPROVIDES:${PN} += "ocaml-ocamlgraph"

RDEPENDS:${PN} += ""

inherit rpm
