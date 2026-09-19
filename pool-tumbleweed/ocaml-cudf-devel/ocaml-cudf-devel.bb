SUMMARY = "Development files for ocaml-cudf"
DESCRIPTION = "The ocaml-cudf-devel package contains libraries and signature files for \
developing applications that use ocaml-cudf."
LICENSE = "LGPL-3.0-or-later-with-OCaml-LGPL-linking-exception"

PV = "0.10"

RPM_NAME = "ocaml-cudf-devel-0.10-5.2.aarch64.rpm"
RPM_HASH = "7bdbb91f2c75817687d93b3aad42477f9124051fb534c762d1fa80f186e30b8b1ca392e4d92351221ed20eed195a1f0694f07557012cd4de71e0aa8f4002b522"

RPROVIDES:${PN} += "ocaml-Cudf \
ocaml-Cudf-822-lexer \
ocaml-Cudf-822-parser \
ocaml-Cudf-checker \
ocaml-Cudf-conf \
ocaml-Cudf-parser \
ocaml-Cudf-printer \
ocaml-Cudf-type-lexer \
ocaml-Cudf-type-parser \
ocaml-Cudf-types \
ocaml-Cudf-types-pp \
ocaml-cudf-devel \
ocamlfind-cudf \
ocamlx-Cudf \
ocamlx-Cudf-822-lexer \
ocamlx-Cudf-822-parser \
ocamlx-Cudf-checker \
ocamlx-Cudf-conf \
ocamlx-Cudf-parser \
ocamlx-Cudf-printer \
ocamlx-Cudf-type-lexer \
ocamlx-Cudf-type-parser \
ocamlx-Cudf-types \
ocamlx-Cudf-types-pp"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Enum \
ocaml-ExtArray \
ocaml-ExtBuffer \
ocaml-ExtHashtbl \
ocaml-ExtLib \
ocaml-ExtList \
ocaml-ExtString \
ocaml-IO \
ocaml-Option \
ocaml-Std \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Either \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Uchar \
ocaml-cudf \
ocamlfind-extlib \
ocamlx-ExtHashtbl \
ocamlx-ExtLib \
ocamlx-ExtList \
ocamlx-ExtString \
ocamlx-IO \
ocamlx-Option \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String"

inherit rpm
