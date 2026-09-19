SUMMARY = "The KDE optimized frontend for Marble and several Plasmoids/Wallpapers"
DESCRIPTION = "The KDE frontend for the Marble map viewer. It also includes several plasmoids and wallpapers for Plasma"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "marble-kde-26.08.1-1.2.aarch64.rpm"
RPM_HASH = "ebc9759763700417f7d0339dd579c53dfa3c15831a075d317b518e68f0631079105ba41212cc759005c0fba9c39098604925f255dca8aee2a14fbc5d496af2f3"

RPROVIDES:${PN} += "marble-frontend \
marble-kde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6Parts.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libmarblewidget-qt6.so.28 \
libstdc++.so.6 \
marble"

inherit rpm
