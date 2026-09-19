SUMMARY = "Development files for ocaml-astring"
DESCRIPTION = "The ocaml-astring-devel package contains libraries and signature files for \
developing applications that use ocaml-astring."
LICENSE = "ISC"

PV = "0.8.5"

RPM_NAME = "ocaml-astring-devel-0.8.5-2.3.aarch64.rpm"
RPM_HASH = "458c7214b9b6e409755c64e6b560911bccb21795b1f9258cebd1f97b59239e7c0cb4dcba2ad0883b0e6b0aabeb4599ea30acd7f96177b3ee83ba84d949bbad9f"

RPROVIDES:${PN} += "ocaml-Astring \
ocaml-Astring-base \
ocaml-Astring-char \
ocaml-Astring-escape \
ocaml-Astring-string \
ocaml-Astring-sub \
ocaml-Astring-top \
ocaml-Astring-unsafe \
ocaml-astring-devel \
ocamlfind-astring \
ocamlfind-astring.top \
ocamlx-Astring \
ocamlx-Astring-base \
ocamlx-Astring-char \
ocamlx-Astring-escape \
ocamlx-Astring-string \
ocamlx-Astring-sub \
ocamlx-Astring-top \
ocamlx-Astring-unsafe"

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
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Digest \
ocaml-Stdlib--Domain \
ocaml-Stdlib--Either \
ocaml-Stdlib--Format \
ocaml-Stdlib--Hashtbl \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--Lazy \
ocaml-Stdlib--Lexing \
ocaml-Stdlib--List \
ocaml-Stdlib--Map \
ocaml-Stdlib--Nativeint \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printf \
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
ocaml-astring \
ocamlfind-compiler-libs.toplevel \
ocamlx-Stdlib \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Map \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Set \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
