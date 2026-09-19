SUMMARY = "LXQt core library"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "liblxqt2-2.4.0-2.2.aarch64.rpm"
RPM_HASH = "4ad464c815bd277f891531f41a88fd7b2738ae03d9aa08e4f8917c941cb9c27bcac5c6fac961221667926d8fef4fd4b68f91e12191d70e7e996bc68b8f98a917"

RPROVIDES:${PN} += "liblxqt.so.2 \
liblxqt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xdg.so.4 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
liblxqt \
libstdc++.so.6"

inherit rpm
