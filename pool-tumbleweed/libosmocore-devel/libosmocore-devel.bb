SUMMARY = "Development files for the Osmocom core library"
DESCRIPTION = "libosmocore is a library with various utility functions shared \
between OpenBSC and OsmocomBB. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocore."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmocore-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "43e0d618b8463e300d74a503ebe5cd87650e20d2c91b6702c831a689e844c40fe82a1fe380cc137ecb798fd1d7397e561d7c84cd463763d7737278fb16cb0d77"

RPROVIDES:${PN} += "libosmocore-devel \
pkgconfig-libosmocore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore22 \
libtalloc-devel \
pkgconfig-libmnl \
pkgconfig-libsctp \
pkgconfig-talloc"

inherit rpm
