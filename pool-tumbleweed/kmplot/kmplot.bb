SUMMARY = "Mathematical Function Plotter"
DESCRIPTION = "Mathematical function plotter by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kmplot-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "bc6a664563263d4bad5a331c324e899b12c67c0d9c48be1a44dfd894012bc5be34f8440eb0bddd213dcd7496dbfa06f5d0cf16e78a32e54034f5b2bcddada219"

RPROVIDES:${PN} += "kmplot \
kmplot5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Parts.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
