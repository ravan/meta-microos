SUMMARY = "Performance Co-Pilot (PCP) metrics for High Availability Clusters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about linux High Availability (HA) Clusters."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-hacluster-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "c8578166fd0277b6401a24861ed5a1bea255a71c36b9af4377c9f5820c7c93cdae9d99bdbe4a8e3b30ce70c9166b252589784e0ffdcae5ebee2d711473fac023"

RPROVIDES:${PN} += "pcp-pmda-hacluster"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
pcp"

inherit rpm
