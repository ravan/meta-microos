SUMMARY = "Application to Design Electric Diagrams"
DESCRIPTION = "QElectroTech is a Qt5 application to design electric diagrams. It uses XML \
files for elements and diagrams, and includes both a diagram editor and an \
element editor."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "0.100"

RPM_NAME = "qelectrotech-0.100-1.3.aarch64.rpm"
RPM_HASH = "8d6448d88b4594e0601d2394c313cf5b3ac4ad259b2b025bfcd5ad3af8c6366bb18fa6afb6b7d302af10a2930aaaa835cc6dbd37d842434e0b4b330bec2766f1"

RPROVIDES:${PN} += "qelectrotech"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
qelectrotech-symbols \
shared-mime-info"

inherit rpm
