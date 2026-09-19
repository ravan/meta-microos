SUMMARY = "LeechCraft Azoth Conference highlights Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth to customize \
conference highlights."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-hili-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "5f76cdee769e6c5c6be767d2db1438ab409f3778da27e371ad3bec5deb3ff50cb62e2e58712e0d1b1c663eb1187f0a51113e757d6da87e2709bda9d04ad3f5c6"

RPROVIDES:${PN} += "leechcraft-azoth-hili \
libleechcraft-azoth-hili.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
