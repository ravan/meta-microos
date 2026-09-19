SUMMARY = "Performance Co-Pilot (PCP) metrics for a GPS Daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about a GPS Daemon."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-gpsd-6.3.8-3.1.noarch.rpm"
RPM_HASH = "bd8990d67ef03d6d94546563bec75eed7ec65c2c8b6f793a36e0b1a066e05a8ba5fc86942cf3e04aae2105a704a6feb77bef757e43eb7ff9562369e9402e7b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-gpsd"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
