SUMMARY = "Octave interaction with PFS tools"
DESCRIPTION = "The pfstools-octave package contains programs to process RGB \
or luminance channels in PFS streams using Octave."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-octave-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "1a1bee82c73704bfe28c3b53e3839894782e109c2ce97c316755ddbdbbba021d6a26aa0b09e01b21c9a407e05320390488767d5f9de5aaea71d3169df372f55d"

RPROVIDES:${PN} += "pfstools-octave"

RDEPENDS:${PN} += "/usr/bin/octave \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6 \
octave"

inherit rpm
