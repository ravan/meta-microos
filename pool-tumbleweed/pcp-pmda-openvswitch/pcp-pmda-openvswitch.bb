SUMMARY = "Performance Co-Pilot (PCP) metrics for Open vSwitch"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from Open vSwitch."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-openvswitch-6.3.8-3.1.noarch.rpm"
RPM_HASH = "9b3f6f53bcaae8cef662564da7dd24a59b089648b76b2ccb1ba2bea555d9ed546789083f58233a0adcd04d64f7093138745d9455eefce97eb73eabfa22fec925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-openvswitch"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
