SUMMARY = "Translations for package kf6-kdoctools"
DESCRIPTION = "Provides translations for the 'kf6-kdoctools' package."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "6.30.0"

RPM_NAME = "kf6-kdoctools-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "1203fabee88c2a138947a2d5fd4cbfccc85d99d29d69746316e4dc72171a1fd27fb209dd7c730132a8531276ed8a28ea48f80c8325f4bcce60d815aff51bf352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kdoctools-lang \
kf6-kdoctools-lang-all \
locale-kf6-kdoctools-af \
locale-kf6-kdoctools-ar \
locale-kf6-kdoctools-ast \
locale-kf6-kdoctools-az \
locale-kf6-kdoctools-be \
locale-kf6-kdoctools-bg \
locale-kf6-kdoctools-bn \
locale-kf6-kdoctools-br \
locale-kf6-kdoctools-bs \
locale-kf6-kdoctools-ca \
locale-kf6-kdoctools-ca@valencia \
locale-kf6-kdoctools-cs \
locale-kf6-kdoctools-cy \
locale-kf6-kdoctools-da \
locale-kf6-kdoctools-de \
locale-kf6-kdoctools-el \
locale-kf6-kdoctools-en-GB \
locale-kf6-kdoctools-eo \
locale-kf6-kdoctools-es \
locale-kf6-kdoctools-et \
locale-kf6-kdoctools-eu \
locale-kf6-kdoctools-fa \
locale-kf6-kdoctools-fi \
locale-kf6-kdoctools-fr \
locale-kf6-kdoctools-ga \
locale-kf6-kdoctools-gd \
locale-kf6-kdoctools-gl \
locale-kf6-kdoctools-gu \
locale-kf6-kdoctools-he \
locale-kf6-kdoctools-hi \
locale-kf6-kdoctools-hr \
locale-kf6-kdoctools-hu \
locale-kf6-kdoctools-ia \
locale-kf6-kdoctools-id \
locale-kf6-kdoctools-is \
locale-kf6-kdoctools-it \
locale-kf6-kdoctools-ja \
locale-kf6-kdoctools-ka \
locale-kf6-kdoctools-kk \
locale-kf6-kdoctools-km \
locale-kf6-kdoctools-kn \
locale-kf6-kdoctools-ko \
locale-kf6-kdoctools-lt \
locale-kf6-kdoctools-lv \
locale-kf6-kdoctools-mai \
locale-kf6-kdoctools-mk \
locale-kf6-kdoctools-ml \
locale-kf6-kdoctools-mr \
locale-kf6-kdoctools-ms \
locale-kf6-kdoctools-nb \
locale-kf6-kdoctools-nds \
locale-kf6-kdoctools-ne \
locale-kf6-kdoctools-nl \
locale-kf6-kdoctools-nn \
locale-kf6-kdoctools-oc \
locale-kf6-kdoctools-pa \
locale-kf6-kdoctools-pl \
locale-kf6-kdoctools-pt \
locale-kf6-kdoctools-pt-BR \
locale-kf6-kdoctools-ro \
locale-kf6-kdoctools-ru \
locale-kf6-kdoctools-sk \
locale-kf6-kdoctools-sl \
locale-kf6-kdoctools-sq \
locale-kf6-kdoctools-sr \
locale-kf6-kdoctools-sr@ijekavian \
locale-kf6-kdoctools-sr@ijekavianlatin \
locale-kf6-kdoctools-sr@latin \
locale-kf6-kdoctools-sv \
locale-kf6-kdoctools-ta \
locale-kf6-kdoctools-th \
locale-kf6-kdoctools-tr \
locale-kf6-kdoctools-ug \
locale-kf6-kdoctools-uk \
locale-kf6-kdoctools-vi \
locale-kf6-kdoctools-zh-CN \
locale-kf6-kdoctools-zh-TW"

RDEPENDS:${PN} += "kf6-kdoctools"

inherit rpm
