SUMMARY = "MySpell ar_YE Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ar_YE-20240321-1.7.noarch.rpm"
RPM_HASH = "428da6cb7b06fdf525a104261098fbbef3aad25ed233abb5fbf1e467699e39d49ae66da6319f62c39cda3983f5fb84bac135d4ce588e7002feb371a240cc541f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-YE \
locale-seamonkey-spellchecker-ar-YE \
myspell-ar-YE \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
