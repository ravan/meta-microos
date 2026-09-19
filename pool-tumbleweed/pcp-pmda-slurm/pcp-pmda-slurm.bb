SUMMARY = "Performance Co-Pilot (PCP) metrics for NFS Clients"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the SLURM Workload Manager."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-slurm-6.3.8-3.1.noarch.rpm"
RPM_HASH = "462065b98db9956aebfe7dd3006276829d540d9517ffbda995308b63f71e57fa9cacb80aedf9bcf04164967b529f2b3f587886eec18b050633e9d4abe8695847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-slurm"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
