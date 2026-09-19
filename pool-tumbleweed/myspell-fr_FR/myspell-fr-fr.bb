SUMMARY = "MySpell fr_FR Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-fr_FR-20240321-1.7.noarch.rpm"
RPM_HASH = "cda8d251adc9f09b9e7d3ef05a1cd704fe7a9bc190ea05d09fcf5a41821e69c2672c778898db838a40ab7c45278c4408ab4425a4ea308b3a2b0da9000d407d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-fr \
locale-libreoffice-fr-FR \
locale-seamonkey-spellchecker-fr-FR \
myspell-dictionary \
myspell-fr-FR \
myspell-french"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
