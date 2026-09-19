SUMMARY = "Development files for ocaml-base64"
DESCRIPTION = "The ocaml-base64-devel package contains libraries and signature files for \
developing applications that use ocaml-base64."
LICENSE = "ISC"

PV = "3.5.2"

RPM_NAME = "ocaml-base64-devel-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "f404faed230cef4aeeeeb8ae6ad1c73a187e2ceeec1cd4efba65a02ae5b69e86bad19ed1c0770a783a677101eaca518630f5c6ba460e6e093eac8f50a4f76dc8"

RPROVIDES:${PN} += "ocaml-Base64 \
ocaml-Base64-rfc2045 \
ocaml-base64-devel \
ocamlfind-base64 \
ocamlfind-base64.rfc2045 \
ocamlx-Base64 \
ocamlx-Base64-rfc2045"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-base64 \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys"

inherit rpm
