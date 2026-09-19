SUMMARY = "Battleship game"
DESCRIPTION = "KBatteship is a KDE implementation of the popular game 'Battleship' where \
you have to try to sink the opponents ships. The game can also be \
played with friends online via the internet."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "knavalbattle-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a49f4d6671667e78ea5ae690c304d6fbfcba9c4ab12f71b4e3fdb7d341390b281f454bb9c5f0fcbbc003a769984791a353e211cceee2beb172b5549c71568cda"

RPROVIDES:${PN} += "knavalbattle \
knavalbattle5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6I18n.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
