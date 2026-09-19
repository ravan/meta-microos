SUMMARY = "Translations for package tellico"
DESCRIPTION = "Provides translations for the 'tellico' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.2"

RPM_NAME = "tellico-lang-4.2.2-1.1.noarch.rpm"
RPM_HASH = "676f0b0d7d1022f94e0ad5bdb050430f2a8e70d19f9c1ed74eb820a8792734b449cedde2f8a56544daf5786a90c05760a68df3eac98a0504e33be62728c10737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tellico-ar \
locale-tellico-bs \
locale-tellico-ca \
locale-tellico-ca@valencia \
locale-tellico-cs \
locale-tellico-da \
locale-tellico-de \
locale-tellico-el \
locale-tellico-en-GB \
locale-tellico-eo \
locale-tellico-es \
locale-tellico-et \
locale-tellico-eu \
locale-tellico-fi \
locale-tellico-fr \
locale-tellico-ga \
locale-tellico-gl \
locale-tellico-he \
locale-tellico-hu \
locale-tellico-ia \
locale-tellico-it \
locale-tellico-ja \
locale-tellico-ka \
locale-tellico-kk \
locale-tellico-ko \
locale-tellico-lt \
locale-tellico-mr \
locale-tellico-ms \
locale-tellico-nb \
locale-tellico-nds \
locale-tellico-nl \
locale-tellico-nn \
locale-tellico-pl \
locale-tellico-pt \
locale-tellico-pt-BR \
locale-tellico-ro \
locale-tellico-ru \
locale-tellico-sk \
locale-tellico-sl \
locale-tellico-sv \
locale-tellico-tr \
locale-tellico-ug \
locale-tellico-uk \
locale-tellico-zh-CN \
locale-tellico-zh-TW \
tellico-lang \
tellico-lang-all"

RDEPENDS:${PN} += "tellico"

inherit rpm
