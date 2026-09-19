SUMMARY = "LeechCraft Power management module"
DESCRIPTION = "This package provides a power manager plugin for Leechcraft \
which makes use of upower. \
 \
Features: \
 * Displays battery status in LeechCraft tray. \
 * Displays battery charge and power consumption history. \
 * Notifies other plugins about sleep and resume events. This way, plugins \
   like Azoth can disconnect from servers gracefully on hibernation and \
   reconnect properly on startup. \
 * Allows the user to sleep/hibernate the system. \
 * Notifies the user when device starts discharging or charging. \
 * Notifies the user on low capacity."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-liznoo-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "9966331875a19ba6ec13724805b339660fe3ee3bb46ab90f2891dcd9d3400aac7faf0d7c3382d13d768cb6adf0003db1ec8943cf567c17a99200d68939c90a5a"

RPROVIDES:${PN} += "leechcraft-liznoo \
libleechcraft-liznoo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-dbus-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libqwt-qt6.so.6.3 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
upower"

inherit rpm
