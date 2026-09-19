SUMMARY = "Development files for ocaml-integers"
DESCRIPTION = "The ocaml-integers-devel package contains libraries and signature files for \
developing applications that use ocaml-integers."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "ocaml-integers-devel-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "406d45bdbd7757a5520ee06dbf5d07e94e17e96ac0de608d5b41345e45f8d1aa64eb71bd0c07cd9abcb93ec0871a2538b49966b639a0b26044a23fac1d627b61"

RPROVIDES:${PN} += "config-ocaml-integers-devel \
ocaml-Integers-top \
ocaml-Integers-top--Install-integer-printers \
ocaml-Signed \
ocaml-Unsigned \
ocaml-integers-devel \
ocamlfind-integers \
ocamlfind-integers.top \
ocamlx-Signed \
ocamlx-Unsigned"

RDEPENDS:${PN} += "libc.so.6 \
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
ocaml-integers \
ocamlfind-compiler-libs \
ocamlfind-integers \
ocamlfind-stdlib-shims \
ocamlx-Stdlib \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Int32 \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Sys"

inherit rpm
