SUMMARY = "Development files for ocaml-cairo"
DESCRIPTION = "The ocaml-cairo-devel package contains libraries and signature files for \
developing applications that use ocaml-cairo."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.5"

RPM_NAME = "ocaml-cairo-devel-0.6.5-2.2.aarch64.rpm"
RPM_HASH = "21f135a3aae61d90d5e8e83a5a0c4d1207cf3cf5a93104f2b5aeacfe9c4e95ed6df31131ada469b55c077c97963010b5d7c114f82e81cb0a2db6397744d9aa4f"

RPROVIDES:${PN} += "config-ocaml-cairo-devel \
ocaml-Cairo \
ocaml-cairo-devel \
ocamlfind-cairo2 \
ocamlx-Cairo"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Buffer \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--List \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Printf \
ocaml-Stdlib--Seq \
ocaml-Stdlib--Uchar \
ocaml-cairo \
ocamlfind-bigarray \
ocamlx-Stdlib \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--List \
ocamlx-Stdlib--Printexc \
ocamlx-Stdlib--Printf \
pkgconfig-cairo"

inherit rpm
