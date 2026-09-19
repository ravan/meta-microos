SUMMARY = "KDeclarative tools"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kdeclarative-tools-5.116.0-1.14.aarch64.rpm"
RPM_HASH = "a8988e6b4e6c54bbdea403beaec024f4c462391ad9583da37e2cea343dedff7d712c01f483272ca7e560f6bcf37bc76077e087462b741d436b1d3ba5933c0bf8"

RPROVIDES:${PN} += "kdeclarative-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
