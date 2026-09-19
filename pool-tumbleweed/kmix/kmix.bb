SUMMARY = "Sound Mixer"
DESCRIPTION = "KMix is a fully featured audio mixer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kmix-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1f395dcb4f1c3b84e9e3fa6dd5afccb79e5d367ff4fdf9148667114ce5e6a9a4ea4c3f2ca7a3c6cc122b9e64435e6e3554876427a5d6ca508a87f340bc97a3ad"

RPROVIDES:${PN} += "config-kmix \
kmix \
kmix5 \
libkmixcore.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libKF6Solid.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libasound.so.2 \
libc.so.6 \
libcanberra.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
