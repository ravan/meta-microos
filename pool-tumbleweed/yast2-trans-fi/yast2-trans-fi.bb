SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-fi-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "4bf3858effc6928f641439b19adaa653fdbf41928b0f64c2d7bb93ae54ea0783a6162fad69fe9aaced015d3192f7439ba07dacc5647af37ef78ea6908f77b7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fi \
yast2-trans-fi"

RDEPENDS:${PN} += ""

inherit rpm
