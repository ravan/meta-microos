SUMMARY = "Performance Co-Pilot (PCP) metrics for HAProxy"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting performance metrics from HAProxy over the HAProxy stats socket."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-haproxy-6.3.8-3.1.noarch.rpm"
RPM_HASH = "651184ee365e0ff13824d9d29a1424fd4a7d260c43babd1c45ebbe004c08d5c326ced75458a2ac996bf4d3eb65c5fc8fb43556052031e8340a9a0537b5cba22c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-haproxy \
pcp-pmda-haproxy"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
