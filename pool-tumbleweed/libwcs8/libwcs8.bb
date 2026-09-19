SUMMARY = "An implementation of the FITS WCS standard"
DESCRIPTION = "WCSLIB is a C library, supplied with a full set of Fortran wrappers, that \
implements the 'World Coordinate System' (WCS) standard in FITS (Flexible Image \
Transport System)."
LICENSE = "LGPL-3.0-or-later"

PV = "8.6"

RPM_NAME = "libwcs8-8.6-1.3.aarch64.rpm"
RPM_HASH = "58d10bf8b693104d2deec62ef92f90c28ebf0aab13a0498f3f61cb0b9449af159a6e5be2f6e2d9da7a3d6086a05ee00d7542bd972b5252a755b75d01d9d8b275"

RPROVIDES:${PN} += "libwcs.so.8 \
libwcs8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
