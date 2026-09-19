SUMMARY = "Performance Co-Pilot (PCP) metrics for Simple Network Management Protocol"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about SNMP."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-snmp-6.3.8-3.1.noarch.rpm"
RPM_HASH = "2cc8a01d7518fef51576e02cdfc2719a26fc6d3df5253a251a6ee56b7465e4a0c94d0a97a0957096a60a448be44b408a2b67ea4a5640ef1ec676c120803f3735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcp-pmda-snmp \
pcp-pmda-snmp"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-Net--SNMP \
perl-PCP-PMDA"

inherit rpm
