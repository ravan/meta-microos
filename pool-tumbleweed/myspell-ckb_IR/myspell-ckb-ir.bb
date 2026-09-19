SUMMARY = "MySpell ckb_IR Dictionary"
DESCRIPTION = "Central Kurdish (Sorani) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ckb_IR-20240321-1.7.noarch.rpm"
RPM_HASH = "b3d42e6991fcfe673ccef10ed127209ffb9e370e2c79c3b34f5edefc196185675c6f833079b3ee14f6b17dcb30cd0895375d50305b03515664ba7d0ec034cab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ckb-IR \
locale-seamonkey-spellchecker-ckb-IR \
myspell-ckb-IR \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ckb \
myspell-dictionaries"

inherit rpm
