SUMMARY = "Development files for libappindicator"
DESCRIPTION = "This package contains the development files for the appindicator3 library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator3-devel-12.10.1~bzr20200706.298-4.10.aarch64.rpm"
RPM_HASH = "06baad9e2f31c62e895b8dc75094f525f37876932ecdfd4a529c20e481e4c15b2844beac4e570e97a05f4300f5dd9567c0bc8f2c253766f318ced81636111a2c"

RPROVIDES:${PN} += "libappindicator3-devel \
pkgconfig-appindicator3-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libappindicator3-1 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-gtk+-3.0"

inherit rpm
