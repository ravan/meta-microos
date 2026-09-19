SUMMARY = "Development files for ocaml-zarith"
DESCRIPTION = "The ocaml-zarith-devel package contains libraries and signature files for \
developing applications that use ocaml-zarith."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception"

PV = "1.14"

RPM_NAME = "ocaml-zarith-devel-1.14-2.3.aarch64.rpm"
RPM_HASH = "91be835c5218d2ee28cd35905c2e0bce52e67f6633baa0008a1b4f43e8549ce1733e0d7a2bb31b2d99bb162380ffd88d7bd212ec9dc0383a7ada699dde0611f7"

RPROVIDES:${PN} += "config-ocaml-zarith-devel \
ocaml-Big-int-Z \
ocaml-Q \
ocaml-Z \
ocaml-Zarith-top \
ocaml-Zarith-version \
ocaml-zarith-devel \
ocamlfind-zarith \
ocamlfind-zarith.top \
ocamlx-Big-int-Z \
ocamlx-Q \
ocamlx-Z \
ocamlx-Zarith-top \
ocamlx-Zarith-version"

RDEPENDS:${PN} += "gmp-devel \
libc.so.6 \
libgmp.so.10 \
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
ocaml-Stdlib--Callback \
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
ocaml-Stdlib--Random \
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
ocaml-zarith \
ocamlfind-compiler-libs.toplevel \
ocamlfind-zarith \
ocamlx-Stdlib \
ocamlx-Stdlib--Buffer \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Format \
ocamlx-Stdlib--Hashtbl \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--Lexing \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Nativeint \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--Random \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
ocamlx-Toploop"

inherit rpm
