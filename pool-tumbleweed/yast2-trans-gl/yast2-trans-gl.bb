SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-gl-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "a3d9098ffdfc272f4d9e00f67d1eddb78ab827da48778566275d9241a5f91bb3788af1296c880ffc3258128500792b833449e4527b3f54c7aac23f1def8e1259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gl \
yast2-trans-gl"

RDEPENDS:${PN} += ""

inherit rpm
