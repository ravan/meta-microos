SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-pt_BR-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "634e2401902bfd675b77d8d060630ea7b09836b3814427b53ef9b437e5465253e0b4187e7a8b0faf0ec20798532d146ccc4aeb579629e6b75b4a30d6bf74379f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt-BR \
yast2-trans-pt-BR"

RDEPENDS:${PN} += ""

inherit rpm
