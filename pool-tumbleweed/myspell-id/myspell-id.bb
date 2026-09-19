SUMMARY = "MySpell id Dictionary"
DESCRIPTION = "Indonesian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-id-20240321-1.7.noarch.rpm"
RPM_HASH = "9f047ed86a545e97e08cba1e5c517aaa23084b19a15976d7afa926df2debe6932351770f0b5ca7d56c55470a54fcc0578b20d304d86218aa8805f4b872bba30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-id \
locale-seamonkey-spellchecker-id \
myspell-dictionary \
myspell-id"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
