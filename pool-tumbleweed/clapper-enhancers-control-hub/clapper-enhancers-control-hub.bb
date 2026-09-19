SUMMARY = "Clapper Enhancer Control Hub"
DESCRIPTION = "Allows to control playback remotely"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-control-hub-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "8e4d7626f0db5766da31b27b053dbc9bbf0d89c1e692005c9181a97c239f3d6fcd2e21a125dae7b2637af33941dac2ec98aef22c3bf45c234c207ca571cfe66a"

RPROVIDES:${PN} += "clapper-enhancers-control-hub \
libclapper-control-hub.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclapper-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libmicrodns.so.1 \
libpeas-2.so.0 \
libsoup-3.0.so.0"

inherit rpm
