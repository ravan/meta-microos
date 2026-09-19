SUMMARY = "MySpell th_TH Dictionary"
DESCRIPTION = "Thai spelling dictionary and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-th_TH-20240321-1.7.noarch.rpm"
RPM_HASH = "a8920affdd12e47b9326c95edd3cd6059fd606799edfbe31f26569a280248e8d93a7e3a628b8a9cfb5a88268d948075d8addd656984963b314565a17b5d69629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-th-TH \
locale-seamonkey-spellchecker-th-TH \
myspell-dictionary \
myspell-th-TH \
myspell-thai"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
