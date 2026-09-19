SUMMARY = "MySpell gu_IN Dictionary"
DESCRIPTION = "Gujarati spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-gu_IN-20240321-1.7.noarch.rpm"
RPM_HASH = "2aab863df58e6507504ab9f86c4a47f24307d087e5033e71e8cee9da04a4fda35e234f899d329b4325af7b3511a6da48beff83ca61277bdc4d5776bf44aab2dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-gu-IN \
locale-seamonkey-spellchecker-gu-IN \
myspell-dictionary \
myspell-gu-IN \
myspell-gujarati"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
