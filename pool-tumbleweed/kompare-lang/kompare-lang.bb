SUMMARY = "Translations for package kompare"
DESCRIPTION = "Provides translations for the 'kompare' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kompare-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "add81d0b129474448ffbe88631ac3e760c53beb6ca5a12b223f1e7f15205d0cbd923e3e41c480b33a281a6d91aea5087233c50a493e0c8287a8fa1593ad0fa27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompare-lang \
kompare-lang-all \
locale-kompare-af \
locale-kompare-ar \
locale-kompare-be \
locale-kompare-bg \
locale-kompare-br \
locale-kompare-bs \
locale-kompare-ca \
locale-kompare-ca@valencia \
locale-kompare-cs \
locale-kompare-cy \
locale-kompare-da \
locale-kompare-de \
locale-kompare-el \
locale-kompare-en-GB \
locale-kompare-eo \
locale-kompare-es \
locale-kompare-et \
locale-kompare-eu \
locale-kompare-fa \
locale-kompare-fi \
locale-kompare-fr \
locale-kompare-ga \
locale-kompare-gl \
locale-kompare-he \
locale-kompare-hi \
locale-kompare-hr \
locale-kompare-hu \
locale-kompare-ia \
locale-kompare-is \
locale-kompare-it \
locale-kompare-ja \
locale-kompare-ka \
locale-kompare-kk \
locale-kompare-km \
locale-kompare-ko \
locale-kompare-lt \
locale-kompare-lv \
locale-kompare-mai \
locale-kompare-mk \
locale-kompare-mr \
locale-kompare-ms \
locale-kompare-nb \
locale-kompare-nds \
locale-kompare-ne \
locale-kompare-nl \
locale-kompare-nn \
locale-kompare-oc \
locale-kompare-pa \
locale-kompare-pl \
locale-kompare-pt \
locale-kompare-pt-BR \
locale-kompare-ro \
locale-kompare-ru \
locale-kompare-sk \
locale-kompare-sl \
locale-kompare-sq \
locale-kompare-sr \
locale-kompare-sr@ijekavian \
locale-kompare-sr@ijekavianlatin \
locale-kompare-sr@latin \
locale-kompare-sv \
locale-kompare-ta \
locale-kompare-tr \
locale-kompare-ug \
locale-kompare-uk \
locale-kompare-zh-CN \
locale-kompare-zh-TW"

RDEPENDS:${PN} += "kompare"

inherit rpm
