SUMMARY = "Performance Co-Pilot (PCP) metrics for Cisco routers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Cisco routers."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-cisco-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "da021fa68e29e7cd8a01ac8ed8ac98a41fc32e1820c7800bab8afa030e4ad2731c65dd3c8268dcd4dff47154e771963dbafe25b0447866472ef059318f07b970"

RPROVIDES:${PN} += "pcp-pmda-cisco"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
