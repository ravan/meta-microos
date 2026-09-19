SUMMARY = "Development files for libntl"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields. \
 \
This package contains the headers and library links to libntl."
LICENSE = "LGPL-2.1-or-later"

PV = "11.6.0"

RPM_NAME = "ntl-devel-11.6.0-1.4.aarch64.rpm"
RPM_HASH = "d17caa13fd8358d04a523a8eb7c96bf3114761b364600333fb8332275c74d5a295d2e02f01b9f9875e7346d867e0846e5aca094c2aefa4bc1511f8909ef148e5"

RPROVIDES:${PN} += "ntl-devel \
pkgconfig-ntl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libntl45 \
pkgconfig-gf2x \
pkgconfig-gmp"

inherit rpm
