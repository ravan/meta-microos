SUMMARY = "MySpell bo_IN Dictionary"
DESCRIPTION = "Classical Tibetan syllable spellchecker for Hunspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-bo_IN-20240321-1.7.noarch.rpm"
RPM_HASH = "60587fee35c253fc3707275f40b9d96d157115c6aa513e5ac11bf109fcf0035ddff07cd250d08a3f9974323b77da310c2ca11f82b35037845a037a80e474790b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-bo-IN \
locale-seamonkey-spellchecker-bo-IN \
myspell-bo-IN \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-bo \
myspell-dictionaries"

inherit rpm
