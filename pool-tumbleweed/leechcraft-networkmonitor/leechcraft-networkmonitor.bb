SUMMARY = "LeechCraft Network Monitor Module"
DESCRIPTION = "This package provides a network monitor plugin for LeechCraft. \
 \
It allows to watch for HTTP requests and allows to inspect them and search \
through the list."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-networkmonitor-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "94089ad82709cfbd4e0a5be79740bb2054827bd8b9d8ff0c2d0c03094677d8511b61aa5634b90f744847e169eccb1c59076c66753f0d936db9c79a1ae4dc50b1"

RPROVIDES:${PN} += "leechcraft-networkmonitor \
libleechcraft-networkmonitor.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
