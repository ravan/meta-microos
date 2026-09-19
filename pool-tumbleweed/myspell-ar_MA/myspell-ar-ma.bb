SUMMARY = "MySpell ar_MA Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_MA-20240321-1.7.noarch.rpm"
RPM_HASH = "3b4301affb1aa422c565e364ae816d8e9f48f3144660b4ba92277cd0acd8acafb1fde176ac0dfbd1cd6cc63e84182ec26c7f96d90ce05ae2db9272e1e84f304a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-MA \
locale-seamonkey-spellchecker-ar-MA \
myspell-ar-MA \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
