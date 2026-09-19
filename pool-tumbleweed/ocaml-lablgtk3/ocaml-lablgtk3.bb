SUMMARY = "Binding to Cairo, a 2D Vector Graphics Library."
DESCRIPTION = "This is an OCaml binding for the Cairo library, a 2D graphics library with support for multiple output devices."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.5"

RPM_NAME = "ocaml-lablgtk3-3.1.5-1.1.aarch64.rpm"
RPM_HASH = "a40afdcf0443380e193f03b4f7c08351ce8ca55f2882deecc557297267472d7cf22c9d37adf07112993c940376e1d71d25e7824350653742413221f3cec3c171"

RPROVIDES:${PN} += "ocaml-lablgtk3"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libgtkspell3-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
