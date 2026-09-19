SUMMARY = "MySpell bg_BG Dictionary"
DESCRIPTION = "Bulgarian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-bg_BG-20240321-1.7.noarch.rpm"
RPM_HASH = "299fa26bbfd1943c6cf5066806f5a8539f8fee8e1f90054c5c192b81e3cec789fb57a4e4e585f25f2ff27a32c71157bb35a7dcca3779191231aed3a2377d57d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-bg \
locale-libreoffice-bg-BG \
locale-seamonkey-spellchecker-bg-BG \
myspell-bg-BG \
myspell-bulgarian \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
