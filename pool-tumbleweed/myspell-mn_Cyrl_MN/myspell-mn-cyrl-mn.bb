SUMMARY = "MySpell mn_Cyrl_MN Dictionary"
DESCRIPTION = "Mongolian spelling and hyphenation dictionaries."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-mn_Cyrl_MN-20240321-1.7.noarch.rpm"
RPM_HASH = "9d9c70069b777a9873c842498faffcdd0324db7f20b6558ec6efdc98e596f4cda69a803b1f2bae6f541591deb42d477a1720310f5b3d39c70f5dc5458fe9ae63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-mn-Cyrl-MN \
locale-seamonkey-spellchecker-mn-Cyrl-MN \
myspell-dictionary \
myspell-mn-Cyrl-MN"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-mn-MN"

inherit rpm
