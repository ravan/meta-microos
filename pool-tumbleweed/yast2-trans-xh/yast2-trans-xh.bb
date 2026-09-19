SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-xh-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "f638e4fcf2fa0181c1b54a71e1858c436940a6b56b433b7b5dcc827d14eda274a267b464415fa07e4d890c254cd043e2b81bee52703add3691adeb5659667989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-xh \
yast2-trans-xh"

RDEPENDS:${PN} += ""

inherit rpm
