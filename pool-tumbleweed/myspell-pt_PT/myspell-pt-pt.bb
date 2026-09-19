SUMMARY = "MySpell pt_PT Dictionary"
DESCRIPTION = "Portuguese, Portugal spelling and hyphenation dictionaries and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-pt_PT-20240321-1.7.noarch.rpm"
RPM_HASH = "c1b2dbca0c4750ae10a7a97182e285a50cc00c71d3d33e4f3009c1168577cf656eceba814eaf2e39997cdd0e82742a8083a134eac4ecad6b9ec165374af508b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-pt-PT \
locale-seamonkey-spellchecker-pt-PT \
myspell-dictionary \
myspell-portuguese \
myspell-pt-PT"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
