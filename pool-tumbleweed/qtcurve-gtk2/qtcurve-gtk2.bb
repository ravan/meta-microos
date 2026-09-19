SUMMARY = "QtCurve style for GTK+ 2"
DESCRIPTION = "This package contains the QtCurve engine for GTK+ 2. QtCurve is a set \
of widget styles available for Qt and GTK+."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "qtcurve-gtk2-1.9.0-8.7.aarch64.rpm"
RPM_HASH = "2a68466118b8bcb51100fb587eaaf15680b1138f735b84fc1fa190120de8a0a584ef516217452643ba765fdb17147693048238cd626baedfbe680f714cdb8f1c"

RPROVIDES:${PN} += "libqtcurve.so \
qtcurve-gtk2"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libqtcurve-cairo.so.1 \
libqtcurve-cairo1 \
libqtcurve-utils.so.2 \
libstdc++.so.6"

inherit rpm
