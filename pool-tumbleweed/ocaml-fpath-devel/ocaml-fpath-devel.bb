SUMMARY = "Development files for ocaml-fpath"
DESCRIPTION = "The ocaml-fpath-devel package contains libraries and signature files for \
developing applications that use ocaml-fpath."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "ocaml-fpath-devel-0.7.3-3.3.aarch64.rpm"
RPM_HASH = "a2d8805a742abb96ac1e59fb240df94e56dca8b02dc9c6c73dde7cd7bd38f769b64de7c3d56eaebebe571ddca46312a9f49c351071c08ff54fa980be76924709"

RPROVIDES:${PN} += "ocaml-Fpath \
ocaml-Fpath-top \
ocaml-fpath-devel \
ocamlfind-fpath \
ocamlfind-fpath.top \
ocamlx-Fpath \
ocamlx-Fpath-top"

RDEPENDS:${PN} += "ocaml-Astring \
ocaml-Asttypes \
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
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Obj \
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
ocaml-fpath \
ocamlfind-astring \
ocamlfind-astring.top \
ocamlfind-compiler-libs.toplevel \
ocamlfind-result \
ocamlx-Astring \
ocamlx-Stdlib \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
