SUMMARY = "The Large Time-Frequency Analysis Toolbox for Octave"
DESCRIPTION = "The Large Time/Frequency Analysis Toolbox (LTFAT) is a Matlab/Octave toolbox \
for working with time-frequency analysis, wavelets and signal processing. \
It is intended both as an educational and a computational tool. The toolbox \
provides a large number of linear transforms including Gabor and wavelet \
transforms along with routines for constructing windows (filter prototypes) \
and routines for manipulating coefficients. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "octave-forge-ltfat-2.6.0-2.7.aarch64.rpm"
RPM_HASH = "14bd2ee723c6af5ae4fe62f93ce4507748476fd253562f4d89bd07f43f96efe0ad01a175f7b4e7e122f088f1015906ba364185244a0905a8972bee80e5b57af5"

RPROVIDES:${PN} += "octave-forge-ltfat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
liboctmex.so.1 \
libopenblas.so.0 \
libportaudio.so.2 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
