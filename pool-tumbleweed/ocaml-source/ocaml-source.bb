SUMMARY = "Source code for OCaml libraries"
DESCRIPTION = "OCaml is a high-level, strongly-typed, functional and object-oriented \
programming language from the ML family of languages. \
 \
This package contains source code for OCaml libraries."
LICENSE = "QPL-1.0 & SUSE-LGPL-2.0-with-linking-exception"

PV = "5.5.0"

RPM_NAME = "ocaml-source-5.5.0-2.1.aarch64.rpm"
RPM_HASH = "6a151a4792929fe5b929eee4047b32a80a6b0bc9769582a3f0f37169eb69c23c448e8fc550844288d59423d8468af11e4fc5b5e01cff5ecb69b36343e006e1a8"

RPROVIDES:${PN} += "ocaml-source"

RDEPENDS:${PN} += ""

inherit rpm
