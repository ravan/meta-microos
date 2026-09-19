SUMMARY = "Performance Co-Pilot run-time tracing library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time tracing library"
LICENSE = "LGPL-2.1+"

PV = "6.3.8"

RPM_NAME = "libpcp_trace2-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "acb7ad2cab33ce151a1ca135415331a65bd316313274cce0baeb6cfc864e99e1ff334fe3ec530ea2407938151fed52ba145624879e3ae35b9c4a89354975b41a"

RPROVIDES:${PN} += "libpcp-trace.so.2 \
libpcp-trace2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
