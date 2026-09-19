SUMMARY = "MySpell ca Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ca-20240321-1.7.noarch.rpm"
RPM_HASH = "e74a298cb7c0d54581b9fe182f02119b2be4aa008d913c31bfe0499441da48252c41df2cef735b4b686995e54cb60399ea8723b57f67f0308f1d25805bbd01fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-ca \
locale-libreoffice-ca \
locale-seamonkey-spellchecker-ca \
myspell-ca \
myspell-catalan \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
