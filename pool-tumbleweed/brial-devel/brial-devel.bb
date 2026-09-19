SUMMARY = "Development files for polybori, a CAS for Boolean Polynomials"
DESCRIPTION = "The core of PolyBoRi/BRiAl is a C++ library, which provides \
high-level data types for Boolean polynomials and monomials, exponent \
vectors, as well as for the underlying polynomial rings and subsets \
of the powerset of the Boolean variables. As a unique approach, \
binary decision diagrams are used as internal storage type for \
polynomial structures. \
 \
This subpackage contains the include files and library links for \
developing with polybori/brial libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.15"

RPM_NAME = "brial-devel-1.2.15-2.1.aarch64.rpm"
RPM_HASH = "d67fe66d7ac2a4fabaff3448de5c57313c14e3a5296bb818f6f9d50f1622dd0ce7f6f6de75174cc817daeb80f9cdbac4c626207eb14dbaa4cf82d7138fc2b1a9"

RPROVIDES:${PN} += "brial-devel \
pkgconfig-brial"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boost-devel \
libbrial3 \
pkgconfig-m4ri"

inherit rpm
