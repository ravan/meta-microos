SUMMARY = "Database library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the database library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "librygel-db-2_8-0-45.2-1.2.aarch64.rpm"
RPM_HASH = "8d883237af8f3cac9ed2791569b1bf66e414c05779f03dff83286486576c10b4108079ae8109609a053f266173c194191b213b606298326201d9fd2992485931"

RPROVIDES:${PN} += "librygel-db-2-8-0 \
librygel-db-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librygel-core-2.8.so.0 \
libsqlite3.so.0 \
libunistring.so.5"

inherit rpm
