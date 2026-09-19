SUMMARY = "Development files for ocaml-findlib"
DESCRIPTION = "The ocaml-findlib-devel package contains libraries and signature files for \
developing applications that use ocaml-findlib."
LICENSE = "MIT"

PV = "1.9.8"

RPM_NAME = "ocaml-findlib-devel-1.9.8-1.3.aarch64.rpm"
RPM_HASH = "dcaa25d8ffb209777d9b71ea8d5723ef66810762939739b647a0e330c756d03f1eec28c040c2fe85b9021442fcf2e08d04cc166539b7962419c3035615908c86"

RPROVIDES:${PN} += "ocaml-Findlib \
ocaml-Findlib-config \
ocaml-Fl-args \
ocaml-Fl-compat \
ocaml-Fl-dynload \
ocaml-Fl-lint \
ocaml-Fl-meta \
ocaml-Fl-metascanner \
ocaml-Fl-metatoken \
ocaml-Fl-package-base \
ocaml-Fl-split \
ocaml-Fl-topo \
ocaml-Ocaml-args \
ocaml-Topfind \
ocaml-findlib-camlp4 \
ocaml-findlib-devel \
ocamlfind-findlib \
ocamlfind-findlib.dynload \
ocamlfind-findlib.internal \
ocamlfind-findlib.top \
ocamlx-Findlib \
ocamlx-Findlib-config \
ocamlx-Fl-args \
ocamlx-Fl-compat \
ocamlx-Fl-dynload \
ocamlx-Fl-lint \
ocamlx-Fl-meta \
ocamlx-Fl-metascanner \
ocamlx-Fl-metatoken \
ocamlx-Fl-package-base \
ocamlx-Fl-split \
ocamlx-Fl-topo \
ocamlx-Topfind"

RDEPENDS:${PN} += "ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmi-format \
ocaml-Data-types \
ocaml-Dynlink \
ocaml-Env \
ocaml-Format-doc \
ocaml-Ident \
ocaml-Identifiable \
ocaml-Load-path \
ocaml-Location \
ocaml-Longident \
ocaml-Misc \
ocaml-Oprint \
ocaml-Outcometree \
ocaml-Parsetree \
ocaml-Path \
ocaml-Primitive \
ocaml-Shape \
ocaml-Stdlib \
ocaml-Stdlib--Arg \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
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
ocaml-Stdlib--Printf \
ocaml-Stdlib--Result \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Topdirs \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Unit-info \
ocaml-Warnings \
ocaml-findlib \
ocamlfind-dynlink \
ocamlfind-findlib \
ocamlfind-findlib.internal \
ocamlfind-findlib.top \
ocamlx-CamlinternalLazy \
ocamlx-Dynlink \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Filename \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Topdirs \
ocamlx-Toploop"

inherit rpm
