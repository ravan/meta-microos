SUMMARY = "Include files and libraries for libaddrxlat development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libaddrxlat."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.6"

RPM_NAME = "libaddrxlat-devel-0.5.6-3.5.aarch64.rpm"
RPM_HASH = "3d55e5965cd825181e7bd7f3a31c341284d86ae7e5ec237ab2de06aba3e8ea5239109627e34e3abb1d64f0e5685a4f2962f51efa4405cd30d2dc647306aa9b69"

RPROVIDES:${PN} += "libaddrxlat-devel \
pkgconfig-libaddrxlat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libaddrxlat3"

inherit rpm
