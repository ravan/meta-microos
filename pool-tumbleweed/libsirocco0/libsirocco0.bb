SUMMARY = "Library for computing homotopy continuation of roots"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root \
of one dimensional sections of bivariate complex polynomials."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libsirocco0-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "e9e119a03e5609ce26b314699be6b2b5310e615b04c9a69c9c047a8ff2fc48b2d0952b460fbac7de1c93678b632f714b70254383f3b603e08cd118b9052cbed3"

RPROVIDES:${PN} += "libsirocco.so.0 \
libsirocco0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
