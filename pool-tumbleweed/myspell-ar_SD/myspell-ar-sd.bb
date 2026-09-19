SUMMARY = "MySpell ar_SD Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_SD-20240321-1.7.noarch.rpm"
RPM_HASH = "fb68b02d762a8c3029d8279a7f4d2d9dbcf1e1f1f7115b51032490666b16ce9542dbf0c4769a0964327d7bcc5b7eee5f038efab27b88d7aca6b78c81f70a2b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-SD \
locale-seamonkey-spellchecker-ar-SD \
myspell-ar-SD \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
