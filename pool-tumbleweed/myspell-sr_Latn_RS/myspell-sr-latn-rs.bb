SUMMARY = "MySpell sr_Latn_RS Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sr_Latn_RS-20240321-1.7.noarch.rpm"
RPM_HASH = "13aca1b1f36d59a27afef523674d9ab757296ff2b42b5b89904ec7c501dc56d78f5ecfa8fc237693d5f57a833c3551115cbe7621028cd1b21254d89516447f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sr-Latn-RS \
locale-seamonkey-spellchecker-sr-Latn-RS \
myspell-dictionary \
myspell-sr-Latn-RS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-sr"

inherit rpm
