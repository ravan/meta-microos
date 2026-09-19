SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-hr-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "3d0ab7baa9de31c287a782e7b2e95563feef704a63c65bafc3aff007f463201a915dcd291e88aca2dd944bb065c56bc9f506d7def050fec07d41389f4da3c670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hr \
yast2-trans-hr"

RDEPENDS:${PN} += ""

inherit rpm
