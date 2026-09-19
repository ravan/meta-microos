SUMMARY = "C++ API for Normaliz, a tool for computation of rotational cones"
DESCRIPTION = "Normaliz is a tool for computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones. \
 \
Normaliz offers an API, libnormaliz, that allows the user to access \
the Normaliz computations from C++ programs."
LICENSE = "GPL-3.0-or-later"

PV = "3.11.1"

RPM_NAME = "libnormaliz3-3.11.1-1.5.aarch64.rpm"
RPM_HASH = "feea56ced74d2f2abbb1017a097f91944f29879cd8043e133d12bbb757f3c1b8f0f32ad20894c63021baf53373b475934d9809954e2ccdd18378fdf0c682ae45"

RPROVIDES:${PN} += "libnormaliz.so.3 \
libnormaliz3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeanticxx.so.3 \
libflint.so.24 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
