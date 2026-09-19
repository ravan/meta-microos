SUMMARY = "Development files for PolyLib"
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
developing with PolyLib."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.8"

RPM_NAME = "barvinok-devel-0.41.8-1.8.aarch64.rpm"
RPM_HASH = "52a80977a0df7364e12a6d12ae35582efd33995397d06392ec90272e87c2623b0b802467463623c1e33af24d9a8604eebdab20866b14533f2435f5d9c763fb91"

RPROVIDES:${PN} += "barvinok-devel \
pkgconfig-barvinok"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbarvinok23 \
pkgconfig-gmp \
pkgconfig-isl"

inherit rpm
