SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-mk-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "f7e374c99140f572050f92c86194c16657b2b833e4ea569485978e2dbfad25f4a7cbf59c1aacc1cff6dac82ebf99171876e1a3154dd37eb40934f59c67679196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mk \
yast2-trans-mk"

RDEPENDS:${PN} += ""

inherit rpm
