SUMMARY = "MySpell ckb_IQ Dictionary"
DESCRIPTION = "Central Kurdish (Sorani) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20240321"

RPM_NAME = "myspell-ckb_IQ-20240321-1.7.noarch.rpm"
RPM_HASH = "46c364e8314f61cf8cc2ecff04811efaa49d262399cb63b18c49e37e651dc673399c3aff4775f138a4ce918bce594968634023b4508721a1205b5e31c6c2f394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ckb-IQ \
locale-seamonkey-spellchecker-ckb-IQ \
myspell-ckb-IQ \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ckb \
myspell-dictionaries"

inherit rpm
