SUMMARY = "Performance Co-Pilot (PCP) metrics for Database responsiveness"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Database response times and Availablility."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-dbping-6.3.8-3.1.noarch.rpm"
RPM_HASH = "7873f2471d1c7e79c716764c17f9d2b92c0dadb632631d0fa2b97f2bff8000253d4efcb46e9b3d870d9554f675381fb38523b5d17d549a7ecdefbe405ebb547b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-dbping"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
