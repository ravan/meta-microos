SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-tr-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "d10beba7cafe39ba51804fff9da974d87074a034d2c297ee6ed2ad21a29f4b9ae0ea76ca22aab5e1cbbaf112bee45048a7663cb3dda2170103a657a51e224d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tr \
yast2-trans-tr"

RDEPENDS:${PN} += ""

inherit rpm
