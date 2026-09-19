SUMMARY = "Performance Co-Pilot (PCP) metrics for MySQL"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the MySQL database."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-mysql-6.3.8-3.1.noarch.rpm"
RPM_HASH = "4b51b9fde50884576cd268f6c13e5decd0cef29ba9433ccf141030aa227105b20d91ce1ca91dbea0f28dee17ee6522d0fbca162254c990eeb58d0509de77e04f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-mysql"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-DBD--mysql \
perl-DBI \
perl-PCP-PMDA"

inherit rpm
