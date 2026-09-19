SUMMARY = "QtCurve style for Qt and GTK+"
DESCRIPTION = "QtCurve is a set of widget styles available for Qt and GTK+. \
This package cointains library for common drawing routines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.0"

RPM_NAME = "libqtcurve-cairo1-1.9.0-8.7.aarch64.rpm"
RPM_HASH = "f6a69a303175a09baf2bffcd8fd6231b882c9f411b386e118f1eb6cea05baaeacead420aa224cbed3edacbc912804b36f6712e50b6d03aafa4c65f0750937247"

RPROVIDES:${PN} += "libqtcurve-cairo.so.1 \
libqtcurve-cairo1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
