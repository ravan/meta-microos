SUMMARY = "LeechCraft Window Manager Module"
DESCRIPTION = "This package provides a WM control plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-fenet-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "0be2414a81fe0dafb33811a10e6c04483c1a6900868138444142fec122b0330fdae67173fa50e193e5ddfb9eac6eecb91953fec72b1b046c21e46fc0e34bb48a"

RPROVIDES:${PN} += "leechcraft-fenet \
leechcraft-fenet-compton \
libleechcraft-fenet.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-fenet-wm \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
