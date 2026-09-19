SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-frameworkintegration-plugin-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "a2e5d5d653820d4e15e4c1b2c9f21ca7ff62dd479c8d57a664a9db94f5761e48caa3da7b882ea7792e41f088e2bb35db27ab04e1aed6245e7b7d94b3465c8153"

RPROVIDES:${PN} += "kf6-frameworkintegration-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libAppStreamQt.so.3 \
libKF6ConfigCore.so.6 \
libKF6I18n.so.6 \
libKF6NewStuffCore.so.6 \
libKF6Notifications.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libpackagekitqt6.so.2 \
libstdc++.so.6 \
plasma6-integration-plugin"

inherit rpm
