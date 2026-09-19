SUMMARY = "Development files for opam-file-format"
DESCRIPTION = "The opam-file-format-devel package contains libraries and signature files for \
developing applications that use opam-file-format."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "2.2.0"

RPM_NAME = "opam-file-format-devel-2.2.0-2.1.aarch64.rpm"
RPM_HASH = "6eacddca06a31b33f929b9858cdf96c0e7cba331d07ead0dfe4f4436baa31d37d4e622d475ffcfd11c42dfc9909c8a9f302c22d8f073579fa08c10bd5346de48"

RPROVIDES:${PN} += "ocaml-OpamBaseParser \
ocaml-OpamLexer \
ocaml-OpamParser \
ocaml-OpamParserTypes \
ocaml-OpamPrinter \
ocamlfind-opam-file-format \
ocamlx-OpamBaseParser \
ocamlx-OpamLexer \
ocamlx-OpamParser \
ocamlx-OpamParserTypes \
ocamlx-OpamPrinter \
opam-file-format-devel"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Char \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Parsing \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Stdlib--Weak \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Domain \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Parsing \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Stdlib--Weak \
opam-file-format"

inherit rpm
