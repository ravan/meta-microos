SUMMARY = "Performance Co-Pilot (PCP) metrics for the Oracle database"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Oracle database."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-oracle-6.3.8-3.1.noarch.rpm"
RPM_HASH = "d02d26c53737301c8b18c9aac9d391907bcf5f83a1351ba123476c8360ec683f797d1b7ea2d323af020ca7e11625c6646f747c2bcf100473176f594e10b0b354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-oracle \
pcp-pmda-oracle"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBI \
perl-PCP-PMDA"

inherit rpm
