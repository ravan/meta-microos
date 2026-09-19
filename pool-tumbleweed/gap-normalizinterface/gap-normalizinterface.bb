SUMMARY = "GAP: wrapper for Normaliz"
DESCRIPTION = "The NormalizInterface package provides a GAP interface to Normaliz, \
enabling direct access to the complete functionality of Normaliz, \
such as computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "gap-normalizinterface-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "4eff1355aa12190ff4b2002626aeca6d306f6619c5ef77bbfbbff8c04f3132110ab78439055b408b8474c0f46c799eff2a82c8aa95651df6e79d75b3083611c4"

RPROVIDES:${PN} += "gap-normalizinterface"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libnormaliz.so.3 \
libstdc++.so.6"

inherit rpm
