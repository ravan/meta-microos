SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-nl-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "611d43a5e5c6a9ac1213026c4fc296e296cebb4c2368041a3542c58d019318e8363504aedfdb904674295e4c6d90d3a19c1e69a7551e6d57bfe68410b7c61dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nl \
yast2-trans-nl"

RDEPENDS:${PN} += ""

inherit rpm
