SUMMARY = "MySpell ar_AE Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_AE-20240321-1.7.noarch.rpm"
RPM_HASH = "13617457bed84a5a71906a0dc2690dda405ea37b0575bceecf6988ff829ae737fab0728abd47c112b54b2fef5ce3c680efb63fea08424c36bb646329d2d21585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-AE \
locale-seamonkey-spellchecker-ar-AE \
myspell-ar-AE \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
