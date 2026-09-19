SUMMARY = "Performance Co-Pilot (PCP) metrics for Memcached"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Memcached."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-memcache-6.3.8-3.1.noarch.rpm"
RPM_HASH = "4a3447919fee0e38d5d31099926b54e6b6a8c39c1f12624572865b05c1ee82f1a39b0564035f318d911b8171f62d1d3989d014c03c4a0ed34a83bce4a5ab54b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-memcache"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
