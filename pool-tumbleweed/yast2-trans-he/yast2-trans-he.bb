SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-he-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "f3d768960965904032463b9aa579d8b8ecfc6af75a13b34206489a52520c045d8ebb5c8e9d43abc4ed4f4bf0142abe9cec0861b372ac0fb1ad3c43fb022a7e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-he \
yast2-trans-he"

RDEPENDS:${PN} += ""

inherit rpm
