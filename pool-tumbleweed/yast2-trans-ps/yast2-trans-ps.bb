SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ps-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "acb2fbd12d7acca5c98d9adbedf91f2cae48654a5de6964bcda71fea8659c01c4da233ea394aca057de8362ceabfe58d5a0be0079fc250051abdfc7445ca1c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ps \
yast2-trans-ps"

RDEPENDS:${PN} += ""

inherit rpm
