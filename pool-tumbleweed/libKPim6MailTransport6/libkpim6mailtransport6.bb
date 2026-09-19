SUMMARY = "Mail Transport library for KDE PIM applications"
DESCRIPTION = "The Mail Transport library for KDE PIM functionality"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6MailTransport6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "17948d596d0d2d8ec76215b9340839cef8972a032081920908990399c22e6f4b361a6c369587886b31078b5745d8c0adada93ef0ad92c703ac4989a58b59cfca"

RPROVIDES:${PN} += "libKPim6MailTransport.so.6 \
libKPim6MailTransport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kmailtransport \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
