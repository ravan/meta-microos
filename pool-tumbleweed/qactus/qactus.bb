SUMMARY = "A GUI client for OBS"
DESCRIPTION = "A Qt-based Open Build Service (OBS) client featuring a browser, request \
management and more."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "qactus-3.0.0-1.5.aarch64.rpm"
RPM_HASH = "a068b095d49c2915f6f9accd0440129bd4be393b099489059c74654116efc71ddbd4c790d3cd36ffbe55531b7bb95561ebc0bf4132e310541b5cc4bbab175ec0"

RPROVIDES:${PN} += "qactus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqobs.so.3 \
libqobs3 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
