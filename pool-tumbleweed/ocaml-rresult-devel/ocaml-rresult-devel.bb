SUMMARY = "Development files for ocaml-rresult"
DESCRIPTION = "The ocaml-rresult-devel package contains libraries and signature files for \
developing applications that use ocaml-rresult."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-rresult-devel-0.7.0-2.3.aarch64.rpm"
RPM_HASH = "8ad199c7b09aa02ded96d701ec51489a361fe3885a130e94f09727a62c684e787cb0fcdad2ae63a0295c64b8205b0c95a59769059fa235157b0249603d4e2741"

RPROVIDES:${PN} += "ocaml-Rresult \
ocaml-Rresult-top \
ocaml-rresult-devel \
ocamlfind-rresult \
ocamlfind-rresult.top \
ocamlx-Rresult \
ocamlx-Rresult-top"

RDEPENDS:${PN} += "ocaml-Asttypes \
ocaml-Build-path-prefix-map \
ocaml-CamlinternalFormatBasics \
ocaml-CamlinternalLazy \
ocaml-Cmi-format \
ocaml-Data-types \
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
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Result \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Set \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Subst \
ocaml-Toploop \
ocaml-Type-immediacy \
ocaml-Types \
ocaml-Unit-info \
ocaml-Warnings \
ocaml-rresult \
ocamlfind-compiler-libs.toplevel \
ocamlfind-result \
ocamlfind-rresult \
ocamlx-Stdlib \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--String \
ocamlx-Toploop"

inherit rpm
