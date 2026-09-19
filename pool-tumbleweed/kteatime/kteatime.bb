SUMMARY = "Timer for various types of tea"
DESCRIPTION = "Timer utility by KDE where the user can select a particular type of tea, \
and be reminded when the associated hardcoded time is over."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kteatime-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "563e60ade39f107ba877f8b5e3c986694e80f4c9633081e7c61f8217da55e976dcc66386c673bde1f26e3c06b8390bff5c175609c463e3904e16b38ab80d2691"

RPROVIDES:${PN} += "kteatime \
kteatime5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextWidgets.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
