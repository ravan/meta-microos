SUMMARY = "Performance Co-Pilot (PCP) development tools and documentation"
DESCRIPTION = "Performance Co-Pilot (PCP) documentation and tools for development."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "pcp-devel-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "b4358f5dbbef0f64e50fec0cb53c9a7f7d3bf9b2dc83f452a8fce5cd25eeb7cf0b782c4c871a52e2f7b8f4be77c160748ef278264febb6bde30fd1c3b724aba4"

RPROVIDES:${PN} += "config-pcp-devel \
pcp-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pmpython \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
