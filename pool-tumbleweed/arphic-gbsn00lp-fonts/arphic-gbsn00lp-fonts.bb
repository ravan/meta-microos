SUMMARY = "AR PL SungtiL GB Chinese TrueType font by Arphic Technology"
DESCRIPTION = "AR PL SungtiL GB is a high quality Chinese TrueType font (gbsn00lp.ttf) \
generously provided by Arphic Technology to the Free Software community \
under the Arphic Public License."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-gbsn00lp-fonts-20001125-779.3.noarch.rpm"
RPM_HASH = "68f03e1263dd1e1f708ee4a2e3ade908cfb95f5e81108b1ddb50eefc327db6cd59cd93d7ca6e832968ee5c34d52026b347c27dc4628f08995d7311f1432c37b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-gbsn00lp-fonts \
config-arphic-gbsn00lp-fonts \
ttf-arphic-gbsn00lp"

RDEPENDS:${PN} += "/usr/bin/sh \
arphic-fonts"

inherit rpm
