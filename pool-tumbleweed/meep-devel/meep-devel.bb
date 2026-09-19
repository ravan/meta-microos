SUMMARY = "Libraries and header files for meep library"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems. \
 \
This package contains libraries and header files for developing \
applications that use meep."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "meep-devel-1.28.0-1.12.aarch64.rpm"
RPM_HASH = "b4f64d0bc1e14631a5a847a224ac435daf5487bdf74c2ed7595619d0c365ed22555cc4050319de2cb8ef5183a5c7e34384ce68c57196760abc6ea7abec063ae8"

RPROVIDES:${PN} += "meep-devel \
pkgconfig-meep"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmeep32"

inherit rpm
