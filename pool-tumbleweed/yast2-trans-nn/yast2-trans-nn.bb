SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-nn-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "a3c5c1c3d3997eb2929f2edd1893363307024332555944c3f096a1c845c0d1ccab28431a115e6423a678ce2f8116e4e3a28779d8ab4ac89a32247ead41c20329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nn \
yast2-trans-nn"

RDEPENDS:${PN} += ""

inherit rpm
