SUMMARY = "Supportconfig Analysis Patterns for SLE12"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SLE12 \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.8"

RPM_NAME = "sca-patterns-sle12-1.5.8-1.4.noarch.rpm"
RPM_HASH = "aa5634d5870121dd4034bf1d93cba0aa176d661e849bd6e0d5790add1403eab18e10302775673f12d842d50adeccce64ae70579b90e43dbec544abfa51987ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle12"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
sca-patterns-base"

inherit rpm
