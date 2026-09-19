SUMMARY = "Performance Co-Pilot (PCP) metrics for the Apache webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Apache webserver."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-apache-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "ceeb028a32b0bdad76cd5d087ecb2d84890a4b1c4a3311a1e4df6ca619c7c7dcc0f86aae28e214ba0adf2d6961fbe9deee3cd7de6e951ac786c2efdf23d7eb44"

RPROVIDES:${PN} += "pcp-pmda-apache"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-web.so.1 \
libpcp.so.3"

inherit rpm
