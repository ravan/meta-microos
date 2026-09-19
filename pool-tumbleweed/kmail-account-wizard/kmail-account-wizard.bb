SUMMARY = "Account wizard for KMail"
DESCRIPTION = "An application which assists you with the configuration of accounts in KMail."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kmail-account-wizard-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f81ffc09ea2850ffa96d4320885cbdf92f49e3ab3b1da3adb373d9047a1bf5ffa98188ece225b739dff507626b29fdbfd9405da1510d11cde946dd614f08ab40"

RPROVIDES:${PN} += "kmail-account-wizard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6Mime.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6MailTransport.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
