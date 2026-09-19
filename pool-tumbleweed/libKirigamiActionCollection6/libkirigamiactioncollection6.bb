SUMMARY = "Kirigami addons and modules"
DESCRIPTION = "Kirigami addons and modules necessary to do a full featured KDE application, \
such as integration with configurable keyboard shortcuts and standard actions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "libKirigamiActionCollection6-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "f037e5ca0764db283c94982af433d46c35b3a2fecf5ede267a1f19d679ec8d8df9e7a2b2d3fe676837f1906be30bc7bda74ea0c32f667f0c44991047717d3602"

RPROVIDES:${PN} += "libKirigamiActionCollection.so.6 \
libKirigamiActionCollection6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
