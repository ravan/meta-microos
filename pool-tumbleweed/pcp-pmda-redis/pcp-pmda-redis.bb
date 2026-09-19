SUMMARY = "Performance Co-Pilot (PCP) metrics for Redis"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from Redis servers (redis.io)."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-redis-6.3.8-3.1.noarch.rpm"
RPM_HASH = "b68290427cc44d19bc91dd1942584a33a802c8c8034e88766adeac4022dd75caf3897d40ade000d8342d6626b732c9aa5c3f84efcd6b2e7569a7fb4048bb60c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-redis \
pcp-pmda-redis"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
