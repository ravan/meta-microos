SUMMARY = "Encryption Tool"
DESCRIPTION = "Kgpg is a simple GUI for GPG."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kgpg-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "cfcf19f38a4051cd998583591fc387fc4bebcffafd2992eebf306c2b61e068dca0605e040e116907a168ec67051e83174dd155b5a1a10154a73c538abbacbde0"

RPROVIDES:${PN} += "config-kgpg \
kgpg"

RDEPENDS:${PN} += "gpg2 \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
