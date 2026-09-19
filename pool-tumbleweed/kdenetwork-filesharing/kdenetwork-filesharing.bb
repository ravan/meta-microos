SUMMARY = "KDE Network Libraries"
DESCRIPTION = "Network File Sharing configuration module and plugin. \
Used for configuring Samba shares."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdenetwork-filesharing-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "abd42017d30c9d4302a6602288731aa2c0fb633e137c85e93356541e375e9559093170c361fdf58723bc151161c819ac18b9013781753d61700842d9d5591d1e"

RPROVIDES:${PN} += "kdenetwork-filesharing \
kdenetwork4-filesharing"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libQCoro6DBus.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libpackagekitqt6.so.2 \
libstdc++.so.6 \
qt6-declarative-imports \
samba-client"

inherit rpm
