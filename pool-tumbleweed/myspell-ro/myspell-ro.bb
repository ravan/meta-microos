SUMMARY = "MySpell ro Dictionary"
DESCRIPTION = "rospell Romanian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ro-20240321-1.7.noarch.rpm"
RPM_HASH = "624ca92423a036fd19871b0b1e421f4b631d9b4d28026c2037df94f343b5cac7fce4135ab76514a5a8f58eb2268b7843375915a88dd0f29ff37b0c5cdfc9f414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-ro \
locale-libreoffice-ro \
locale-seamonkey-spellchecker-ro \
myspell-dictionary \
myspell-ro \
myspell-romanian"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
