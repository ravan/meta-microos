SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-sr-latin-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "6060195ef4d843485ff36e721d596c1d67fff9f89c179c45c967200a0b4d2c8aa848e9814c0686cd588b89ddb942c51e183ee036e101307de25345d4e489d856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr@latin \
yast2-trans-sr-latin"

RDEPENDS:${PN} += ""

inherit rpm
