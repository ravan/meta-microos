SUMMARY = "Screen Ruler"
DESCRIPTION = "A screen ruler for the Plasma desktop environment"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kruler-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a0aef7918223880c0219e616315321ba4061643fd9c7665dc6280ed06e7c44e93af42a3b99e1ac7bf3fa80e0e94f499c0f618e12ea6678f973d9bdf950e6abf8"

RPROVIDES:${PN} += "kruler \
kruler5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
