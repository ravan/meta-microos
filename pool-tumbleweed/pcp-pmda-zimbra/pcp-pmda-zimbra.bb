SUMMARY = "Performance Co-Pilot (PCP) metrics for Zimbra"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Zimbra."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-zimbra-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "f2ff2fbd17d4589d2ebe91c49dc24532f85532083bd09fa64d662464c7f610b5468f487f88ff9ea8c110f4857407f8c41acfd78e715f2bf63567323004344426"

RPROVIDES:${PN} += "pcp-pmda-zimbra"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
perl-PCP-PMDA"

inherit rpm
