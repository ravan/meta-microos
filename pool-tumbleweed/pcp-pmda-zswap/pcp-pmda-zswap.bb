SUMMARY = "Performance Co-Pilot (PCP) metrics for compressed swap"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about compressed swap."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-zswap-6.3.8-3.1.noarch.rpm"
RPM_HASH = "e9da032b7bb45bb297b2d26e2230e22440e9ce5b48b6ba97d3a682d07528a6f1a048d9f168ff6b179d0f395ce29795274580e63ba694ab7e3035f2a65275d3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-zswap"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
