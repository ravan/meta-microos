SUMMARY = "Development files for ocaml-ocamlbuild"
DESCRIPTION = "The ocaml-ocamlbuild-devel package contains libraries and signature files for \
developing applications that use ocaml-ocamlbuild."
LICENSE = "LGPL-2.0-only-with-OCaml-LGPL-linking-exception"

PV = "0.16.1"

RPM_NAME = "ocaml-ocamlbuild-devel-0.16.1-2.2.aarch64.rpm"
RPM_HASH = "706825d7a15df02ae1d81ef406b23ed62f076773a6d58ed0e709910c4b2c45c3ac65cd59c940de8607d56ae87ea2c4f4298f3908e5e6fee83a0be80658920758"

RPROVIDES:${PN} += "ocaml-Ocamlbuild \
ocaml-Ocamlbuild-pack \
ocaml-Ocamlbuild-plugin \
ocaml-Ocamlbuild-unix-plugin \
ocaml-Signatures \
ocaml-ocamlbuild-devel \
ocamlfind-ocamlbuild \
ocamlx-Ocamlbuild \
ocamlx-Ocamlbuild-pack \
ocamlx-Ocamlbuild-plugin \
ocamlx-Ocamlbuild-unix-plugin"

RDEPENDS:${PN} += "ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Char \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Filename \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Option \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Queue \
ocaml-Stdlib--Scanf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocaml-ocamlbuild \
ocamlfind-unix \
ocamlx-CamlinternalLazy \
ocamlx-Stdlib \
ocamlx-Stdlib--Arg \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Char \
ocamlx-Stdlib--Digest \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Option \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Queue \
ocamlx-Stdlib--Scanf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Unix"

inherit rpm
