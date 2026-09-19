SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-da-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "58bcac1a18a51094d01989f794d6ac54b3af416564e1fa9d3a50518828b518d33fe2f42714f471fe22c27ef298482552940185c39679d7032a24954b961656d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-da \
yast2-trans-da"

RDEPENDS:${PN} += ""

inherit rpm
