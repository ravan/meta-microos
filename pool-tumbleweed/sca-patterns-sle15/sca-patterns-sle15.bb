SUMMARY = "Supportconfig Analysis Patterns for SLE15"
DESCRIPTION = "Supportconfig Analysis (SCA) patterns to identify known \
issues relating to all versions of SUSE Linux Enterprise 15 \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.9"

RPM_NAME = "sca-patterns-sle15-1.5.9-1.4.noarch.rpm"
RPM_HASH = "c85131c262da610496f676749b43bd20e2727afd04154a608556809ac183fbe9b2a0eed193b8cdc44ab6a727ce53c30b498bac830a72c97a277866fb1dffa2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle15"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
sca-patterns-base"

inherit rpm
