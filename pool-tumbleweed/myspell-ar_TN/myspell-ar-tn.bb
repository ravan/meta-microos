SUMMARY = "MySpell ar_TN Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_TN-20240321-1.7.noarch.rpm"
RPM_HASH = "01b0d320c9e200ba48c8567f10726607a3557187228b89179654549114e79fc66e5a97c6087d0f199e6eaa8f8819381fb68e6af51ec750a5715587f649bf36f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-TN \
locale-seamonkey-spellchecker-ar-TN \
myspell-ar-TN \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
