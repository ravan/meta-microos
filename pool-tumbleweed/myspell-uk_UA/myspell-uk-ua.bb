SUMMARY = "MySpell uk_UA Dictionary"
DESCRIPTION = "Ukrainian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-uk_UA-20240321-1.7.noarch.rpm"
RPM_HASH = "38815188cc985bc5c61fb0b5d78601762038f9f6d97f4a455a4fee99be3fd7aee54ca23c79989fae0175e5eb6cfa16d28ed1ef2505116a05e98925a386af8027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-uk-UA \
locale-seamonkey-spellchecker-uk-UA \
myspell-dictionary \
myspell-uk-UA \
myspell-ukrainian"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
