SUMMARY = "Translations for package kf6-kcoreaddons"
DESCRIPTION = "Provides translations for the 'kf6-kcoreaddons' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcoreaddons-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "36d51f320a38d7a790f3604df303281529b1f1ff606e11fd6bd9fec1a857a0fc647c436f1fd17032842d92e6f648e91b8811c2d2c8d90b8d2c2948b20d0d87e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kcoreaddons-lang \
kf6-kcoreaddons-lang-all \
locale-kf6-kcoreaddons-af \
locale-kf6-kcoreaddons-ar \
locale-kf6-kcoreaddons-as \
locale-kf6-kcoreaddons-ast \
locale-kf6-kcoreaddons-az \
locale-kf6-kcoreaddons-be \
locale-kf6-kcoreaddons-be@latin \
locale-kf6-kcoreaddons-bg \
locale-kf6-kcoreaddons-bn \
locale-kf6-kcoreaddons-bn-IN \
locale-kf6-kcoreaddons-br \
locale-kf6-kcoreaddons-bs \
locale-kf6-kcoreaddons-ca \
locale-kf6-kcoreaddons-ca@valencia \
locale-kf6-kcoreaddons-cs \
locale-kf6-kcoreaddons-cy \
locale-kf6-kcoreaddons-da \
locale-kf6-kcoreaddons-de \
locale-kf6-kcoreaddons-el \
locale-kf6-kcoreaddons-en \
locale-kf6-kcoreaddons-en-GB \
locale-kf6-kcoreaddons-eo \
locale-kf6-kcoreaddons-es \
locale-kf6-kcoreaddons-et \
locale-kf6-kcoreaddons-eu \
locale-kf6-kcoreaddons-fa \
locale-kf6-kcoreaddons-fi \
locale-kf6-kcoreaddons-fr \
locale-kf6-kcoreaddons-ga \
locale-kf6-kcoreaddons-gd \
locale-kf6-kcoreaddons-gl \
locale-kf6-kcoreaddons-gu \
locale-kf6-kcoreaddons-he \
locale-kf6-kcoreaddons-hi \
locale-kf6-kcoreaddons-hr \
locale-kf6-kcoreaddons-hu \
locale-kf6-kcoreaddons-ia \
locale-kf6-kcoreaddons-id \
locale-kf6-kcoreaddons-is \
locale-kf6-kcoreaddons-it \
locale-kf6-kcoreaddons-ja \
locale-kf6-kcoreaddons-ka \
locale-kf6-kcoreaddons-kk \
locale-kf6-kcoreaddons-km \
locale-kf6-kcoreaddons-kn \
locale-kf6-kcoreaddons-ko \
locale-kf6-kcoreaddons-lt \
locale-kf6-kcoreaddons-lv \
locale-kf6-kcoreaddons-mai \
locale-kf6-kcoreaddons-mk \
locale-kf6-kcoreaddons-ml \
locale-kf6-kcoreaddons-mr \
locale-kf6-kcoreaddons-ms \
locale-kf6-kcoreaddons-nb \
locale-kf6-kcoreaddons-nds \
locale-kf6-kcoreaddons-ne \
locale-kf6-kcoreaddons-nl \
locale-kf6-kcoreaddons-nn \
locale-kf6-kcoreaddons-oc \
locale-kf6-kcoreaddons-or \
locale-kf6-kcoreaddons-pa \
locale-kf6-kcoreaddons-pl \
locale-kf6-kcoreaddons-pt \
locale-kf6-kcoreaddons-pt-BR \
locale-kf6-kcoreaddons-ro \
locale-kf6-kcoreaddons-ru \
locale-kf6-kcoreaddons-si \
locale-kf6-kcoreaddons-sk \
locale-kf6-kcoreaddons-sl \
locale-kf6-kcoreaddons-sq \
locale-kf6-kcoreaddons-sr \
locale-kf6-kcoreaddons-sr@ijekavian \
locale-kf6-kcoreaddons-sr@ijekavianlatin \
locale-kf6-kcoreaddons-sr@latin \
locale-kf6-kcoreaddons-sv \
locale-kf6-kcoreaddons-ta \
locale-kf6-kcoreaddons-te \
locale-kf6-kcoreaddons-th \
locale-kf6-kcoreaddons-tr \
locale-kf6-kcoreaddons-ug \
locale-kf6-kcoreaddons-uk \
locale-kf6-kcoreaddons-vi \
locale-kf6-kcoreaddons-wa \
locale-kf6-kcoreaddons-zh-CN \
locale-kf6-kcoreaddons-zh-HK \
locale-kf6-kcoreaddons-zh-TW"

RDEPENDS:${PN} += "kf6-kcoreaddons"

inherit rpm
