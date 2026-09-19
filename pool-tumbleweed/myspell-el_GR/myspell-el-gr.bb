SUMMARY = "MySpell el_GR Dictionary"
DESCRIPTION = "Greek spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-el_GR-20240321-1.7.noarch.rpm"
RPM_HASH = "364ac65f748f39e75eabc50eb45c05e7b0604186527f0ba0e66890f482b189825c5c58560521b54f4d37c5161ed42be840d28be3cd3dfec20135ffc71858b21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-el \
locale-libreoffice-el-GR \
locale-seamonkey-spellchecker-el-GR \
myspell-dictionary \
myspell-el-GR \
myspell-greek"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
