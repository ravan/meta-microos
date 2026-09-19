SUMMARY = "MySpell ar_JO Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_JO-20240321-1.7.noarch.rpm"
RPM_HASH = "4722312e36c0fb30a75943f29991e2e62fe99d4ef30af9a07740f8aa815311749a00ee80e24d496c2338fdf410dfdc84d123f145ab99b1c9be87d0828dea4ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-JO \
locale-seamonkey-spellchecker-ar-JO \
myspell-ar-JO \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
