SUMMARY = "YaST2 - Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-pt-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "06599987224b0d87f1e96b0cf05d3d0c577e2406539555b76ec657f9d446d0f9fef83e025be39987351a5eb73f1a9fbe18cc05e5dc3ed84306e88fb05723dfe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt \
yast2-trans-pt"

RDEPENDS:${PN} += ""

inherit rpm
