SUMMARY = "Performance Co-Pilot (PCP) metrics for the LIO subsystem"
DESCRIPTION = "This package provides a PMDA to gather performance metrics from the kernels \
iSCSI target interface (LIO). The metrics are stored by LIO within the Linux \
kernels configfs filesystem. The PMDA provides per LUN level stats, and a \
summary instance per iSCSI target, which aggregates all LUN metrics within the \
target."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-lio-6.3.8-3.1.noarch.rpm"
RPM_HASH = "1664079524face584cf03fdfca630a996d39c48d04779f9196202abf3637a87c18514969a61c312e1bbe899981b392d9017cc02e4ce54bc30807affaf42df006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-lio"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp \
python3-rtslib-fb"

inherit rpm
