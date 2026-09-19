SUMMARY = "MySpell af_NA Dictionary"
DESCRIPTION = "Afrikaans spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-af_NA-20240321-1.7.noarch.rpm"
RPM_HASH = "bc6cd9a17a04ca273434335be3bba9e280bfec45cacf4fa094c35d2b6c3138c4b3ef2891b36d12cd61e297a964e5a63c0135f0cc86d3a07c5acba224400d9062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-af-NA \
locale-seamonkey-spellchecker-af-NA \
myspell-af-NA \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-af-ZA \
myspell-dictionaries"

inherit rpm
