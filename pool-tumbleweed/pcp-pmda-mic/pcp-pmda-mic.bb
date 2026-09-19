SUMMARY = "Performance Co-Pilot (PCP) metrics for Intel MIC cards"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Intel MIC cards."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-mic-6.3.8-3.1.noarch.rpm"
RPM_HASH = "cfe9bf1dc965924c0d2e3f3f215596148f55f4f3347229e7a991e5ad0ed2a24617a0bbff39c1f3f6161b7384d5885d2a7fc70fab742bd03153a79ec57fd19c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-mic"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
