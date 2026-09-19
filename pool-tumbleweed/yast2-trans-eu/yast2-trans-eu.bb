SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-eu-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "cfdfe36ff103c6b24d741a9ae04b70e95d5bce79685c03d9a7cd11a78e589bc7c96a7ba4ecc18a05a6cbee144b36371db6df082c09da5cdd2d8afcf2750de80b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eu \
yast2-trans-eu"

RDEPENDS:${PN} += ""

inherit rpm
