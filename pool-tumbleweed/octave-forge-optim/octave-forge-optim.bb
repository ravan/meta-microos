SUMMARY = "Non-linear optimization toolkit for Octave"
DESCRIPTION = "Non-linear optimization toolkit. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "octave-forge-optim-1.6.2-2.7.aarch64.rpm"
RPM_HASH = "a0230df84869bc8acc28e0524d00af13af49ffadd1cc584d8246a42e8f99b47195913e389e050fa54e8d942a0c77fd49346e088114d3f5d3e6bb15f06d5f9a14"

RPROVIDES:${PN} += "octave-forge-optim"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-parallel \
octave-forge-statistics \
octave-forge-struct"

inherit rpm
