SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-hi-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "5258e2f178107e3edb74d471845722ae083a458fb66c6c692abf33ee03b483b7fd1ae48063614835b45a40ebb379d7eb882dfcc724d5ff7b190f55d22999d7f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hi \
yast2-trans-hi"

RDEPENDS:${PN} += ""

inherit rpm
