SUMMARY = "GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "libgck-2-2-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "8b71071e68b88c4749501fca162f3e08e66cb3224e4dbeed5a91e68dba56057a95a118ed9bf468afc9cd2126a051cfe54ddf8e2105e18b16f7b8540ef7536aa0"

RPROVIDES:${PN} += "gck \
libgck-2-2 \
libgck-2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libp11-kit.so.0"

inherit rpm
