SUMMARY = "MySpell de_CH Dictionary"
DESCRIPTION = "German (Austria, Germany, Switzerland) spelling dictionaries, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-de_CH-20240321-1.7.noarch.rpm"
RPM_HASH = "cda8d59b6046722ef741bdba2a33ddc35cc13df4d2e5d59c3391705e7dc3b0ca030c7e305dd25943c69230a13416dc17f2cd98b5751ce0815a354586f05a1c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-de-CH \
locale-seamonkey-spellchecker-de-CH \
myspell-de-CH \
myspell-dictionary \
myspell-nswiss"

RDEPENDS:${PN} += "myspell-de \
myspell-dictionaries"

inherit rpm
