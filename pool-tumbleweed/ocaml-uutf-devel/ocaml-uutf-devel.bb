SUMMARY = "Development files for ocaml-uutf"
DESCRIPTION = "The ocaml-uutf-devel package contains libraries and signature files for \
developing applications that use ocaml-uutf."
LICENSE = "ISC"

PV = "1.0.4"

RPM_NAME = "ocaml-uutf-devel-1.0.4-2.1.aarch64.rpm"
RPM_HASH = "a296f0ac6eac60ba9bb79ba14f27076c0f3dc85831b8800075e66866194272070cf46c9a3a71d7990fbb6b86756b786f3b33142aff8434d394f370d1133c8c50"

RPROVIDES:${PN} += "ocaml-Uutf \
ocaml-uutf-devel \
ocamlfind-uutf \
ocamlx-Uutf"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-uutf \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Uchar"

inherit rpm
