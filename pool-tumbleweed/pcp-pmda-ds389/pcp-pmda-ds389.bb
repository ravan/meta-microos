SUMMARY = "Performance Co-Pilot (PCP) metrics for 389 Directory Servers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about a 389 Directory Server."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-ds389-6.3.8-3.1.noarch.rpm"
RPM_HASH = "995cb9f4b6779ea087c1afd83caddcb91fd8f507f7bb79adda0785291c8aa2c03c5e35457eef12fc957c680e2bff7ee6ad122f8e47eb57b9f7ed207e3082d337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-pmda-ds389"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA \
perl-ldap"

inherit rpm
