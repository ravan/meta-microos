SUMMARY = "Performance Co-Pilot (PCP) metrics for hardware sensors"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Linux hardware monitoring sensors."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-lmsensors-6.3.8-3.1.noarch.rpm"
RPM_HASH = "f3e017bb4b3fb3b8a28d9f3a84a75dc041742ecea086d24cf4cd1ebdd9f2a0ce3caa96a40ecdf87a0b053e99461830210be7a67ce6ca45ab44b4713a402b0f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-lmsensors \
pcp-pmda-lmsensors-debuginfo"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
