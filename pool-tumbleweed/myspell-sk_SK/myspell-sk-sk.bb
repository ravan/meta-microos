SUMMARY = "MySpell sk_SK Dictionary"
DESCRIPTION = "Slovak spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sk_SK-20240321-1.7.noarch.rpm"
RPM_HASH = "2c167d0f3759c1089cfb70b32727a2b452459bbd957c14de40f416e1d261ad854ef0adad8b6dea349a0d0e8010f6682ce4c1382495e5bd4f4b55e9223d80b655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-sk \
locale-libreoffice-sk-SK \
locale-seamonkey-spellchecker-sk-SK \
myspell-dictionary \
myspell-sk-SK \
myspell-slovak"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
