SUMMARY = "Performance Co-Pilot (PCP) metrics for Bonded network interfaces"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about bonded network interfaces."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-bonding-6.3.8-3.1.noarch.rpm"
RPM_HASH = "73a92fc96cf4bf6b4b7c96c4c456a6bbb7c87dfc6af62dd1a5492bcbc3dcbb320ddb8ef1f9229409f6b40941176d6acf6daf58028abeb2aee34a1692ec3dd29f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-bonding"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
