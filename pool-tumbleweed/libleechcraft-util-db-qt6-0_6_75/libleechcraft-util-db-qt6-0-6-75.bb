SUMMARY = "Database utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used database-related \
classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-db-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "53312ebae32ce0a24c07b073eeb75d9f413b678b068a2fbd40b7ff29ac84438836424fb3d486b4638001d0fcf3a8a48080b113f2ec8be3410afad4e52429eb9b"

RPROVIDES:${PN} += "libleechcraft-util-db-qt6-0-6-75 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-dbus-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
