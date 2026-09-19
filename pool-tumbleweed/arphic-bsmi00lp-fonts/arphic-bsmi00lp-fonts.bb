SUMMARY = "AR PL Mingti2L Big5 Chinese TrueType font by Arphic Technology"
DESCRIPTION = "AR PL Mingti2L Big5 is a high quality Chinese TrueType font \
(bsmi00lp.ttf) generously provided by Arphic Technology to the Free \
Software community under the Arphic Public License."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-bsmi00lp-fonts-20001125-779.3.noarch.rpm"
RPM_HASH = "0176599856191ade7c2302ccb7f3c772ab316fc7234c2418ed729622eeb2e408cbfa5a7cf2e3a5c56ad6ca9fe029ed85a34527a251d88b86a23d03560af16a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-bsmi00lp-fonts \
config-arphic-bsmi00lp-fonts \
ttf-arphic-bsmi00lp"

RDEPENDS:${PN} += "/usr/bin/sh \
arphic-fonts"

inherit rpm
