SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-sv-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "f1b4563160c653cdf7d5dbffafd91b61790b41babbbcb6104a5875b41805762289c94c887f22a050107dd3838325496780d2e121731e8c5e8649985d2def0d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sv \
yast2-trans-sv"

RDEPENDS:${PN} += ""

inherit rpm
