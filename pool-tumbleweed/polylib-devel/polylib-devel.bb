SUMMARY = "Development files for PolyLib"
DESCRIPTION = "The Polyhedral Library (PolyLib) operates on objects made up of \
unions of polyhedra of any dimension. \
 \
It can manipulate non-parameterized unions of polyhedra \
(intersection, difference, union, convex hull, simplify, image and \
preimage, plus some input and output functions), parameterized \
vertices computation, and Ehrhart polynomials computation. \
 \
This subpackage contains the include files and library links for \
developing with PolyLib."
LICENSE = "MIT"

PV = "5.22.8"

RPM_NAME = "polylib-devel-5.22.8-1.5.aarch64.rpm"
RPM_HASH = "07886896472e5528ba793a98c8ae0fcf719d3034f47d76fe719ff361c97c9e59c918e10bc38dc540383216cfc9617de846e0315980dc2a39df7ff8509e207357"

RPROVIDES:${PN} += "pkgconfig-polylibgmp \
polylib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolylibgmp8 \
pkgconfig-gmp"

inherit rpm
