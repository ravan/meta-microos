SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-lt-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "364c7543c3b5ed30fab1ede853af2c518e8a6a386a1e120315acb3b2400e537c58f439e0aa4a1018b5b6d5f3434e4f096e8e6c2c031277c655d4655ea872a39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lt \
yast2-trans-lt"

RDEPENDS:${PN} += ""

inherit rpm
