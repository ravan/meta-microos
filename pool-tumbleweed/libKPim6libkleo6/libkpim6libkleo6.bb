SUMMARY = "LibKleo library for kdepim"
DESCRIPTION = "This package contains the libkleo library, a library used by KDE PIM \
applications to handle cryptographic key and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6libkleo6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "05b74de6c33b42acff374c3a509c214230b61fa4d69e5d09c0aaef45c38c3310274c9ddea9546f9891f00c096f31fe54f958187740305b8541be64f553afc4b4"

RPROVIDES:${PN} += "libKPim6Libkleo.so.6 \
libKPim6libkleo6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libkleo \
libqgpgmeqt6.so.15 \
libstdc++.so.6"

inherit rpm
