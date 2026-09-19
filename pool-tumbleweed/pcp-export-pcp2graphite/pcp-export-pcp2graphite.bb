SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Graphite"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to graphite (http://graphite.readthedocs.org)."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-export-pcp2graphite-6.3.8-3.1.noarch.rpm"
RPM_HASH = "4fba7f5d4566cea7934ba048c237cfeae5565b3dba97c13786956b2f8f2ae4f43138bfb941ea438e47aaa187e69079baeb9b0bfe3d9888043689ab0e947ce6c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-export-pcp2graphite"

RDEPENDS:${PN} += "/usr/bin/pmpython \
python3-pcp"

inherit rpm
