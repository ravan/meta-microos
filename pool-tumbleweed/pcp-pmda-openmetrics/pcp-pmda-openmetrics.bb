SUMMARY = "Performance Co-Pilot (PCP) metrics from OpenMetrics endpoints"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting metrics from OpenMetrics (https://openmetrics.io/) endpoints."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-openmetrics-6.3.8-3.1.noarch.rpm"
RPM_HASH = "59aad7b7c621b025e4e1ece4f6406a4753aeceee792c6ef4b587b76fe5d3a730f823587b5d919319b9a920a8356538d7bfa443fc0d04e22c04edbe77fde49a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-openmetrics \
pcp-pmda-openmetrics \
pcp-pmda-prometheus"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp \
python3-requests"

inherit rpm
