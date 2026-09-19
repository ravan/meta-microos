SUMMARY = "MySpell ar_DZ Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_DZ-20240321-1.7.noarch.rpm"
RPM_HASH = "ca08fdf66d636ccd576676f031aaa00b7ccc98466d287a8a29d70ea14469eb40746919f09ccabea0e771ece797cab1fa6ef08a453eda235d97e83c01d2e8b04f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-DZ \
locale-seamonkey-spellchecker-ar-DZ \
myspell-ar-DZ \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
