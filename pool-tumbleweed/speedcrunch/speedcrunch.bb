SUMMARY = "Calculator with history display, keyboard-oriented"
DESCRIPTION = "A keyboard-oriented desktop scientific calculator which shows results in a \
scrollable display."
LICENSE = "GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "speedcrunch-0.12-3.6.aarch64.rpm"
RPM_HASH = "6aee614b731a1aa9adb48adb4b3b5827c1d37d72fd30d2833e5595503f99b23e3c1ba768213add75a6ad62d63710f2bf4055e9f9470e7b2c64a85fc2e50a5fe0"

RPROVIDES:${PN} += "speedcrunch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
