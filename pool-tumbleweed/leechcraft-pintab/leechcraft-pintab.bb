SUMMARY = "LeechCraft Pinned tabs Module"
DESCRIPTION = "This package provides a pinning tab module for LeechCraft with which \
it is possible to pin important tabs so that they occupy less space."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-pintab-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "730bcde8cf024268b16b9baf4d58aee60506c02849b3611659de1dc40aae6ca4ca1887506faa95d1ba5ad674558cdd975307a768435fd630704359e0d6e740d4"

RPROVIDES:${PN} += "leechcraft-pintab \
libleechcraft-pintab.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
