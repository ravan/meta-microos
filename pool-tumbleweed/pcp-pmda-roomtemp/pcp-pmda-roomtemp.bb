SUMMARY = "Performance Co-Pilot (PCP) metrics for the room temperature"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the room temperature."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-roomtemp-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "0b14158e949d13c3d44431d9fa3c7bfeb262e9baddb4560272c88611eea0c89afdc9b29b78016bbd471960a7045e69ca8b4097021295542db0bfcdcfcb500c55"

RPROVIDES:${PN} += "pcp-pmda-roomtemp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
