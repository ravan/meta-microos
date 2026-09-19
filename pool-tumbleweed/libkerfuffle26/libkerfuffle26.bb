SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkerfuffle26-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f2a9fea2439c4e2c2725308481734c666b7df9823f6778da32ca378a8e81de03954a940493e89e897a06db23c5e0957037c6d50d58d2fdd9994f70d0c8b49a53"

RPROVIDES:${PN} += "libkerfuffle.so.26 \
libkerfuffle26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Pty.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
