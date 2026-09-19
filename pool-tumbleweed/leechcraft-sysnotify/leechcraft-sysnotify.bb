SUMMARY = "LeechCraft System notification Module"
DESCRIPTION = "This package contains a system notification plugin for LeechCraft. \
Notifications are provided implementations supporting FreeDesktop's \
notification standard, like KDE 4.4 (or higher), Gnome, XFCE and others."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-sysnotify-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "61667fdf4eca43d5cc2d07af59268a9bdda2974fd3f1dd7aefa8f416c349349cbced6ea894cffdb4f2dc5973ac02515a9556b3036507881b8e25c2817f32f236"

RPROVIDES:${PN} += "leechcraft-sysnotify \
leechcraft-visualnotifications \
libleechcraft-sysnotify.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
