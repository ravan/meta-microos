SUMMARY = "Fonts from the GNU Intlfonts Package in BDF Format"
DESCRIPTION = "Fonts from the GNU intlfonts package in the BDF format. \
 \
These fonts are useful for printing exotic languages such as Thai, \
Tibetan, Vietnamese, Arabic, and more from within Emacs."
LICENSE = "HPND & SUSE-Redistributable-Content & SUSE-Public-Domain"

PV = "1.4.2"

RPM_NAME = "intlfonts-bdf-fonts-1.4.2-1.6.noarch.rpm"
RPM_HASH = "157473a2999dee0008b9de065b08ccad35384270dcb54c33d34b0389f51dd89bf503f412fcd2e782a83c1b540bebd670823f8c464a63fa731c5618c2579fdd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "intlfonts-bdf \
intlfonts-bdf-fonts"

RDEPENDS:${PN} += ""

inherit rpm
