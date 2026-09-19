SUMMARY = "YaST2 - Swahili Translations"
DESCRIPTION = "YaST2 - Translations for Swahili."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-sw-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "9459dffa62120905bcabdb84c3fc0d3294f79814a5d8417a89b80aca09a8e477fb98ac6ef04922e51ac667f728a38a2cec7c9c3288de05247f0ddc3b07653e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sw \
yast2-trans-sw"

RDEPENDS:${PN} += ""

inherit rpm
