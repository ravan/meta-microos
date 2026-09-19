SUMMARY = "Translations for package kspaceduel"
DESCRIPTION = "Provides translations for the 'kspaceduel' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kspaceduel-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "cca513a3026c4a18424e738db68d2a4bd4328906750b38b7110af3ac9df02c91ff80e7b95ee0b2a37ac61b10e6b8b56d128411aa3a0117cbab0c716a67768585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kspaceduel-lang \
kspaceduel-lang-all \
locale-kspaceduel-af \
locale-kspaceduel-ar \
locale-kspaceduel-ast \
locale-kspaceduel-be \
locale-kspaceduel-bg \
locale-kspaceduel-br \
locale-kspaceduel-bs \
locale-kspaceduel-ca \
locale-kspaceduel-ca@valencia \
locale-kspaceduel-cs \
locale-kspaceduel-cy \
locale-kspaceduel-da \
locale-kspaceduel-de \
locale-kspaceduel-el \
locale-kspaceduel-en-GB \
locale-kspaceduel-eo \
locale-kspaceduel-es \
locale-kspaceduel-et \
locale-kspaceduel-eu \
locale-kspaceduel-fa \
locale-kspaceduel-fi \
locale-kspaceduel-fr \
locale-kspaceduel-ga \
locale-kspaceduel-gl \
locale-kspaceduel-he \
locale-kspaceduel-hi \
locale-kspaceduel-hr \
locale-kspaceduel-hu \
locale-kspaceduel-ia \
locale-kspaceduel-is \
locale-kspaceduel-it \
locale-kspaceduel-ja \
locale-kspaceduel-ka \
locale-kspaceduel-kk \
locale-kspaceduel-km \
locale-kspaceduel-ko \
locale-kspaceduel-lt \
locale-kspaceduel-lv \
locale-kspaceduel-mai \
locale-kspaceduel-mk \
locale-kspaceduel-ml \
locale-kspaceduel-mr \
locale-kspaceduel-nb \
locale-kspaceduel-nds \
locale-kspaceduel-ne \
locale-kspaceduel-nl \
locale-kspaceduel-nn \
locale-kspaceduel-oc \
locale-kspaceduel-pa \
locale-kspaceduel-pl \
locale-kspaceduel-pt \
locale-kspaceduel-pt-BR \
locale-kspaceduel-ro \
locale-kspaceduel-ru \
locale-kspaceduel-sk \
locale-kspaceduel-sl \
locale-kspaceduel-sq \
locale-kspaceduel-sr \
locale-kspaceduel-sr@ijekavian \
locale-kspaceduel-sr@ijekavianlatin \
locale-kspaceduel-sr@latin \
locale-kspaceduel-sv \
locale-kspaceduel-ta \
locale-kspaceduel-tr \
locale-kspaceduel-ug \
locale-kspaceduel-uk \
locale-kspaceduel-zh-CN \
locale-kspaceduel-zh-TW"

RDEPENDS:${PN} += "kspaceduel"

inherit rpm
