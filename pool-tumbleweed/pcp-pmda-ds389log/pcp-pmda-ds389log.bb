SUMMARY = "Performance Co-Pilot (PCP) metrics for 389 Directory Server Loggers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from a 389 Directory Server log."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-ds389log-6.3.8-3.1.noarch.rpm"
RPM_HASH = "d31c92876076f7b25953bd5cb75036a15cb6ee242b0da50b7afaf60de34ab5af57d14c88619d9dffd848128286594594cd39e070f6e53174f946df1e0cccfcf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-ds389log"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-Date-Manip \
perl-PCP-PMDA"

inherit rpm
