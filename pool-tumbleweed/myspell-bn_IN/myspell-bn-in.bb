SUMMARY = "MySpell bn_IN Dictionary"
DESCRIPTION = "Bengali spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-bn_IN-20240321-1.7.noarch.rpm"
RPM_HASH = "e6f829fcc7f19474c15d08c49f58b15b37ee2a321bb485db39703e78d8c5476dc4c517e20e129c91313f5856e257f3154a72c6f8e19b032d1a635317985ff5b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-bn-IN \
locale-seamonkey-spellchecker-bn-IN \
myspell-bn-IN \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-bn-BD \
myspell-dictionaries"

inherit rpm
