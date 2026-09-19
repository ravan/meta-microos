SUMMARY = "Least squares spectral analysis for Octave"
DESCRIPTION = "A package implementing tools to compute spectral decompositions of \
irregularly-spaced time series.  Currently includes functions based off the \
Lomb-Scargle periodogram and Adolf Mathias' implementation for R and C. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.4"

RPM_NAME = "octave-forge-lssa-0.1.4-1.23.aarch64.rpm"
RPM_HASH = "348e7dffcff7abce41c6c98ccdfd0caf226d7ff9a55db35658ff379ad3b67237c969911caf4a6f7a9a319a3698a1a4eee2660e7973028a169f4250b1251acdfb"

RPROVIDES:${PN} += "octave-forge-lssa"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
