SUMMARY = "A statistics and machine learning toolbox"
DESCRIPTION = "A statistics and machine learning toolbox for data with and w/o missing values. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.0"

RPM_NAME = "octave-forge-nan-3.7.0-1.17.aarch64.rpm"
RPM_HASH = "be98ff68873680cae5f0be104ca62e1f3027220f368e299be02c2bc938534c9d3b95ba8315da2d3ab48a2ea0b0eb084d336610456d5b332aa13fd39fe24ee361"

RPROVIDES:${PN} += "octave-forge-nan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
liboctmex.so.1 \
libopenblas.so.0 \
libstdc++.so.6 \
octave-cli"

inherit rpm
