SUMMARY = "MySpell ar_IQ Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_IQ-20240321-1.7.noarch.rpm"
RPM_HASH = "539dfeb339770391abeddefd3cf5a0cd9e04ef12c212df3ad69561116190b64de79b04e86d21493c7211c280e24cd6bfddf52c244c39727f122377f3854c380d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-IQ \
locale-seamonkey-spellchecker-ar-IQ \
myspell-ar-IQ \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
