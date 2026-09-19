SUMMARY = "Base library and tools for ppx rewriters"
DESCRIPTION = "The ppxlib project provides the basis for the ppx system, which is \
currently the officially supported method for meta-programming in \
OCaml. It offers a principled way to generate code at compile time in \
OCaml projects."
LICENSE = "MIT"

PV = "0.38.0"

RPM_NAME = "ocaml-ppxlib-0.38.0-1.3.aarch64.rpm"
RPM_HASH = "29e049c86219bd9a6c4c3ab7378297224ea1edf3609a7731127bd9c8f504fca100c6f651f78eb2aa119ec67d962ea4672b58c9de9f3cf0b3268f467ea02558c9"

RPROVIDES:${PN} += "ocaml-ppxlib"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libzstd.so.1"

inherit rpm
