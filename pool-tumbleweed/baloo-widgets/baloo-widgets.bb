SUMMARY = "Framework for searching and managing metadata"
DESCRIPTION = "Baloo is a framework for searching and managing metada"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "baloo-widgets-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e17405be5e83cfd37ef8e2e600695a2f31a077ebd3207f0266ffca9397f05c1eac769a571e41a1fa57906f638f04c44ad8c2790602bf3504fbcaa9b6f8718a7c"

RPROVIDES:${PN} += "baloo-widgets \
libKF6BalooWidgets.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Baloo.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
