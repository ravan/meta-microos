SUMMARY = "YaST2 - Welsh Translations"
DESCRIPTION = "YaST2 - Welsh translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-cy-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "6c1d16a3351478a88058441caa1f70960789d5486ead625d489cd6fa7115e2b17ecb4c0cf509d8af70f04a284a0c68c3fb2083faa9adce1e6c4f313c349a7da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cy \
yast2-trans-cy"

RDEPENDS:${PN} += ""

inherit rpm
