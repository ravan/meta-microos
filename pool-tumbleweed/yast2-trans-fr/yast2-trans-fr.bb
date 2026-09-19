SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-fr-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "1674c3a1c195580cb07cb3f976037b55e87a6f978643bc07440e9c931a3aa6c95c14825db08e75c30f098d37d08fa741a5721f329792f9e56b4281649b6a47b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fr \
yast2-trans-fr"

RDEPENDS:${PN} += ""

inherit rpm
