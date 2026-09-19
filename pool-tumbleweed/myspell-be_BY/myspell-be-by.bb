SUMMARY = "MySpell be_BY Dictionary"
DESCRIPTION = "Belarusian spelling dictionary and hyphenation: official orthography 2008."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-be_BY-20240321-1.7.noarch.rpm"
RPM_HASH = "398de18709c10c9f84f12b4a3c980306fb78ef576cd2addceaf9c9c892014014c06e4940c8d5fdc78bb5e3d910da71e16d6ac1062138dda70b54fd0fb14c60e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-be-BY \
locale-seamonkey-spellchecker-be-BY \
myspell-be-BY \
myspell-belarusian \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
