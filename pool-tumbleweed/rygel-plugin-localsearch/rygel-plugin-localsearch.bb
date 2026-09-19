SUMMARY = "Localsearch plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a plugin using localsearch to export media found on \
the local machine."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "rygel-plugin-localsearch-45.2-1.2.aarch64.rpm"
RPM_HASH = "b3c531d83427a8a5b74e9a125d5f5c4710f039cf756932e715efe52d0623514b2143d8b5d2a6828ed380192e1eea3d148b602dbff2d29cd0bc7859e25fde33e9"

RPROVIDES:${PN} += "librygel-localsearch.so \
rygel-plugin-localsearch \
rygel-plugin-tracker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
librygel-core-2.8.so.0 \
librygel-server-2.8.so.0 \
libtinysparql-3.0.so.0 \
localsearch \
rygel"

inherit rpm
