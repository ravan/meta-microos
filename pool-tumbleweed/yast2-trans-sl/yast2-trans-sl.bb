SUMMARY = "YaST2 - Slovene Translations"
DESCRIPTION = "YaST2 - Translations for Slovene."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-sl-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "1cc2152e307808f7313c4d668e2ab4ced91084ed0b47a8fabc5452d1fb3966e64cf23ef66d9c1122b8a0c295a2a51a7821311cc47680627c69581bf0ff848165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sl \
yast2-trans-sl"

RDEPENDS:${PN} += ""

inherit rpm
