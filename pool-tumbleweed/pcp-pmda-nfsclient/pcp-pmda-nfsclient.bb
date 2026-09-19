SUMMARY = "Performance Co-Pilot (PCP) metrics for NFS Clients"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics for NFS Clients."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-nfsclient-6.3.8-3.1.noarch.rpm"
RPM_HASH = "ecae73e77866bf7ce01c665c7b1f87e49084f367b5ca18ea78045cd8d69e9b31a0ed49be22c69220f551f62a796a48f113fcfb5ffe5efd8d48b43e0657927561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-nfsclient"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh \
python3-pcp"

inherit rpm
