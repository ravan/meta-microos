SUMMARY = "Development files for libappindicator"
DESCRIPTION = "This package contains the development files for the appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator-devel-12.10.1~bzr20200706.298-4.9.aarch64.rpm"
RPM_HASH = "018cec8898c5cce9942ba0114efad10520848cc93884e527055790f601d68cac045ab3181cf696bf1cad3072bc402817920301ff1fe7eeaf3a1e92078bc5b064"

RPROVIDES:${PN} += "libappindicator-devel \
pkgconfig-appindicator-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libappindicator1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-gtk+-2.0"

inherit rpm
