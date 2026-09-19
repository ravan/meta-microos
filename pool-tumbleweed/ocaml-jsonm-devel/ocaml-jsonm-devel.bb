SUMMARY = "Development files for ocaml-jsonm"
DESCRIPTION = "The ocaml-jsonm-devel package contains libraries and signature files for \
developing applications that use ocaml-jsonm."
LICENSE = "ISC"

PV = "1.0.2"

RPM_NAME = "ocaml-jsonm-devel-1.0.2-4.1.aarch64.rpm"
RPM_HASH = "7a520f7e92159457a4656858ca9b2f689a930dee19842719a5fbebf7090b98db93e7349eb23dd5f9830292b8740ceceed63dcbb5b9c2fc594820672b485898a9"

RPROVIDES:${PN} += "ocaml-Jsonm \
ocaml-jsonm-devel \
ocamlfind-jsonm \
ocamlx-Jsonm"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--List \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-Uutf \
ocaml-jsonm \
ocamlfind-uutf \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Uchar \
ocamlx-Uutf"

inherit rpm
