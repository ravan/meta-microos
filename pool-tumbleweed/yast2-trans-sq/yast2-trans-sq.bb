SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-sq-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "7c8b84271d115d36f77f8d49673fc6de400f2f1826d6d82ff9e09799bdcbc6cd74662de5752a6d68c963756eddc63c98319bb81c81cf6cf2db95a167386f4d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sq \
yast2-trans-sq"

RDEPENDS:${PN} += ""

inherit rpm
