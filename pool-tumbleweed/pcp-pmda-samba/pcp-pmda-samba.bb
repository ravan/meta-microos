SUMMARY = "Performance Co-Pilot (PCP) metrics for Samba"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Samba."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-samba-6.3.8-3.1.noarch.rpm"
RPM_HASH = "9af41175ca29b4c41743d651e013bde579fd8e9787780074125519c7ab0d92be147ecd71d0e41a8abd856f092cebe0917fc10b9171a27e4d735eef3deb8082dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-samba"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
