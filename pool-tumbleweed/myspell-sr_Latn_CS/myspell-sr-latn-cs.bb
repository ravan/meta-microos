SUMMARY = "MySpell sr_Latn_CS Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sr_Latn_CS-20240321-1.7.noarch.rpm"
RPM_HASH = "5261fc2e6f966d6a19774d2bf9507836bdcacdb359d22fcca8cb5330f6cdbebef6377bf49fed249bcd8d6b3bee8be4625395453de2b68e84f80dbbba050329a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sr-Latn-CS \
locale-seamonkey-spellchecker-sr-Latn-CS \
myspell-dictionary \
myspell-sr-Latn-CS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-sr"

inherit rpm
