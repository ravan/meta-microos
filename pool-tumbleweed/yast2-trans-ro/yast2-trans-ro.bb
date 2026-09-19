SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ro-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "68214d398b313a81949954b4ea7e0b627f3f68b32c14cd1a3d2e77bc33a7b1c17baf8fc269b046eb205a8c41d40f7cf8c2af86a649c5863f68a0e9ec3dfa04b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ro \
yast2-trans-ro"

RDEPENDS:${PN} += ""

inherit rpm
