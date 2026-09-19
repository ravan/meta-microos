SUMMARY = "Additional statistics functions for Octave"
DESCRIPTION = "Additional statistics functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.8.2"

RPM_NAME = "octave-forge-statistics-1.8.2-1.4.aarch64.rpm"
RPM_HASH = "c64b725857c542e8d7f5e289c67e285a94ac91b2839b8f2df4364f956292bd3ad179b3e753c2f678e70b8855e9b47d779be310b9da71e9162dbd60c3edf95e8d"

RPROVIDES:${PN} += "octave-forge-statistics"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-datatypes"

inherit rpm
