SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-hu-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "d8f5a049434e8a3e0c33d256843b1d70d139c6058b2ded394db3e646a1551980f9db4aaa5cea852bc89e63a49476ec8496a702bc517d239e82b54f9bf8fe88fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hu \
yast2-trans-hu"

RDEPENDS:${PN} += ""

inherit rpm
