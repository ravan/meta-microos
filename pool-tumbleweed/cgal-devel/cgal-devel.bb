SUMMARY = "Development files and tools for CGAL applications"
DESCRIPTION = "This package provides the headers files and tools you may need to \
develop applications using CGAL."
LICENSE = "BSL-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.1"

RPM_NAME = "cgal-devel-6.2.1-1.1.aarch64.rpm"
RPM_HASH = "1c3afb892e5287839a169d8daab3b6aa6f160643fcaa81948015ebd180f99a1b8f42703976413a0fbc31b437836a282cddd53c0a8c61e9c5a6923f0c3ce756d7"

RPROVIDES:${PN} += "cgal-devel \
cmake-CGAL \
libcgal-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
blas \
cmake \
gmp-devel \
lapack \
libboost-atomic-devel \
libboost-thread-devel \
mpfr-devel \
zlib-devel"

inherit rpm
