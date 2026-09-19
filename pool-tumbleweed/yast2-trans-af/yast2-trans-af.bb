SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-af-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "d288b47e7c6b53f62c2afda5d2f7b0db2f6dbe176490dc34dbbca2a922ef55d8c5725e2e3f7219c147063871317594e4337bd4cf8d5920249faef28416ce9e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-af \
yast2-trans-af"

RDEPENDS:${PN} += ""

inherit rpm
