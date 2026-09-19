SUMMARY = "MIME email parser for KDE PIM - core library"
DESCRIPTION = "This package contains the core libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiMime6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f3d518259f1c185064e9eddbc68288a1cd8e65a02e63bc40e0ec0298a7b5fd02824902616b349981344586232816d8b213b492fd79d6fdd80a65243f5079ca8e"

RPROVIDES:${PN} += "libKPim6AkonadiMime.so.6 \
libKPim6AkonadiMime6"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-mime \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6Mime.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
