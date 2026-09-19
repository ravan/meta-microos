SUMMARY = "YaST2 - Korean Translations"
DESCRIPTION = "YaST2 - Translations for Korean."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ko-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "1ccd4fd7bc5da36863f1f510532f78d5930f9961baed257110b778fa4cde3bce63227cc3b10b4ba61df5a92f1931926bec45a1b5e6318724e46eb63a6eb83704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ko \
yast2-trans-ko"

RDEPENDS:${PN} += ""

inherit rpm
