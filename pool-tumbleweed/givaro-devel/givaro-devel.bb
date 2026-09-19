SUMMARY = "Development files for Givaro, an algorithmic-algebraic computation library"
DESCRIPTION = "Givaro is a C++ library for arithmetic and algebraic computations. \
 \
Its main features are implementations of the basic arithmetic of many \
mathematical entities: Primes fields, Extensions Fields, Finite \
Fields, Finite Rings, Polynomials, Algebraic numbers, Arbitrary \
precision integers and rationals. \
 \
This subpackage contains the include files and library links for \
developing against the Givaro library."
LICENSE = "CECILL-B"

PV = "4.2.2"

RPM_NAME = "givaro-devel-4.2.2-1.3.aarch64.rpm"
RPM_HASH = "e8fed925163ada86f389fd63a544ce8fef3096cf8084c3554fcb6d350a0c5b3d2c3b7188c4ad8435402eda6e7a5ef34d698f0e88af9b3f8bf75a957c9126708f"

RPROVIDES:${PN} += "givaro-devel \
pkgconfig-givaro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgivaro9"

inherit rpm
