SUMMARY = "Development files for Singular's factorization library"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. \
 \
This package contains the include and library files."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libfactory-devel-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "133a984bfc74c1c997173b2b94dd631758ed0679fd740dcdd276d4fcd500aa26af12caacff4a64d2a3c139769a4c9f252dad1b172ad6c83f5a3e2f1be3f019c3"

RPROVIDES:${PN} += "libfactory-devel \
pkgconfig-factory"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfactory-4-4-1 \
pkgconfig-omalloc \
pkgconfig-singular-resources"

inherit rpm
