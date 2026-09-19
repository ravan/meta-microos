SUMMARY = "Performance Co-Pilot (PCP) metrics for Infiniband HCAs and switches"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting Infiniband statistics.  By default, it monitors the local HCAs \
but can also be configured to monitor remote GUIDs such as IB switches."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-infiniband-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "e84701e2e67112425f905658ea82b8a15d5dd09aab0a50131c0430997cf7e74114da2c378aaed98d640645168b96b7a6140836801f94c262198b518e3a8945a1"

RPROVIDES:${PN} += "pcp-pmda-infiniband"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
