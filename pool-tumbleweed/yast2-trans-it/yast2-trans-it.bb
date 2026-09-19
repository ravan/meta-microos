SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-it-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "a6af54a055ce75d130c0b3a97975dfae11f097252f700faea0f456c1a2daad66c6e526ac67f99659b5b1e52996f78881738acc25aad28b9edfd9cf616c2976ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-it \
yast2-trans-it"

RDEPENDS:${PN} += ""

inherit rpm
