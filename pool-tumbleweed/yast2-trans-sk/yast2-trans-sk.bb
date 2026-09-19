SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-sk-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "2f01744f4329260b9fb0ff97442f762071eb276e86fe9035ba0cb753888d5f830ba4eb1fd91bb17fb2dc5ef10a5d6ec746bff1572af68740f2ffe03102a97f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sk \
yast2-trans-sk"

RDEPENDS:${PN} += ""

inherit rpm
