SUMMARY = "MySpell sv_SE Dictionary"
DESCRIPTION = "Swedish Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-sv_SE-20240321-1.7.noarch.rpm"
RPM_HASH = "e2fd995df83d3d8ba8b477905333c8978be8fb2a61050fb304231b2002f03a2f8962280a5e2a799c33d3c71ada11433d862c034a8782078e4bb1541e99b75f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-sv \
locale-libreoffice-sv-SE \
locale-seamonkey-spellchecker-sv-SE \
myspell-dictionary \
myspell-sv-SE \
myspell-swedish"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
