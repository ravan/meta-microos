SUMMARY = "Translations for package kinfocenter6"
DESCRIPTION = "Provides translations for the 'kinfocenter6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kinfocenter6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "a8638de4e18acf279742cf36f1a117edc768cb5a8acf8bdb5658b6d1383776730e49c3213f45524c719394cb088f5441499ae86fc1bdb2c6db0f95996dd5c8ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kinfocenter6-lang \
kinfocenter6-lang-all \
locale-kinfocenter6-af \
locale-kinfocenter6-ar \
locale-kinfocenter6-ast \
locale-kinfocenter6-az \
locale-kinfocenter6-be \
locale-kinfocenter6-bg \
locale-kinfocenter6-bn \
locale-kinfocenter6-bn-IN \
locale-kinfocenter6-br \
locale-kinfocenter6-bs \
locale-kinfocenter6-ca \
locale-kinfocenter6-ca@valencia \
locale-kinfocenter6-cs \
locale-kinfocenter6-cy \
locale-kinfocenter6-da \
locale-kinfocenter6-de \
locale-kinfocenter6-el \
locale-kinfocenter6-en-GB \
locale-kinfocenter6-eo \
locale-kinfocenter6-es \
locale-kinfocenter6-et \
locale-kinfocenter6-eu \
locale-kinfocenter6-fa \
locale-kinfocenter6-fi \
locale-kinfocenter6-fr \
locale-kinfocenter6-ga \
locale-kinfocenter6-gl \
locale-kinfocenter6-gu \
locale-kinfocenter6-he \
locale-kinfocenter6-hi \
locale-kinfocenter6-hr \
locale-kinfocenter6-hu \
locale-kinfocenter6-ia \
locale-kinfocenter6-id \
locale-kinfocenter6-is \
locale-kinfocenter6-it \
locale-kinfocenter6-ja \
locale-kinfocenter6-ka \
locale-kinfocenter6-kk \
locale-kinfocenter6-km \
locale-kinfocenter6-kn \
locale-kinfocenter6-ko \
locale-kinfocenter6-lt \
locale-kinfocenter6-lv \
locale-kinfocenter6-mai \
locale-kinfocenter6-mk \
locale-kinfocenter6-ml \
locale-kinfocenter6-mr \
locale-kinfocenter6-ms \
locale-kinfocenter6-nb \
locale-kinfocenter6-nds \
locale-kinfocenter6-ne \
locale-kinfocenter6-nl \
locale-kinfocenter6-nn \
locale-kinfocenter6-oc \
locale-kinfocenter6-or \
locale-kinfocenter6-pa \
locale-kinfocenter6-pl \
locale-kinfocenter6-pt \
locale-kinfocenter6-pt-BR \
locale-kinfocenter6-ro \
locale-kinfocenter6-ru \
locale-kinfocenter6-si \
locale-kinfocenter6-sk \
locale-kinfocenter6-sl \
locale-kinfocenter6-sq \
locale-kinfocenter6-sr \
locale-kinfocenter6-sr@ijekavian \
locale-kinfocenter6-sr@ijekavianlatin \
locale-kinfocenter6-sr@latin \
locale-kinfocenter6-sv \
locale-kinfocenter6-ta \
locale-kinfocenter6-te \
locale-kinfocenter6-th \
locale-kinfocenter6-tr \
locale-kinfocenter6-ug \
locale-kinfocenter6-uk \
locale-kinfocenter6-vi \
locale-kinfocenter6-wa \
locale-kinfocenter6-zh-CN \
locale-kinfocenter6-zh-TW"

RDEPENDS:${PN} += "kinfocenter6"

inherit rpm
