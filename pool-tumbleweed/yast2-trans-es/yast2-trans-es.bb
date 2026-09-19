SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-es-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "4b6d633cd8dc61fb83bad60b277aa72eb56ef90e457f423dd3be728272d48fbabb6522e8f3cee3d9b570faeb21f5eaa244fb0e28d46996d5b6733d35cae39067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es \
yast2-trans-es"

RDEPENDS:${PN} += ""

inherit rpm
