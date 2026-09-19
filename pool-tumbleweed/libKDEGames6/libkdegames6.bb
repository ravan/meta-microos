SUMMARY = "Library for KDE Games"
DESCRIPTION = "This package contains the KDE games library."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKDEGames6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c9007be62825c71a33a4ed530db0adccaba85aec35f3bce027fb4401a3971bbaa6934355fe7a3c136fa1d71ef17f3bec6e7d30c11b71300a9b24e8d9802f31b3"

RPROVIDES:${PN} += "libKDEGames6 \
libKDEGames6.so.6 \
libKDEGames6Private.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libkdegames \
libkdegames-imports \
libopenal.so.1 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
