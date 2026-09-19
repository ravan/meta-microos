SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ta-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "dcfb2881b9d9897d8b58b7073bf3b5fd960a222ec9cdddec39167b4a7fa07fee4eadb2cc13e6763aef370641dd86d4a04fe35ef437cfeb43fcdfac1baafe01ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ta \
yast2-trans-ta"

RDEPENDS:${PN} += ""

inherit rpm
