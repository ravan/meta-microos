SUMMARY = "Graphical shutdown utility"
DESCRIPTION = "KShutdown is a graphical shutdown utility that works \
with many Desktop Environments. It allows you to turn off \
or suspend a computer at a specified time. It features \
various time and delay options, command-line support, \
and notifications."
LICENSE = "GPL-2.0-or-later"

PV = "6.2"

RPM_NAME = "kshutdown-6.2-1.4.aarch64.rpm"
RPM_HASH = "b080f74f533dacaad9d14028576a3cdb50daa6cf0ddf766648996a7cef4de91d469022723a46fbb075603fb9a6320774f647176009124fe1a4080d96c4805067"

RPROVIDES:${PN} += "kshutdown"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
