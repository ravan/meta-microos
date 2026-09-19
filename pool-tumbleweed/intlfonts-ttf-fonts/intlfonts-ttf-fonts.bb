SUMMARY = "TrueType Fonts from the GNU Intlfonts Package"
DESCRIPTION = "TrueType fonts from the GNU intlfonts package."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-ttf-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "d321c0fed2d85e62a737c53b2319d879981aecc5e7b14084b666b944528e749daf3e724ec31421d861972982b162b00d3b73868b2621ea2047ff03162b67fa53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-intlfonts-ttf-fonts \
intlfonts-ttf \
intlfonts-ttf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
