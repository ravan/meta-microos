SUMMARY = "Performance Co-Pilot (PCP) metrics for Usenet News"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Usenet News."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-news-6.3.8-3.1.noarch.rpm"
RPM_HASH = "2cdb09a84da99f415911ca6d2dd08439c1f5d6393792c6501012d5250c1b75ce7e81db11646de06aca9e552292337883714b1d6cebea9bfe598d835524e0fc8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-news"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
