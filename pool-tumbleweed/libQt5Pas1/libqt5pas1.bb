SUMMARY = "Free Pascal interface to Qt5"
DESCRIPTION = "Qt5 bindings for Pascal from Lazarus."
LICENSE = "LGPL-3.0-only"

PV = "4.8"

RPM_NAME = "libQt5Pas1-4.8-1.2.aarch64.rpm"
RPM_HASH = "08045be23bddc1873d37ad29681f5cadbf69ea3fd37a0baaef1b54a5520c786317e83ffb440ed40c0c79f4b6bcdee9ff19b7a7884ec5a0f28e65c9b5cbac2249"

RPROVIDES:${PN} += "libQt5Pas.so.1 \
libQt5Pas1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
