SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ar-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "c18105f79af3c7943ea3eab1407d73d63bf9264487a9f58a5d6cf99504e8e6638ec36a366025107561e1682a0c1040f14f7647ab02b22f4570ebaa7517fd2272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ar \
yast2-trans-ar"

RDEPENDS:${PN} += ""

inherit rpm
