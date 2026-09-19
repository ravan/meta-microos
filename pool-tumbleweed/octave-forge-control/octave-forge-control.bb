SUMMARY = "Computer-Aided Control System Design (CACSD) Tools"
DESCRIPTION = "Computer-Aided Control System Design (CACSD) Tools for GNU Octave, based \
on the proven SLICOT Library. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "octave-forge-control-4.2.1-1.2.aarch64.rpm"
RPM_HASH = "6826baf65a70705ecb6ca86acf688326524e4f2f227d2ae98a246d7c923ef75ace14fd64e52eb808611840aca0a31d0551787fb1a910b150113209fcc7ba8e61"

RPROVIDES:${PN} += "octave-forge-control"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmvec.so.1 \
libopenblas.so.0 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
