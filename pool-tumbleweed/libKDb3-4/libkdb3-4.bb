SUMMARY = "The library for the Database Connectivity and Creation Framework"
DESCRIPTION = "The library for the database connectivity and creation framework for various database vendors"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKDb3-4-3.2.0-10.7.aarch64.rpm"
RPM_HASH = "144083ac228b25fe1cea2a43ec4f261ebe5486018cbc54823bea3d24c9edf43792746e7e1bdcc536fd5bea6f2479f5457a6c843b88f18563873a49a316e98475"

RPROVIDES:${PN} += "kdb \
libKDb3-4 \
libKDb3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libicui18n.so.78 \
libstdc++.so.6"

inherit rpm
