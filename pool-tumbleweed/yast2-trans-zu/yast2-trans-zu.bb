SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-zu-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "cc643075bd08477ea022bd7d9c6b7fe41109eeab0b1051089e326076669e8687f098475eab228b5eeeeee64b3e22df8109a60f5975d8c7c4c082477afcef2a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zu \
yast2-trans-zu"

RDEPENDS:${PN} += ""

inherit rpm
