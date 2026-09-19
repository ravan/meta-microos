SUMMARY = "MySpell hu_HU Dictionary"
DESCRIPTION = "Hungarian spelling dictionary, hyphenation rules, thesaurus, and grammar checker FSF.hu Foundation."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-hu_HU-20240321-1.7.noarch.rpm"
RPM_HASH = "40b0178b737d9e387f3752f60c78eb6ead264c04dcfb934f5f51cf66f22cb615e175e9003ba8976b025302f6b14b0042fda44d243096aecd7225b2d383943274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-hu \
locale-libreoffice-hu-HU \
locale-seamonkey-spellchecker-hu-HU \
myspell-dictionary \
myspell-hu-HU \
myspell-hungarian"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
