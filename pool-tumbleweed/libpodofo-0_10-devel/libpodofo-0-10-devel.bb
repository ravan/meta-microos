SUMMARY = "Development files for podofo"
DESCRIPTION = "This package contains development files for podofo library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.5"

RPM_NAME = "libpodofo-0_10-devel-0.10.5-1.8.aarch64.rpm"
RPM_HASH = "b06b5826f9d7d9cb68de17c1c218f2b34d0851d96db3f28f18e8086db917460e58f51830853bad7629f950a665c6c921cc0d57661524a28dae394e4e7b89454b"

RPROVIDES:${PN} += "libpodofo-0-10-devel \
pkgconfig-libpodofo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel \
libpodofo2"

inherit rpm
