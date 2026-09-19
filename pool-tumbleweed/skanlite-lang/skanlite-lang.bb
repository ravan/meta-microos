SUMMARY = "Translations for package skanlite"
DESCRIPTION = "Provides translations for the 'skanlite' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "skanlite-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "a60a79a91b6eb37f931082cf9067276cbb1b61d4c3f39f371890fe155b27c54c5933a049aa62e5d09bbe85eebc576fb256e3ba1098f4d52cb4e0d0ba9c3fa77c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skanlite-ar \
locale-skanlite-az \
locale-skanlite-be \
locale-skanlite-bg \
locale-skanlite-bs \
locale-skanlite-ca \
locale-skanlite-ca@valencia \
locale-skanlite-cs \
locale-skanlite-da \
locale-skanlite-de \
locale-skanlite-el \
locale-skanlite-en-GB \
locale-skanlite-eo \
locale-skanlite-es \
locale-skanlite-et \
locale-skanlite-eu \
locale-skanlite-fi \
locale-skanlite-fr \
locale-skanlite-ga \
locale-skanlite-gl \
locale-skanlite-he \
locale-skanlite-hi \
locale-skanlite-hr \
locale-skanlite-hu \
locale-skanlite-ia \
locale-skanlite-id \
locale-skanlite-is \
locale-skanlite-it \
locale-skanlite-ja \
locale-skanlite-ka \
locale-skanlite-km \
locale-skanlite-ko \
locale-skanlite-lt \
locale-skanlite-lv \
locale-skanlite-mai \
locale-skanlite-mr \
locale-skanlite-nb \
locale-skanlite-nds \
locale-skanlite-nl \
locale-skanlite-nn \
locale-skanlite-pa \
locale-skanlite-pl \
locale-skanlite-pt \
locale-skanlite-pt-BR \
locale-skanlite-ro \
locale-skanlite-ru \
locale-skanlite-sk \
locale-skanlite-sl \
locale-skanlite-sq \
locale-skanlite-sv \
locale-skanlite-tr \
locale-skanlite-ug \
locale-skanlite-uk \
locale-skanlite-wa \
locale-skanlite-zh-CN \
locale-skanlite-zh-TW \
skanlite-lang \
skanlite-lang-all"

RDEPENDS:${PN} += "skanlite"

inherit rpm
