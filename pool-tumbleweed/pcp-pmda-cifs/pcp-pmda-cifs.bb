SUMMARY = "Performance Co-Pilot (PCP) metrics for the CIFS protocol"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Common Internet Filesytem."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-cifs-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "bfecbfe7c9743485211a31d49460687e45d266edb52eeee99e452a3463826bd6ab9cbf07400482302583c5a0631a1ca9d7b0a6d500c1057fce2a58e49d629571"

RPROVIDES:${PN} += "pcp-pmda-cifs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
