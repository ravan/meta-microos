SUMMARY = "MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "liblasem-0_4-4-0.4.4-4.14.aarch64.rpm"
RPM_HASH = "183e8ee334e9951f971278313ca51098c1fae47767d04f20499ed9b77cb3a2defe1ece63d708c5295da29df99b1fab914abe07dcd7600dc892cc0221ffe338e7"

RPROVIDES:${PN} += "liblasem-0-4-4 \
liblasem-0.4.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.16"

inherit rpm
