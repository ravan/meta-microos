SUMMARY = "Performance Co-Pilot (PCP) metrics for application tracing"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about trace performance data in applications."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-trace-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "c62798784733d578ed1a6fe91ec76850fb97a6de7c0523ad573720a1aded5e7de11d6a41bc6bee8cef56ca617fe5a63ff230d185d06e611991deaada16ab06ba"

RPROVIDES:${PN} += "pcp-pmda-trace"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-trace.so.2 \
libpcp.so.3"

inherit rpm
