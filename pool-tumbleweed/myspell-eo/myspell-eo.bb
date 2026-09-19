SUMMARY = "MySpell eo Dictionary"
DESCRIPTION = "Spelling dictionary, thesaurus, and hyphenator for Esperanto."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-eo-20240321-1.7.noarch.rpm"
RPM_HASH = "0acc9ea84e331dc771ac54e686c2470c771b6e90bdec3073920d9487c2a18713dba1b4a859ad3ada2b41558026393ff46577263a36171c149706a78fab2fb09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-eo \
locale-seamonkey-spellchecker-eo \
myspell-dictionary \
myspell-eo"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
