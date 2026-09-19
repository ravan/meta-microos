SUMMARY = "Performance Co-Pilot (PCP) metrics for ActiveMQ"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the ActiveMQ message broker."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-activemq-6.3.8-3.1.noarch.rpm"
RPM_HASH = "8e3cf9ea95099e4c38042ad20c15b80c80354dd739e201f416f2946e4ac4fee1cfdb9eb82535cb454b92ffb3b1f7651fd1d13a0d382d969b57d735322cd4347a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-activemq \
perl-PCP--ActiveMQ \
perl-PCP--Cache \
perl-PCP--JVMGarbageCollection \
perl-PCP--JVMMemory \
perl-PCP--JVMMemoryPool \
perl-PCP--Queue \
perl-PCP--RESTClient \
perl-PCP--TimeSource"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-LWP--UserAgent \
perl-PCP-PMDA"

inherit rpm
