SUMMARY = "Development files for ocaml-patch"
DESCRIPTION = "The ocaml-patch-devel package contains libraries and signature files for \
developing applications that use ocaml-patch."
LICENSE = "ISC"

PV = "3.1.2"

RPM_NAME = "ocaml-patch-devel-3.1.2-1.2.aarch64.rpm"
RPM_HASH = "30583f55ce4f8616bf00d56b35d415c53322c5ed992246ec720473bc8dee8a26fdb61002da4a063a4b33ce35842e1abdcf235d660e68f65e022745f197acce17"

RPROVIDES:${PN} += "ocaml-Patch \
ocaml-Patch-- \
ocaml-Patch--Fname \
ocaml-Patch--Lib \
ocaml-Patch--Rope \
ocaml-patch-devel \
ocamlfind-opatch \
ocamlfind-patch \
ocamlx-Patch \
ocamlx-Patch-- \
ocamlx-Patch--Fname \
ocamlx-Patch--Lib \
ocamlx-Patch--Rope"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Int \
ocaml-Stdlib--List \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-patch \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String"

inherit rpm
