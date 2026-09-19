SUMMARY = "Development files for libayatana-appindicator"
DESCRIPTION = "This package contains the development files for the ayatana \
appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.93"

RPM_NAME = "libayatana-appindicator-devel-0.5.93-3.4.aarch64.rpm"
RPM_HASH = "b77c1b2ac248fc8e80f26ee90b08d3e81d733f5e050b3b3e3277f06eb38286f18faea3da0c7dab4be37b7ddca16230c738fbd9af9758a5bfc8bf0f3750e5b87e"

RPROVIDES:${PN} += "libayatana-appindicator-devel \
pkgconfig-ayatana-appindicator-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-appindicator1 \
pkgconfig-ayatana-indicator-0.4 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm
