SUMMARY = "MySpell bo_CN Dictionary"
DESCRIPTION = "Classical Tibetan syllable spellchecker for Hunspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-bo_CN-20240321-1.7.noarch.rpm"
RPM_HASH = "fbbd33ee6facee158a0be27b9385886d96a6e06d13966f35ed24aa42ed5f28f37f866f05979e05bab8ec0cf7ffeee5c9343f37402a3e0bcc0af8da5a4f3f1e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-bo-CN \
locale-seamonkey-spellchecker-bo-CN \
myspell-bo-CN \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-bo \
myspell-dictionaries"

inherit rpm
