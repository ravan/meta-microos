SUMMARY = "MySpell ar_KW Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_KW-20240321-1.7.noarch.rpm"
RPM_HASH = "253497d26f1866857e87fb62265520f277aaaf0d265fa785d92c7d492ef72d4f303b6250ec2f69f75fa3c43d89e0e398b83a4a8b73c31dc4917f9cc4ac0ee6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-KW \
locale-seamonkey-spellchecker-ar-KW \
myspell-ar-KW \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
