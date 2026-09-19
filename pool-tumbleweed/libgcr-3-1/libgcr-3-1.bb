SUMMARY = "Library for Crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "libgcr-3-1-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "3c14d84348022572478d61236c35a02e60b8f9515252dc377e61e451de7f134d08b323390d88c7de54d3e497f5c5225d8b30737554cfcc43e91c020f428c8c63"

RPROVIDES:${PN} += "gcr3 \
libgcr-3-1 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcr-data \
gcr-prompter \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgck-1.so.0 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libp11-kit.so.0 \
libpango-1.0.so.0"

inherit rpm
