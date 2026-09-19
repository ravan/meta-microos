SUMMARY = "LeechCraft D-Bus Module"
DESCRIPTION = "This package provides a D-Bus implementation plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-dbusmanager-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "ab07283511bc8d16686e40716064557c2d4793181a95ff082dab272c49180af64071de46f6616c16c5d9503d6c98546fb90233b03c861af5d081664dbc11ca4e"

RPROVIDES:${PN} += "leechcraft-dbusmanager \
libleechcraft-dbusmanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
