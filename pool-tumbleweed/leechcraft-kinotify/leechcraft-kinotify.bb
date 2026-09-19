SUMMARY = "LeechCraft Kinetic notifications Module"
DESCRIPTION = "This package contains a fancy notifications plugin for LeechCraft. \
 \
It provides fancy kinetic notifications LeechCraft-wide instead of old-style \
tray-based ones. It supports notifications with HTML markup, notification \
actions (for example, 'Open chat' action in a notification about incoming IM \
message) and is fully themable."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-kinotify-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "0f5a697994a612d79405b79a0f521edd23b1855694053e7c14e68d1491cf837f46e529798c2d31aa6aaa1bc13b6c1d2de0fa3e60f4076d5801f0ff1b23bf2f7f"

RPROVIDES:${PN} += "leechcraft-kinotify \
leechcraft-visualnotifications \
libleechcraft-kinotify.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6StateMachine.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-x11-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
