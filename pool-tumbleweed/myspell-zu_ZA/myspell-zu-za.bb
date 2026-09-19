SUMMARY = "MySpell zu_ZA Dictionary"
DESCRIPTION = "Zulu hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-zu_ZA-20240321-1.7.noarch.rpm"
RPM_HASH = "9e94e3b74ad87edb51f8ab2c936247cab3dee44984641b5c98ec7fba2a6e3c458df0f8dffcfe4788526e997f05b4dfc60746767a4477c985d6cd6658e3ab6073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-zu-ZA \
locale-seamonkey-spellchecker-zu-ZA \
myspell-dictionary \
myspell-zu-ZA \
myspell-zulu"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
