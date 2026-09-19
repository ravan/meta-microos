SUMMARY = "MySpell bs_BA Dictionary"
DESCRIPTION = "Bosnian spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-bs_BA-20240321-1.7.noarch.rpm"
RPM_HASH = "5c75721ab9ed05bf796596f69cd02bbf549290a36fbaec9bc3673ba4776dedb93d1233d2dbceb4dd00e7d45c92f27434e6f2f4707ee93c4389a2964fdf387f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-bs-BA \
locale-seamonkey-spellchecker-bs-BA \
myspell-bs-BA \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
