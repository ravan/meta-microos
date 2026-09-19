SUMMARY = "Development files for ocaml-pp"
DESCRIPTION = "The ocaml-pp-devel package contains libraries and signature files for \
developing applications that use ocaml-pp."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "ocaml-pp-devel-2.0.0-2.1.aarch64.rpm"
RPM_HASH = "dddcd84935193071f548777838a9e63654e10095cde2ddbad232633bb0b6b451cd4cccba381bb7ef831beec6673a10b4378777de7fe359a7efbf14430498c107"

RPROVIDES:${PN} += "ocaml-Pp \
ocaml-pp-devel \
ocamlfind-pp \
ocamlx-Pp"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Fun \
ocaml-Stdlib--Int \
ocaml-Stdlib--ListLabels \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--StringLabels \
ocaml-Stdlib--Uchar \
ocaml-pp \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Fun \
ocamlx-Stdlib--Int \
ocamlx-Stdlib--ListLabels \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--StringLabels"

inherit rpm
