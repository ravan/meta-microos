SUMMARY = "GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "libgck-1-0-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "8ea22212442b850c955b8e3ed72f5af1aabaf28c35babc3cd081d5c447cc064f8430aaecec1e26dbb9b826d1bc9ade78561b185ab5ed6118d681361f29b0d802"

RPROVIDES:${PN} += "gck \
libgck-1-0 \
libgck-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libp11-kit.so.0"

inherit rpm
