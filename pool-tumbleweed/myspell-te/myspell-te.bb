SUMMARY = "MySpell te Dictionary"
DESCRIPTION = "Telugu spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-te-20240321-1.7.noarch.rpm"
RPM_HASH = "f927c51b4014499868983a231c4700a1146c84694894bf3ab5479829b344490e1ea43dcb38e8ce3f0bc27d8bbb533d4f36974122cb0116d47b51ff2acd18c6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-te \
locale-seamonkey-spellchecker-te \
myspell-dictionary \
myspell-te"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-te-IN"

inherit rpm
