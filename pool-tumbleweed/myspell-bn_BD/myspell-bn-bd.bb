SUMMARY = "MySpell bn_BD Dictionary"
DESCRIPTION = "Bengali spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-bn_BD-20240321-1.7.noarch.rpm"
RPM_HASH = "3b4610dda33e67e67c1f68e2acd3343f2f90005c0bb64a465be33852c391cf4a4604649daf805d4e9282092b1191398b0bde56dfe6788685f75118949dabebff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-bn-BD \
locale-seamonkey-spellchecker-bn-BD \
myspell-bengali \
myspell-bn-BD \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
