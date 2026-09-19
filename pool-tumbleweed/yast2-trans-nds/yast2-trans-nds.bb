SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-nds-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "6b126d3ecc9ea4b68c9eb7a699799763e833f190620ee76626b19c2b815f5510dd5b131e95698e7599af9a0d21a56691c7419e2968d000f6f58d58a87c985380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nds \
yast2-trans-nds"

RDEPENDS:${PN} += ""

inherit rpm
