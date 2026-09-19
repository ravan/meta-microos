SUMMARY = "MySpell nl_NL Dictionary"
DESCRIPTION = "Dutch spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-nl_NL-20240321-1.7.noarch.rpm"
RPM_HASH = "a3111cdfdd6ce84dea959384285b96f09452a921a818495f40a207eed78d2aa2b66354fd2aafed3e170cdb4515e9ddbf9bbcde230ae47c2fa1a42486b2a6d00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-nl-NL \
locale-seamonkey-spellchecker-nl-NL \
myspell-dictionary \
myspell-dutch \
myspell-nl-NL"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
