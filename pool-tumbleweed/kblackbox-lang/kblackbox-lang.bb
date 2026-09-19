SUMMARY = "Translations for package kblackbox"
DESCRIPTION = "Provides translations for the 'kblackbox' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kblackbox-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "f2105eda75db0ae5573e92ae633d16e6b3fc6330201c4d2a9eae8256de5613a5bad142cb7adc795bbaa6e9a3e8474df144454fe2a1aaa426ef194d91b9eb761a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kblackbox-lang \
kblackbox-lang-all \
locale-kblackbox-af \
locale-kblackbox-ar \
locale-kblackbox-ast \
locale-kblackbox-be \
locale-kblackbox-bg \
locale-kblackbox-bn \
locale-kblackbox-br \
locale-kblackbox-bs \
locale-kblackbox-ca \
locale-kblackbox-ca@valencia \
locale-kblackbox-cs \
locale-kblackbox-cy \
locale-kblackbox-da \
locale-kblackbox-de \
locale-kblackbox-el \
locale-kblackbox-en-GB \
locale-kblackbox-eo \
locale-kblackbox-es \
locale-kblackbox-et \
locale-kblackbox-eu \
locale-kblackbox-fa \
locale-kblackbox-fi \
locale-kblackbox-fr \
locale-kblackbox-ga \
locale-kblackbox-gl \
locale-kblackbox-he \
locale-kblackbox-hi \
locale-kblackbox-hr \
locale-kblackbox-hu \
locale-kblackbox-ia \
locale-kblackbox-id \
locale-kblackbox-is \
locale-kblackbox-it \
locale-kblackbox-ja \
locale-kblackbox-ka \
locale-kblackbox-kk \
locale-kblackbox-km \
locale-kblackbox-ko \
locale-kblackbox-lt \
locale-kblackbox-lv \
locale-kblackbox-mai \
locale-kblackbox-mk \
locale-kblackbox-ml \
locale-kblackbox-mr \
locale-kblackbox-ms \
locale-kblackbox-nb \
locale-kblackbox-nds \
locale-kblackbox-ne \
locale-kblackbox-nl \
locale-kblackbox-nn \
locale-kblackbox-oc \
locale-kblackbox-pa \
locale-kblackbox-pl \
locale-kblackbox-pt \
locale-kblackbox-pt-BR \
locale-kblackbox-ro \
locale-kblackbox-ru \
locale-kblackbox-sk \
locale-kblackbox-sl \
locale-kblackbox-sq \
locale-kblackbox-sr \
locale-kblackbox-sr@ijekavian \
locale-kblackbox-sr@ijekavianlatin \
locale-kblackbox-sr@latin \
locale-kblackbox-sv \
locale-kblackbox-ta \
locale-kblackbox-te \
locale-kblackbox-th \
locale-kblackbox-tr \
locale-kblackbox-ug \
locale-kblackbox-uk \
locale-kblackbox-vi \
locale-kblackbox-zh-CN \
locale-kblackbox-zh-TW"

RDEPENDS:${PN} += "kblackbox"

inherit rpm
