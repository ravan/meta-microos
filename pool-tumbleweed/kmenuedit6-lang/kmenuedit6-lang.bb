SUMMARY = "Translations for package kmenuedit6"
DESCRIPTION = "Provides translations for the 'kmenuedit6' package."
LICENSE = "GPL-2.0-only"

PV = "6.7.5"

RPM_NAME = "kmenuedit6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "02f71561b7f617cd09348b4e836f376bab0c3707a8f5210be12c99e4e34766f0aee2d282b6ff00d4630a4945d6733adf6af3c314828fcd93959315f55675da92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmenuedit6-lang \
kmenuedit6-lang-all \
locale-kmenuedit6-af \
locale-kmenuedit6-ar \
locale-kmenuedit6-ast \
locale-kmenuedit6-az \
locale-kmenuedit6-be \
locale-kmenuedit6-bg \
locale-kmenuedit6-bn \
locale-kmenuedit6-bn-IN \
locale-kmenuedit6-br \
locale-kmenuedit6-bs \
locale-kmenuedit6-ca \
locale-kmenuedit6-ca@valencia \
locale-kmenuedit6-cs \
locale-kmenuedit6-cy \
locale-kmenuedit6-da \
locale-kmenuedit6-de \
locale-kmenuedit6-el \
locale-kmenuedit6-en-GB \
locale-kmenuedit6-eo \
locale-kmenuedit6-es \
locale-kmenuedit6-et \
locale-kmenuedit6-eu \
locale-kmenuedit6-fa \
locale-kmenuedit6-fi \
locale-kmenuedit6-fr \
locale-kmenuedit6-ga \
locale-kmenuedit6-gl \
locale-kmenuedit6-gu \
locale-kmenuedit6-he \
locale-kmenuedit6-hi \
locale-kmenuedit6-hr \
locale-kmenuedit6-hu \
locale-kmenuedit6-ia \
locale-kmenuedit6-id \
locale-kmenuedit6-is \
locale-kmenuedit6-it \
locale-kmenuedit6-ja \
locale-kmenuedit6-ka \
locale-kmenuedit6-kk \
locale-kmenuedit6-km \
locale-kmenuedit6-kn \
locale-kmenuedit6-ko \
locale-kmenuedit6-lt \
locale-kmenuedit6-lv \
locale-kmenuedit6-mai \
locale-kmenuedit6-mk \
locale-kmenuedit6-ml \
locale-kmenuedit6-mr \
locale-kmenuedit6-ms \
locale-kmenuedit6-nb \
locale-kmenuedit6-nds \
locale-kmenuedit6-ne \
locale-kmenuedit6-nl \
locale-kmenuedit6-nn \
locale-kmenuedit6-oc \
locale-kmenuedit6-or \
locale-kmenuedit6-pa \
locale-kmenuedit6-pl \
locale-kmenuedit6-pt \
locale-kmenuedit6-pt-BR \
locale-kmenuedit6-ro \
locale-kmenuedit6-ru \
locale-kmenuedit6-si \
locale-kmenuedit6-sk \
locale-kmenuedit6-sl \
locale-kmenuedit6-sq \
locale-kmenuedit6-sr \
locale-kmenuedit6-sr@ijekavian \
locale-kmenuedit6-sr@ijekavianlatin \
locale-kmenuedit6-sr@latin \
locale-kmenuedit6-sv \
locale-kmenuedit6-ta \
locale-kmenuedit6-te \
locale-kmenuedit6-th \
locale-kmenuedit6-tr \
locale-kmenuedit6-ug \
locale-kmenuedit6-uk \
locale-kmenuedit6-vi \
locale-kmenuedit6-wa \
locale-kmenuedit6-zh-CN \
locale-kmenuedit6-zh-TW"

RDEPENDS:${PN} += "kmenuedit6"

inherit rpm
