SUMMARY = "Performance Co-Pilot (PCP) per-socket metrics"
DESCRIPTION = "This package contains the PCP Performance Metric Domain Agent (PMDA) for \
collecting per-socket statistics, making use of utilities such as 'ss'."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-sockets-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "d129e7675a174c1ff5ab7ce5972d92bed9e78cf17333ee7d59001c310d6ab5245bd57a2a2c58cf13273da92c8fee9f6ec9159e0191596eccb179a0f252887400"

RPROVIDES:${PN} += "pcp-pmda-sockets"

RDEPENDS:${PN} += "/usr/bin/sh \
iproute \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
pcp"

inherit rpm
