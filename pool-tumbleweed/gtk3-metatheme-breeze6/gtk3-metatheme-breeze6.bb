SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 3 Support"
DESCRIPTION = "A GTK+ theme created to match with the Plasma 6 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "6.7.5"

RPM_NAME = "gtk3-metatheme-breeze6-6.7.5-1.1.noarch.rpm"
RPM_HASH = "e9680622066cefdf091e4c15f4e8c69297a3b2c1f85cdb00d7d980e6715988c78878b9efbf6c8f1293444c1205bce9fcb1ec17c723b42b66d43ba701ebeb5666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-breeze \
gtk3-metatheme-breeze6"

RDEPENDS:${PN} += "metatheme-breeze6-common"

inherit rpm
