SUMMARY = "A simple chess board"
DESCRIPTION = "Knights is KDE's chess frontend. It supports playing local games against \
human players or against chess engines (XBoard and UIC), \
as well as playing online games on FICS server. \
Furthermore, it is possible to watch two different chess engines playing \
against each other."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "knights-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ec413145a75d90cc85c6b4d7310f68af038e6bbcded98d1ff7b2573a9f3d02889ad30b67c63394dcd85e1bdb92e58d0e0f9ba4b35b8b5c05516ea6edcb0b7cb8"

RPROVIDES:${PN} += "knights"

RDEPENDS:${PN} += "gnuchess \
ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6Plotting.so.6 \
libKF6Svg.so.6 \
libKF6TextWidgets.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
