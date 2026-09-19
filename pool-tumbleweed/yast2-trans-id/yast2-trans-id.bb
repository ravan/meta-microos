SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-id-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "4ee9411cceec30acbeecde87587ecebec76f353348bfe3d66c8eda0168822ef1c00dcd21756f947352a947ffac1861004dcce8328e857b3a38f94954813d3525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-id \
yast2-trans-id"

RDEPENDS:${PN} += ""

inherit rpm
