SUMMARY = "Development headers for libnbd"
DESCRIPTION = "This package contains development headers for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.25.7"

RPM_NAME = "libnbd-devel-1.25.7-1.1.aarch64.rpm"
RPM_HASH = "4d5e252062195430f1dcb5b8574be7538f544de5dcaee611a03c4932b36458b02031981ad68da3296fa904cd028732517d56e2209cc6f7c13256f9b9a6cf8b21"

RPROVIDES:${PN} += "config-libnbd-devel \
libnbd-devel \
ocaml-NBD \
ocamlfind-nbd \
ocamlx-NBD \
pkgconfig-libnbd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnbd.so.0 \
libnbd0 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Either \
ocaml-Stdlib--Gc \
ocaml-Stdlib--Int32 \
ocaml-Stdlib--Obj \
ocaml-Stdlib--Printexc \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-Unix \
ocamlfind-unix \
ocamlx-Stdlib--Bigarray \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--Gc"

inherit rpm
