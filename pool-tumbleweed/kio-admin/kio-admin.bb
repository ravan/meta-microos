SUMMARY = "Manage files as administrator using the admin:// KIO protocol"
DESCRIPTION = "kio-admin implements a new protocol 'admin:///' which gives administrative access \
to the entire system. This is achieved by talking, over dbus, with a root-level \
helper binary that in turn uses existing KIO infrastructure to run file:// \
operations in root-scope."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "kio-admin-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "80f6dd24952e1473d3c386f113b01ce4fc676ef3e1ad46945e7eb53837aeaf95354ae4f2d1a9dc965fd1edc0912898b7692dbacba20771ebfa52e261b34382d7"

RPROVIDES:${PN} += "kio-admin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libatomic.so.1 \
libc.so.6 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6"

inherit rpm
