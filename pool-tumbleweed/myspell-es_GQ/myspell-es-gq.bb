SUMMARY = "MySpell es_GQ Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_GQ-20240321-1.7.noarch.rpm"
RPM_HASH = "c265cf9850d72f20bd98ce20d499bbf244dd462db05e01419899fd816d05b9f045ae3529b25597ae488bb8216a2619dfb42836576889938c854e39c13766a1d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-GQ \
locale-seamonkey-spellchecker-es-GQ \
myspell-dictionary \
myspell-es-GQ"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
