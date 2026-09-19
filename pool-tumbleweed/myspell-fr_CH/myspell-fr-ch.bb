SUMMARY = "MySpell fr_CH Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-fr_CH-20240321-1.7.noarch.rpm"
RPM_HASH = "3dec16c3de354898156686c64e44049ebe54579b3a3afa629e1abf189306483e851d6f5c58a2e7f79f50d0d32112dd2b50510f1483079b7a25b06970018d6ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-fr-CH \
locale-seamonkey-spellchecker-fr-CH \
myspell-dictionary \
myspell-fr-CH"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr-FR"

inherit rpm
