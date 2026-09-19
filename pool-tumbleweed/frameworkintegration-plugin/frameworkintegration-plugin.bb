SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "frameworkintegration-plugin-5.116.0-2.5.aarch64.rpm"
RPM_HASH = "1b86063af388b6ae1ebe1038ad6c88f583c7a0b656772fdee57ad5e107b4bcff6c35d734048d4eefab206620b15387ea5255993c0e21ee51ca19bb080fd84467"

RPROVIDES:${PN} += "frameworkintegration-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5I18n.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
plasma5-integration-plugin"

inherit rpm
