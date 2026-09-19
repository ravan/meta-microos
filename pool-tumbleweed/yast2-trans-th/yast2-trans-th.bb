SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-th-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "97966e137a7f67b9bcf1502ba7523a821915798a1721a66b30284f44c4a311ad546ec0af1bae78757fa53e6b7fd0a43b5e21219045c7336a28402db299c78c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-th \
yast2-trans-th"

RDEPENDS:${PN} += ""

inherit rpm
