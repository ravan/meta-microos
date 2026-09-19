SUMMARY = "MySpell kmr_Latn Dictionary"
DESCRIPTION = "Kurdish (Turkey) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-kmr_Latn-20240321-1.7.noarch.rpm"
RPM_HASH = "e1accf4849c3c32f379287f503b08016fee491c1a6b8fff6e1e189a2db3c0c390f480c66b8c4dd302c8cea3a78259830cf91a60ed475aad9cccf7d3cca98e0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-kmr-Latn \
locale-seamonkey-spellchecker-kmr-Latn \
myspell-dictionary \
myspell-kmr-Latn"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
