SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-lv-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "60e4ffb42a1caad117fe9c5b1573e3a35f587456dedb1b80329499bd9911c9489e809eccbdd33f1232a3c183b37994faf5d317a0fa85a61757e3c8f4e3a368de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lv \
yast2-trans-lv"

RDEPENDS:${PN} += ""

inherit rpm
