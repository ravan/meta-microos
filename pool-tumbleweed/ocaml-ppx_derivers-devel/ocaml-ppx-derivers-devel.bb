SUMMARY = "Development files for ocaml-ppx_derivers"
DESCRIPTION = "The ocaml-ppx_derivers-devel package contains libraries and signature files for \
developing applications that use ocaml-ppx_derivers."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ocaml-ppx_derivers-devel-1.2.1-5.1.aarch64.rpm"
RPM_HASH = "6cf3bb6c4d6b35a74bd8d8ad8fd53ada91b41ac17a68c7e6014f1288dd4a82211371c276a617d7e71c68dcdd7931fad9940b3b8500143757f17156a18e3ec0bf"

RPROVIDES:${PN} += "ocaml-Ppx-derivers \
ocaml-ppx-derivers-devel \
ocamlfind-ppx-derivers \
ocamlx-Ppx-derivers"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Uchar \
ocaml-ppx-derivers \
ocamlx-Stdlib \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Printf"

inherit rpm
