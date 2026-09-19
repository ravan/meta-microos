SUMMARY = "Performance Co-Pilot (PCP) metrics for JSON data"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics output in JSON."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-json-6.3.8-3.1.noarch.rpm"
RPM_HASH = "900d10861f86199d3fddc31afb1d8173e33cd06f12bd93ed9c77d8136414405588c728c7c8ba829109de0f539e973f4ec38f6bfde06665fe7d95e1cd9c5fda1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-json \
pcp-pmda-json"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-jsonpointer \
python3-pcp \
python3-six"

inherit rpm
