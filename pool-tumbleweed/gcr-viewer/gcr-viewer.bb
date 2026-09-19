SUMMARY = "Viewer for Crypto Files"
DESCRIPTION = "This packages provides the viewer for crypto files on the GNOME desktop. \
key stores. \
 \
GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "gcr-viewer-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "e1697bd92d13672c860ef2c709ba3cfd74e07464c879d9edb848b04400b0ac7208ccecaf7425ebfd7df378cd4845bda1eec3e31d604819a4ef19400d1c88ca2c"

RPROVIDES:${PN} += "gcr-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
