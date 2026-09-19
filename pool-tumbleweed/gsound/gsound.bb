SUMMARY = "A library for playing system sounds"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "gsound-1.0.3-2.21.aarch64.rpm"
RPM_HASH = "706c027e406b3df8c067e41cabc222e771a2504fc870924db56581786f8cde1d41f012760b49852043048797b3b550ef7ccac25aa746d84bed8fed0391b629a7"

RPROVIDES:${PN} += "gsound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0"

inherit rpm
