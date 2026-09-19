SUMMARY = "Development files for ocaml-csexp"
DESCRIPTION = "The ocaml-csexp-devel package contains libraries and signature files for \
developing applications that use ocaml-csexp."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "ocaml-csexp-devel-1.5.2-2.1.aarch64.rpm"
RPM_HASH = "52c131433d79e09f6d43bb15b9abb4a6a1c206a36aa60704995d5fc8b651aec3834619aee8088d7836f61c94f83480d31e6fc932ecc8dafe1cf82ffddaa89cba"

RPROVIDES:${PN} += "ocaml-Csexp \
ocaml-csexp-devel \
ocamlfind-csexp \
ocamlx-Csexp"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-csexp \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
