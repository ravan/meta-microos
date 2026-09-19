SUMMARY = "Performance Co-Pilot (PCP) metrics from web server logs"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about web server logs. \
 end C pmdas"
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-weblog-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "d574c1814313012b656fbd06bf7eddf0b3b98c913445f940d19efaf583b2ad383a30873c4cebcdd20c3b10558da6e6e466007cfd566991c12f75160195ce3a98"

RPROVIDES:${PN} += "pcp-pmda-weblog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
