SUMMARY = "Development files for libdnf"
DESCRIPTION = "Development files for libdnf."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "libdnf5-devel-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "0345984f4aa711eb079bdd03120686c8bf500d87fb634cd74900807767c4b58162816c34280a3e427c343c1b8a860cbbe7d6e14816da81c8613b8321892343d4"

RPROVIDES:${PN} += "libdnf5-devel \
pkgconfig-libdnf5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdnf5-2 \
libsolv-devel \
pkgconfig-fmt \
pkgconfig-libacl \
pkgconfig-librepo \
pkgconfig-libsolv \
pkgconfig-libsolvext \
pkgconfig-libxml-2.0 \
pkgconfig-modulemd-2.0 \
pkgconfig-rpm \
pkgconfig-sqlite3"

inherit rpm
