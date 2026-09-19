SUMMARY = "A composable build system for OCaml"
DESCRIPTION = "This package provides the dune binary and the documentation."
LICENSE = "MIT"

PV = "3.24.2"

RPM_NAME = "ocaml-dune-3.24.2-1.1.aarch64.rpm"
RPM_HASH = "e753fd960f84a2b3c361f55f70dc2b964cb2e69c6517ba4d58551bd3f26957c7cda600f7b0e3c4519db2022f1eb7cbfdd16e6ab2ae196006359c4c65085b54d4"

RPROVIDES:${PN} += "ocaml-dune \
ocaml-dune-bootstrap \
ocaml-dune-bootstrap-devel"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
ocamlfind-compiler-libs"

inherit rpm
