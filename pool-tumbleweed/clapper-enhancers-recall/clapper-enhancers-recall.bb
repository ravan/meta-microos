SUMMARY = "Clapper Enhancer Recall"
DESCRIPTION = "Recalls the last playback position"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-recall-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "8a385b0428c67aa7d88a88ea46b2cc5677d2d0bc7fb4db69bf4ff41536c7c7b2af3539f8f19596c86058f3e6fbffe2d895bb9c591329490368639a88c50fadec"

RPROVIDES:${PN} += "clapper-enhancers-recall \
libclapper-recall.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclapper-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpeas-2.so.0 \
libsqlite3.so.0 \
sqlite3"

inherit rpm
