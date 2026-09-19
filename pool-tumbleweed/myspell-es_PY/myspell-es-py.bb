SUMMARY = "MySpell es_PY Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-es_PY-20240321-1.7.noarch.rpm"
RPM_HASH = "053b076d14565204501dadef0ba364b760520f42d86cfcdac7200cf7a1987747bcaf2e6b2313a42f55a90180c6003ce57779285c4ed286f34ed031bfad959d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-PY \
locale-seamonkey-spellchecker-es-PY \
myspell-dictionary \
myspell-es-PY \
myspell-spanish-paraguayan"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
