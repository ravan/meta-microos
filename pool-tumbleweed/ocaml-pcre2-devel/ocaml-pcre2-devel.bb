SUMMARY = "Development files for ocaml-pcre2"
DESCRIPTION = "The ocaml-pcre2-devel package contains libraries and signature files for \
developing applications that use ocaml-pcre2."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "8.0.4"

RPM_NAME = "ocaml-pcre2-devel-8.0.4-2.2.aarch64.rpm"
RPM_HASH = "b87fcb3b12a2686eb9d637da0aa276824a0c34b522eabd27a94e98bec2c988a9a0cf1997177e02a7a88998d0f4dd201c005cb1bbca2844aadf2c26ec03f7e6b3"

RPROVIDES:${PN} += "config-ocaml-pcre2-devel \
ocaml-Pcre2 \
ocaml-pcre2-devel \
ocamlfind-pcre2 \
ocamlx-Pcre2"

RDEPENDS:${PN} += "libc.so.6 \
libpcre2-8.so.0 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Int64 \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-pcre2 \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Int64 \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
ocamlx-Stdlib--String \
pkgconfig-libpcre2-8"

inherit rpm
