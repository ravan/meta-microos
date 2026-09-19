SUMMARY = "Performance Co-Pilot (PCP) metrics for Named"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Named nameserver."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-named-6.3.8-3.1.noarch.rpm"
RPM_HASH = "b177b0b340803497c6a4c047f02bf05ebb78575323242181c34ef596941d0e6a1391d4cb998fa834a4d139ee21faabb54b326d2db09c933aeb9f459f876450e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-named"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
