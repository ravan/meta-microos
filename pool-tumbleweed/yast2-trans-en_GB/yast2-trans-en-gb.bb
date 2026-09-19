SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-en_GB-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "0a0552669fadef4acd25ea78e4fe2def3b531df5eec559d25e68c57433ae1232d81f46e4a24b487527607423318e760d36fa2d3a91f920dacbce806939257b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-en-GB \
yast2-trans-en-GB"

RDEPENDS:${PN} += ""

inherit rpm
