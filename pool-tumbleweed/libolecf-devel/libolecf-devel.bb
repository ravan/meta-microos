SUMMARY = "Development files for libolecf"
DESCRIPTION = "libolecf is a library to access the OLE 2 Compound File (OLECF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libolecf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libolecf-devel-20260526-1.12.aarch64.rpm"
RPM_HASH = "6cb44172fd3256fc2b144ba763eb8ad6ab5f6fcb119491d18bb977fa9865f2c443aabc48c6f8ef8fe93bc653cfe4e3e906a64e56255ee576e0e69b63e319079a"

RPROVIDES:${PN} += "libolecf-devel \
pkgconfig-libolecf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libolecf1"

inherit rpm
