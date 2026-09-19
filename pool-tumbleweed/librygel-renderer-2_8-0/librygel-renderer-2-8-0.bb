SUMMARY = "Render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "librygel-renderer-2_8-0-45.2-1.2.aarch64.rpm"
RPM_HASH = "c1da0cbefc459efacd65fed0832dcf2f9dd9f3f1e7779ae32d0ad88ad3690c380a825807965f14dc66b5b43b2e5cb10d4d1521ec198dd9c19e457d64a33b6bc6"

RPROVIDES:${PN} += "librygel-renderer-2-8-0 \
librygel-renderer-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgupnp-1.6.so.0 \
libgupnp-av-1.0.so.3 \
librygel-core-2.8.so.0 \
libsoup-3.0.so.0"

inherit rpm
