SUMMARY = "Headers and sources for spglib fortran bindings"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries. \
 \
This package provides the headers and sources for fortran bindings of spglib."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "spglib_f08-devel-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "074b3427d6275737a43968b764e7162afef96d7e0554118443efe570f7e3ebac6b951b1b52c9e69952ea371140531b2f3688aba3bb8f5b4d8b844f7cbaa270d5"

RPROVIDES:${PN} += "pkgconfig-spglib-f08 \
spglib-f08-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspglib-f08-2 \
pkgconfig-spglib"

inherit rpm
