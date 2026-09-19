SUMMARY = "AR PL KaitiM Big5 Chinese TrueType font by Arphic Technology"
DESCRIPTION = "AR PL KaitiM Big5 is a high quality Chinese TrueType font \
(bkai00mp.ttf) generously provided by Arphic Technology to the Free \
Software community under the Arphic Public License."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-bkai00mp-fonts-20001125-779.3.noarch.rpm"
RPM_HASH = "ba8294cf792931997f8fb1a55a91d80f3439666642ffb7c077ac3ccfa559b1d2460531488dd54079816489ae6709a6322824062293218da173470eb358f518bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-bkai00mp-fonts \
config-arphic-bkai00mp-fonts \
ttf-arphic-bkai00mp"

RDEPENDS:${PN} += "/usr/bin/sh \
arphic-fonts"

inherit rpm
