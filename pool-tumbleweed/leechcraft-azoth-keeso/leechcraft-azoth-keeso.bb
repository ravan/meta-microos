SUMMARY = "LeechCraft Azoth Text transform Module"
DESCRIPTION = "This package provides a text transform plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-keeso-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "625ce2f3c4b112737d422324cc34ef8deb275608780fc1d6397115c07b67d0ffcc37b96826d65bb7ec5a262742efc1385c6c1c0cbd568a2fff59e9590dc722de"

RPROVIDES:${PN} += "leechcraft-azoth-keeso \
libleechcraft-azoth-keeso.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
