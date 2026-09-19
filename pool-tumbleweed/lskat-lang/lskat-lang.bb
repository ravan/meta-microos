SUMMARY = "Translations for package lskat"
DESCRIPTION = "Provides translations for the 'lskat' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "lskat-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "84421e3c816da4c972ec50525208c5ceb754280fd7b45c8df970850bf092a98a0539d5fc63809971290ccd8576844a30e37e803581a4b1f07ae084a326c8f65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lskat-af \
locale-lskat-ar \
locale-lskat-ast \
locale-lskat-be \
locale-lskat-br \
locale-lskat-bs \
locale-lskat-ca \
locale-lskat-ca@valencia \
locale-lskat-cs \
locale-lskat-cy \
locale-lskat-da \
locale-lskat-de \
locale-lskat-el \
locale-lskat-en-GB \
locale-lskat-eo \
locale-lskat-es \
locale-lskat-et \
locale-lskat-eu \
locale-lskat-fa \
locale-lskat-fi \
locale-lskat-fr \
locale-lskat-ga \
locale-lskat-gl \
locale-lskat-he \
locale-lskat-hi \
locale-lskat-hr \
locale-lskat-hu \
locale-lskat-id \
locale-lskat-is \
locale-lskat-it \
locale-lskat-ja \
locale-lskat-ka \
locale-lskat-kk \
locale-lskat-km \
locale-lskat-ko \
locale-lskat-lt \
locale-lskat-lv \
locale-lskat-mai \
locale-lskat-mk \
locale-lskat-ml \
locale-lskat-mr \
locale-lskat-ms \
locale-lskat-nb \
locale-lskat-nds \
locale-lskat-ne \
locale-lskat-nl \
locale-lskat-nn \
locale-lskat-oc \
locale-lskat-pa \
locale-lskat-pl \
locale-lskat-pt \
locale-lskat-pt-BR \
locale-lskat-ro \
locale-lskat-ru \
locale-lskat-sk \
locale-lskat-sl \
locale-lskat-sq \
locale-lskat-sr \
locale-lskat-sr@ijekavian \
locale-lskat-sr@ijekavianlatin \
locale-lskat-sr@latin \
locale-lskat-sv \
locale-lskat-ta \
locale-lskat-tr \
locale-lskat-ug \
locale-lskat-uk \
locale-lskat-zh-CN \
locale-lskat-zh-TW \
lskat-lang \
lskat-lang-all"

RDEPENDS:${PN} += "lskat"

inherit rpm
