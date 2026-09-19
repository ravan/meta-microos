SUMMARY = "Performance Co-Pilot (PCP) metrics for the sendmail queue"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about email queues managed by sendmail."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-mailq-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "d7572101f9a34fa053579df0329aee17f3f08d300befe6715877ef15457b48a718c55fd84f4c690dea7b93fa1611f5964ad20de8a6ee439a3a5d5c6209ccae9a"

RPROVIDES:${PN} += "pcp-pmda-mailq"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
