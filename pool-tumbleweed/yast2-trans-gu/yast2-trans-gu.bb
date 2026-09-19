SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-gu-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "219787db3ad0d17b7e969069beec156040e9384454c2368645f3014da58fdc2afdb011a8563993f0316d467185a1f7109d1010354ad46d838209668a6ecedef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gu \
yast2-trans-gu"

RDEPENDS:${PN} += ""

inherit rpm
