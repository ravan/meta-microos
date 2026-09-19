SUMMARY = "Performance Co-Pilot (PCP) metrics for GPFS Filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the GPFS filesystem."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-gpfs-6.3.8-3.1.noarch.rpm"
RPM_HASH = "1c64cc5cee3e95f0a6adf4e91541fee2594bd16e9a66c7e7f4b031f80836e2a44114cfbedab8ca4ff476ba3ae26782ff32a78adabe6f352d0f92c7fdf551fb28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-gpfs"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
