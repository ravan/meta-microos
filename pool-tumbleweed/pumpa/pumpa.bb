SUMMARY = "A pump.io client written in C++/Qt"
DESCRIPTION = "Pumpa is a pump.io client written in C++ and Qt."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.3"

RPM_NAME = "pumpa-0.9.3-3.4.aarch64.rpm"
RPM_HASH = "9a3777f2849db71ab59825aee83c92d71a03dc1692cd0df985c99806bcea4be9da38c23b14d80a156dc1ffe7faf291e59ec62011a5a81027e67b477b48f98002"

RPROVIDES:${PN} += "pumpa"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtidy.so.58"

inherit rpm
