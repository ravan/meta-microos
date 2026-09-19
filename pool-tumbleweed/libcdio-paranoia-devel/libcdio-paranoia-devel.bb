SUMMARY = "Development files for libcdio-paranoia"
DESCRIPTION = "The libcdio-paranoia-devel package contains libraries and header files for \
developing applications that use libcdio-paranoia."
LICENSE = "GPL-3.0-or-later"

PV = "10.2+2.0.1"

RPM_NAME = "libcdio-paranoia-devel-10.2+2.0.1-1.19.aarch64.rpm"
RPM_HASH = "4180da5c285aa15c1e816f968cfa85cbc1435f52ce3f0ae24fd4a73571347622674f5b16cb967af6fd6eba66cdd888a67fa59c8c1b3a44198dd4385d1721f121"

RPROVIDES:${PN} += "libcdio-paranoia-devel \
pkgconfig-libcdio-cdda \
pkgconfig-libcdio-paranoia"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcdio-cdda2 \
libcdio-paranoia2 \
pkgconfig-libcdio"

inherit rpm
