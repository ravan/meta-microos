SUMMARY = "MySpell ro_RO Dictionary"
DESCRIPTION = "rospell Romanian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ro_RO-20240321-1.7.noarch.rpm"
RPM_HASH = "01e273e636ee8c4de34a437e47baa792ced47d6edce9a95ce1530eb86f756b77b52736b7283bea49e92d7a218c42627a9823776080cc263025d68571954376c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ro-RO \
locale-seamonkey-spellchecker-ro-RO \
myspell-dictionary \
myspell-ro-RO"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-ro"

inherit rpm
