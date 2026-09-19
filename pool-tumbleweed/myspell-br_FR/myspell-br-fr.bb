SUMMARY = "MySpell br_FR Dictionary"
DESCRIPTION = "Breton spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-br_FR-20240321-1.7.noarch.rpm"
RPM_HASH = "9e6902dc4a545c7ae4928dbb5bc8c94a52345ac36586f22cfba2802eb33ee7563758e58ce2e6c5fc06ae6d21dc9b00191ff9a99bb91f17034da2ea0e10eaca12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-br-FR \
locale-seamonkey-spellchecker-br-FR \
myspell-br-FR \
myspell-breton \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
