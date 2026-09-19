SUMMARY = "Translations for package lxappearance"
DESCRIPTION = "Provides translations for the 'lxappearance' package."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "lxappearance-lang-0.6.3-1.30.noarch.rpm"
RPM_HASH = "864039887c195b0bc3dfd6a29ef10932d631b8a2812a89855fa802b449bbfad8c13ad57b0d72bf4db37179e01e3dc2b617dd8f2f563eca6cb478088ead70f276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lxappearance-ar \
locale-lxappearance-be \
locale-lxappearance-bg \
locale-lxappearance-ca \
locale-lxappearance-cs \
locale-lxappearance-da \
locale-lxappearance-de \
locale-lxappearance-el \
locale-lxappearance-en-GB \
locale-lxappearance-es \
locale-lxappearance-et \
locale-lxappearance-eu \
locale-lxappearance-fa \
locale-lxappearance-fi \
locale-lxappearance-fr \
locale-lxappearance-gl \
locale-lxappearance-he \
locale-lxappearance-hr \
locale-lxappearance-hu \
locale-lxappearance-id \
locale-lxappearance-is \
locale-lxappearance-it \
locale-lxappearance-ja \
locale-lxappearance-kk \
locale-lxappearance-ko \
locale-lxappearance-lt \
locale-lxappearance-nl \
locale-lxappearance-pa \
locale-lxappearance-pl \
locale-lxappearance-pt \
locale-lxappearance-pt-BR \
locale-lxappearance-ro \
locale-lxappearance-ru \
locale-lxappearance-sl \
locale-lxappearance-sr \
locale-lxappearance-sr@latin \
locale-lxappearance-sv \
locale-lxappearance-te \
locale-lxappearance-tr \
locale-lxappearance-ug \
locale-lxappearance-uk \
locale-lxappearance-vi \
locale-lxappearance-zh-CN \
locale-lxappearance-zh-TW \
lxappearance-lang \
lxappearance-lang-all"

RDEPENDS:${PN} += "lxappearance"

inherit rpm
