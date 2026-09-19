SUMMARY = "Signal processing tools for Octave"
DESCRIPTION = "Signal processing tools, including filtering, windowing and display functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.4.6"

RPM_NAME = "octave-forge-signal-1.4.6-1.7.aarch64.rpm"
RPM_HASH = "b55c02fc81326d4a3c98f114ba280ebf05436f225aca1371c61828cf1867b9b34cfd02aed1104a043c669fb2f4407b23c790f404f6217325bfdaa88e02ef247f"

RPROVIDES:${PN} += "octave-forge-signal"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-control"

inherit rpm
