SUMMARY = "Development files for libelf"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libelf."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libelf-devel-0.194-1.4.aarch64.rpm"
RPM_HASH = "f7c7bda16db6fe010adc987d38e3f5318f4af3dfc1f465f5fb6ec45c21e416862c7b43e0923c6c4121b75535c810b1b809f4c2d6dd8cb897aa67232a94a95673"

RPROVIDES:${PN} += "libelf-devel \
pkgconfig-libelf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libelf1 \
pkgconfig-libzstd \
pkgconfig-zlib"

inherit rpm
