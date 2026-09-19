SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ka-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "8281d627f798918345659fa391a51bd1a54a34ea6027e72a45f1aed3c09577ca5e16c8c5c5ee418da6b6b318cc32cb470acee4592e1fbf72e8d7eae3f2827fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-ka"

RDEPENDS:${PN} += ""

inherit rpm
