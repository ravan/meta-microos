SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ja-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "a7c9e376603ea51e69b46014a10d5fe225c4d95d20d30e5d6254d4e76bcfa99ca13207c1408d50ef56c1549e76271f6fd4a2305ceb07d1c668dc41813fd93101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ja \
yast2-trans-ja"

RDEPENDS:${PN} += ""

inherit rpm
