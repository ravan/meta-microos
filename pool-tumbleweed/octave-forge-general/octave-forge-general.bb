SUMMARY = "General tools for Octave"
DESCRIPTION = "General tools for Octave. \
This is part of Octave-Forge project."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "2.1.4"

RPM_NAME = "octave-forge-general-2.1.4-1.1.aarch64.rpm"
RPM_HASH = "80dc8b31008a036f95e7e70efa0c8285bcbb3693dd70b0ebddf15bc9acf716c43357929eceb679feac06ebf732b9246c220ba6c88f37e3baac79eaa7a451bfab"

RPROVIDES:${PN} += "octave-forge-general"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnettle.so.8 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
