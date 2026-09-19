SUMMARY = "MySpell sw_TZ Dictionary"
DESCRIPTION = "Swahili spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sw_TZ-20240321-1.7.noarch.rpm"
RPM_HASH = "6819df5b620981ba6974412f9d5fb77d316e17bba283fd68786ed3dd9eb86fa7d9b141b688ef44a64e533ee94eb0ca57f00be4145852493e4325d3de15bb48ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sw-TZ \
locale-seamonkey-spellchecker-sw-TZ \
myspell-dictionary \
myspell-kiswahili \
myspell-sw-TZ"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
