SUMMARY = "MySpell bs Dictionary"
DESCRIPTION = "Bosnian spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-bs-20240321-1.7.noarch.rpm"
RPM_HASH = "62cf6ad7b0fec173dbb7a4093396eb6aea431c649eedbb8c7d9b0f2885ab9e95fcea90d2ec7c1ca0e66da60ec254ba5a39327ed8668426988a80bb0c7380ee56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-bs \
locale-seamonkey-spellchecker-bs \
myspell-bs \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-bs-BA \
myspell-dictionaries"

inherit rpm
