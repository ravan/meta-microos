SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-nb-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "c9cdca7187028508d177b5d04a1ab85c0df6835f66af5d761f74b546b9287ed86cf9331bc4a0f3e3151b708804e674e27f9ac6a2395dea2033259ada9f4f6182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nb \
yast2-trans-nb"

RDEPENDS:${PN} += ""

inherit rpm
