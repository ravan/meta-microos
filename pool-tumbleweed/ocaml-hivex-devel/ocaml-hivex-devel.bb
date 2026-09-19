SUMMARY = "OCAML bindings development files for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings development file \
for hivex. Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.24"

RPM_NAME = "ocaml-hivex-devel-1.3.24-3.3.aarch64.rpm"
RPM_HASH = "bdc6dc66622b9fb1a625d173a6565aa29ac9f016352a2389a4005b3540f7a56c6b978b647d8e9e3104645069651d1924b283e0e3a3c9ab317bdade3048bc06f2"

RPROVIDES:${PN} += "ocaml-Hivex \
ocaml-hivex-devel \
ocamlfind-hivex \
ocamlx-Hivex"

RDEPENDS:${PN} += "hivex-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Complex \
ocaml-Stdlib--Sys \
ocaml-Unix \
ocaml-hivex \
ocamlfind-unix \
ocamlx-Stdlib--Callback"

inherit rpm
