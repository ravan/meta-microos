SUMMARY = "GUI for Firajail security sandbox"
DESCRIPTION = "Firetools is the graphical user interface of Firejail security sandbox."
LICENSE = "GPL-2.0-only"

PV = "0.9.72"

RPM_NAME = "firetools-0.9.72-1.14.aarch64.rpm"
RPM_HASH = "da8521714a6352275e25b4a821874f44d2db86fa564536a99bdc2250c2f898dc9e87ad39d54a62af4900537857c2f28b1afddb3c491db5ae647fe6afa7cfb4b9"

RPROVIDES:${PN} += "firetools"

RDEPENDS:${PN} += "firejail \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
