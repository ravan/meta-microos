SUMMARY = "Binding to Cairo, a 2D Vector Graphics Library."
DESCRIPTION = "This is an OCaml binding for the Cairo library, a 2D graphics library with support for multiple output devices."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.5"

RPM_NAME = "ocaml-cairo-0.6.5-2.2.aarch64.rpm"
RPM_HASH = "965cfaa5b96c7f1b7c323453164e9ce3e93129e1ba0520c0d2ce3a89681d827c0e9ce17d20827ea3756c8c089f71b8d7fc463fc1703803cbef5139d38dbf1922"

RPROVIDES:${PN} += "ocaml-cairo"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6"

inherit rpm
