SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-bs-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "59751d3584aea978ab56fc8ea25c78f7ec35064becf2dc75282e0590efd8f87307f0864e993476ff03331eda1e12f26ad5d8fc35f8ca7157f16ca9fb8ffc2426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bs \
yast2-trans-bs"

RDEPENDS:${PN} += ""

inherit rpm
