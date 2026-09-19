SUMMARY = "Performance Co-Pilot (PCP) metrics for the Unbound DNS Resolver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Unbound DNS Resolver."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-unbound-6.3.8-3.1.noarch.rpm"
RPM_HASH = "9d3ad7a1074ba0b772cf638bb994dbbe1be64047ecf25b00aaeca870ff294c20c9f2033e5f61052a6c0dc8819c1bb778d0d6cec72a2a6904c4fdad1974f34ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-unbound"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
