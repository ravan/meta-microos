SUMMARY = "Performance Co-Pilot (PCP) metrics for filesystem mounts"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about filesystem mounts."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-mounts-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "7cc55f80456f356d347cb6d42ca8e0c7faaeaecc5e416811ed62a9a8c444969d7e27623b6058cef472060bbd36bf6ad5dbcdc16c6cc8356761b4943846291c93"

RPROVIDES:${PN} += "config-pcp-pmda-mounts \
pcp-pmda-mounts"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
