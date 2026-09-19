SUMMARY = "Identify songs in seconds"
DESCRIPTION = "Discover songs you are aching to know with an easy-to-use interface. \
 \
Mousai is a simple application that can recognize songs similar to Shazam. \
Just click the listen button, and then wait a few seconds. It will magically \
return the title and artist of that song!"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.10"

RPM_NAME = "mousai-0.7.10-2.3.aarch64.rpm"
RPM_HASH = "a0cad209311af3f78a04678ff8117112385d298a5e827d93838cf53b376fcf90c40ad66a1a0a6775c60ba9cc6eb9038ce14816aa34ecb2dbc9a29557bb557c7e"

RPROVIDES:${PN} += "mousai"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libsoup-3.0.so.0"

inherit rpm
