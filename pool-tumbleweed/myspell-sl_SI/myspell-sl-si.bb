SUMMARY = "MySpell sl_SI Dictionary"
DESCRIPTION = "Slovenian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sl_SI-20240321-1.7.noarch.rpm"
RPM_HASH = "df2173b6759d4082cf7e94306eed3e72d7f1baeee96c2aedc65dad9431fdbce769a93561214f6c6cca4c86431200c1ee7c39ffeccf5c877e9a8daa3037c6ce9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-sl \
locale-libreoffice-sl-SI \
locale-seamonkey-spellchecker-sl-SI \
myspell-dictionary \
myspell-sl-SI \
myspell-slovene"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
