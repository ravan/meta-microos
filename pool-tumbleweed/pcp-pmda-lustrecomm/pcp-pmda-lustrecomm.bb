SUMMARY = "Performance Co-Pilot (PCP) metrics for the Lustre Filesytem Comms"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Lustre Filesystem Comms."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-lustrecomm-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "b75b17ed546e1bcf2b77ff30d31915151127789d30ebad0a7a69e30b711199bd076b2d1de917046065b144f19493952225136594e40513479a2e659f047014eb"

RPROVIDES:${PN} += "pcp-pmda-lustrecomm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
