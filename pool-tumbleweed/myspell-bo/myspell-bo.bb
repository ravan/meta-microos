SUMMARY = "MySpell bo Dictionary"
DESCRIPTION = "Classical Tibetan syllable spellchecker for Hunspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-bo-20240321-1.7.noarch.rpm"
RPM_HASH = "e9ac6ad4e895718f0c0a8b62a859b6b335a295af01480af3d601b2a47682239363b5ec721e923aaa4eb53b6c3556af4fe3265e058ad20f7f884fdb00ad561385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-bo \
locale-seamonkey-spellchecker-bo \
myspell-bo \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
