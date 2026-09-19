SUMMARY = "Performance Co-Pilot (PCP) metrics for the GFS2 filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Global Filesystem v2."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-gfs2-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "bbcf9f3144818c75715c74d0e6f0a0315ab57690196db657599f3f637891dc78b7313f63011a4631245fb8b11b32f24a5662954fb144d2854317b966e2356519"

RPROVIDES:${PN} += "pcp-pmda-gfs2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
