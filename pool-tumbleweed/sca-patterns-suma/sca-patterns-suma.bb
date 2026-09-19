SUMMARY = "Supportconfig Analysis Patterns for SUSE Manager"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SUSE Manager (SUMA) \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.1"

RPM_NAME = "sca-patterns-suma-1.5.1-1.9.noarch.rpm"
RPM_HASH = "49acd4a354f1cc0cf42346d9c45ba23d75e3421ad4b43ff041832aee95072647dd4f6bf606e64492990f7f6b8af1280b9b59b11d3567891d1499b444c0936a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-suma"

RDEPENDS:${PN} += "/usr/bin/python3 \
sca-patterns-base"

inherit rpm
