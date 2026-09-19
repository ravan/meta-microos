SUMMARY = "Performance Co-Pilot (PCP) metrics for Elasticsearch"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Elasticsearch."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-elasticsearch-6.3.8-3.1.noarch.rpm"
RPM_HASH = "9c36ef2058ab322abb4de0b5d6bfa13544dcf41e06895aea7781264133845ce1178d97d833f545489c4606decfe5fecd565493f86fd3b8c4d3e078557f51c26a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-elasticsearch \
pcp-pmda-elasticsearch"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
