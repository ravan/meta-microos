SUMMARY = "Translations for package newsflash"
DESCRIPTION = "Provides translations for the 'newsflash' package."
LICENSE = "GPL-3.0-only"

PV = "5.2.5"

RPM_NAME = "newsflash-lang-5.2.5-1.2.noarch.rpm"
RPM_HASH = "6ec00247624a2ec5a5081edeed69aabbe901ca585edbcd33cd65b1fc7f26257517be93a474e005b75d0bb8e2a21522339d1795102e4c228d892df0a4d16827c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-newsflash-ar \
locale-newsflash-be \
locale-newsflash-bg \
locale-newsflash-bn \
locale-newsflash-ca \
locale-newsflash-cs \
locale-newsflash-de-DE \
locale-newsflash-el \
locale-newsflash-es \
locale-newsflash-et \
locale-newsflash-eu \
locale-newsflash-fa \
locale-newsflash-fi \
locale-newsflash-fr \
locale-newsflash-gl \
locale-newsflash-he \
locale-newsflash-hi \
locale-newsflash-hr \
locale-newsflash-hu \
locale-newsflash-ia \
locale-newsflash-it \
locale-newsflash-ja \
locale-newsflash-kk \
locale-newsflash-ko \
locale-newsflash-nb-NO \
locale-newsflash-nl \
locale-newsflash-pa \
locale-newsflash-pl \
locale-newsflash-pt \
locale-newsflash-pt-BR \
locale-newsflash-ru \
locale-newsflash-sv \
locale-newsflash-ta \
locale-newsflash-tr \
locale-newsflash-uk \
locale-newsflash-zh-CN \
locale-newsflash-zh-Hant \
newsflash-lang \
newsflash-lang-all"

RDEPENDS:${PN} += "newsflash"

inherit rpm
