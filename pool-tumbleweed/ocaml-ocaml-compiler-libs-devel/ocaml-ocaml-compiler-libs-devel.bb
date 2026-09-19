SUMMARY = "Development files for ocaml-ocaml-compiler-libs"
DESCRIPTION = "The ocaml-ocaml-compiler-libs-devel package contains libraries and signature files for \
developing applications that use ocaml-ocaml-compiler-libs."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "ocaml-ocaml-compiler-libs-devel-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "ae2268e75b9646e2c1d03b381e0a9751242d79684fb21717e0a8efebd04720d5c62c5279c8a5a10053206c24977a025255b048eccbc2abe1d32371b3f29da015"

RPROVIDES:${PN} += "ocaml-Ocaml-bytecomp \
ocaml-Ocaml-common \
ocaml-Ocaml-optcomp \
ocaml-Ocaml-shadow \
ocaml-Ocaml-toplevel \
ocaml-ocaml-compiler-libs-devel \
ocamlfind-ocaml-compiler-libs \
ocamlfind-ocaml-compiler-libs.bytecomp \
ocamlfind-ocaml-compiler-libs.common \
ocamlfind-ocaml-compiler-libs.optcomp \
ocamlfind-ocaml-compiler-libs.shadow \
ocamlfind-ocaml-compiler-libs.toplevel \
ocamlx-Ocaml-bytecomp \
ocamlx-Ocaml-common \
ocamlx-Ocaml-optcomp \
ocamlx-Ocaml-shadow \
ocamlx-Ocaml-toplevel"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-ocaml-compiler-libs \
ocamlfind-compiler-libs.bytecomp \
ocamlfind-compiler-libs.common \
ocamlfind-compiler-libs.optcomp \
ocamlfind-compiler-libs.toplevel"

inherit rpm
