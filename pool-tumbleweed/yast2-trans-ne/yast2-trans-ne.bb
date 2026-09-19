SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ne-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "49e6c18de921a703a53020389931b72afe0dde3064bfd742bb456e2d51cdeb6290512576ec3a5229fcec733abd677795703ba63787f1c910e4caa7d17e277358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ne \
yast2-trans-ne"

RDEPENDS:${PN} += ""

inherit rpm
