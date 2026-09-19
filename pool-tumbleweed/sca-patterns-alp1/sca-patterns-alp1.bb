SUMMARY = "Supportconfig Analysis Patterns for SLE16"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SUSE Linux Enterprise 16 \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "sca-patterns-alp1-2.0.5-1.6.noarch.rpm"
RPM_HASH = "08206a3ac9253b70046be122cfb35b8e00ce4769df4c22a548901aee392c71bb8eb9a0053b438c0fcdbf2ee4170500a4aa5656f060ef7ec8742537eb3ac536cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-alp1"

RDEPENDS:${PN} += "/usr/bin/python3 \
sca-patterns-template-gen2"

inherit rpm
