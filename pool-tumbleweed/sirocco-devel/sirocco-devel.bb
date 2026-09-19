SUMMARY = "Development files for sirocco, a math library"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root of one \
dimensional sections of bivariate complex polynomials. \
 \
The output is a piecewise linear approximation of the path followed \
by the root, with the property that there is a tubular neighborhood, \
with square transversal section, that contains the actual path, and \
there is a three times thicker tubular neighborhood guaranted to \
contain no other root of the polynomial. This second property ensures \
that the piecewise linear approximation computed from all roots of a \
polynomial form a topologically correct deformation of the actual \
braid, since the inner tubular neighborhoods cannot intersect. \
 \
This subpackage contains the include files and library links for \
developing with the sirocco library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "sirocco-devel-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "8876eda76d2f67beaca56c1f50c73ac347c011d5e3a7d270151bf476571f1b1adc9a4d2a134af570ec4e03c8185d842a09214122a2ff69199adeb83899452dbb"

RPROVIDES:${PN} += "pkgconfig-libsirocco \
sirocco-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsirocco0"

inherit rpm
