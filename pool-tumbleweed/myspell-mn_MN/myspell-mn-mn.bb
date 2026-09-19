SUMMARY = "MySpell mn_MN Dictionary"
DESCRIPTION = "Mongolian spelling and hyphenation dictionaries."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-mn_MN-20240321-1.7.noarch.rpm"
RPM_HASH = "fd0fff6a5cf1fbec830c7651f9dd6830e73485e3f44f7a693bd1426ff67e6b55647051411cf2d23ea4428c751d6935bfc177ab1ee3fb2e1b026c90aa5717f929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-mn-MN \
locale-seamonkey-spellchecker-mn-MN \
myspell-dictionary \
myspell-mn-MN"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
