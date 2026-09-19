SUMMARY = "Performance Co-Pilot (PCP) metrics from arbitrary log files"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from a specified set of log files (or pipes).  The PMDA \
supports both sampled and event-style metrics."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-logger-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "acfc8cfc5003f9cbc35b35ea63d886d2d90033a774c759b265a320c351ed23b3de557ae1198dc9a11cdf7cdb933716d7d324ede88f67fca421866a3965a579d1"

RPROVIDES:${PN} += "pcp-pmda-logger"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
