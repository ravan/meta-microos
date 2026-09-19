SUMMARY = "Native C Interface to LAPACK: headers and sources for development"
DESCRIPTION = "LAPACKE provides a native C interface to LAPACK routines available \
at www.netlib.org/lapack to facilitate usage of LAPACK functionality \
for C programmers. \
 \
This package provides LAPACKE headers and development files."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "lapacke-devel-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "96189eda6c0f2be54ae131b99b7a2c70596648164c3ffaac90f4c2d120a188caada7c1bb8a032ad71e7cce939f00f8cc33b03d7fcf36d9e236fe3c346e669ab1"

RPROVIDES:${PN} += "cmake-lapacke \
lapacke \
lapacke-devel \
pkgconfig-lapacke"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblapacke3 \
pkgconfig-lapack"

inherit rpm
