SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-si-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "0234f732b3d3d2d1cea3b5ff8c9975c208566e88165dc4ccb3b40b1a5832139fdca6c9bcb4cc688be160677ca2ce88017970a3eb0a7f7285c153d3c1bbd3cced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-si \
yast2-trans-si"

RDEPENDS:${PN} += ""

inherit rpm
