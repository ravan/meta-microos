SUMMARY = "Viewer for Crypto Files"
DESCRIPTION = "This packages provides the viewer for crypto files on the GNOME desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "gcr3-viewer-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "bbaaf77d23a8cd4732953dbf742e0fe01a415fca17ac2831a9f3720ec83a033ec7ef0647c5ad6cb24e75ee5bc99d7a9ee4ba957a5c90559f880a093268ff005f"

RPROVIDES:${PN} += "gcr-viewer \
gcr3-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-ui-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
