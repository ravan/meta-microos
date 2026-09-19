SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5QuickAddons5-5.116.0-1.14.aarch64.rpm"
RPM_HASH = "dd5b85ccfa9a0ad9b583ae93fc00c67541afef9c8b65cf0ffbeb0d7141b4b92bb2c1e9f265876f96ee2e9bd0db476065b9aa6dfbf79c00ffff518c7a4a78ca67"

RPROVIDES:${PN} += "libKF5QuickAddons.so.5 \
libKF5QuickAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5Package.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
