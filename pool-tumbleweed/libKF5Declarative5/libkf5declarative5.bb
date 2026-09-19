SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Declarative5-5.116.0-1.14.aarch64.rpm"
RPM_HASH = "a7dfe7539fdfb5a44747cac3e06b0c8bc4ebd280ff4040968244b5e14afd6a50bf3557156d6e491cea1e7621d3ba430fd396ea882c9e9a05d7d26e18161fc05f"

RPROVIDES:${PN} += "libKF5Declarative.so.5 \
libKF5Declarative5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
