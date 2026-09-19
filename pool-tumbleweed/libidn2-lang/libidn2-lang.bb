SUMMARY = "Translations for package libidn2"
DESCRIPTION = "Provides translations for the 'libidn2' package."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "2.3.8"

RPM_NAME = "libidn2-lang-2.3.8-1.5.noarch.rpm"
RPM_HASH = "4ada5bc6e1980dc66423745feffdbbc56457be6504c5cba1bf9ab39db06ca81dcd3f0c635e41b3793accc0cc434b918bbbb9619162be31991d5229e1879cd78a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libidn2-lang \
libidn2-lang-all \
locale-libidn2-cs \
locale-libidn2-da \
locale-libidn2-de \
locale-libidn2-eo \
locale-libidn2-es \
locale-libidn2-fi \
locale-libidn2-fr \
locale-libidn2-fur \
locale-libidn2-hr \
locale-libidn2-hu \
locale-libidn2-id \
locale-libidn2-it \
locale-libidn2-ja \
locale-libidn2-ka \
locale-libidn2-ko \
locale-libidn2-lv \
locale-libidn2-nl \
locale-libidn2-pl \
locale-libidn2-pt-BR \
locale-libidn2-ro \
locale-libidn2-ru \
locale-libidn2-sr \
locale-libidn2-sv \
locale-libidn2-uk \
locale-libidn2-vi \
locale-libidn2-zh-CN"

RDEPENDS:${PN} += "libidn2"

inherit rpm
