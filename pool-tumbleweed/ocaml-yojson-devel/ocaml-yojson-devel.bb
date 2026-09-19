SUMMARY = "Development files for ocaml-yojson"
DESCRIPTION = "The ocaml-yojson-devel package contains libraries and signature files for \
developing applications that use ocaml-yojson."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "ocaml-yojson-devel-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "3cf43b627b8057a1f95cfdda6901d59200faaffa236c88f49e5c58ff8229b156889fd951877239ac62c9627ec55befd07347738101d0e9af07f2d441a9f19c4e"

RPROVIDES:${PN} += "ocaml-Yojson \
ocaml-Yojson-- \
ocaml-Yojson--Basic \
ocaml-Yojson--Codec \
ocaml-Yojson--Common \
ocaml-Yojson--Lexer-utils \
ocaml-Yojson--Raw \
ocaml-Yojson--Safe \
ocaml-Yojson--T \
ocaml-yojson-devel \
ocamlfind-yojson \
ocamlx-Yojson \
ocamlx-Yojson-- \
ocamlx-Yojson--Basic \
ocamlx-Yojson--Codec \
ocamlx-Yojson--Common \
ocamlx-Yojson--Lexer-utils \
ocamlx-Yojson--Raw \
ocamlx-Yojson--Safe \
ocamlx-Yojson--T"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-yojson \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Seq \
ocamlx-Stdlib--String"

inherit rpm
