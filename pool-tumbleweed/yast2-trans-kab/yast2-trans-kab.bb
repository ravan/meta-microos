SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-kab-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "e5b25c73408538a5d0b85abeab4d3ad95b7d23a5f3023c9f0160845f204e954c3a976597fcaa4bf75a6d45f97bc99710bdf944eebf044976f0b6d6a1f20da0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-kab \
yast2-trans-kab"

RDEPENDS:${PN} += ""

inherit rpm
