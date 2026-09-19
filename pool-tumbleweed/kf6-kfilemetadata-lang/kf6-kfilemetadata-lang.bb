SUMMARY = "Translations for package kf6-kfilemetadata"
DESCRIPTION = "Provides translations for the 'kf6-kfilemetadata' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-kfilemetadata-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "4da5e6f91c98636a41164063f474e04ed544cd400c3f526bc73ac5d42ecab2d23ccd29f9866871d0c0600acd9f30308175c61c6fd3b583305097eb102ed3e171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kfilemetadata-lang \
kf6-kfilemetadata-lang-all \
locale-kf6-kfilemetadata-ar \
locale-kf6-kfilemetadata-ast \
locale-kf6-kfilemetadata-az \
locale-kf6-kfilemetadata-bg \
locale-kf6-kfilemetadata-bs \
locale-kf6-kfilemetadata-ca \
locale-kf6-kfilemetadata-ca@valencia \
locale-kf6-kfilemetadata-cs \
locale-kf6-kfilemetadata-da \
locale-kf6-kfilemetadata-de \
locale-kf6-kfilemetadata-el \
locale-kf6-kfilemetadata-en-GB \
locale-kf6-kfilemetadata-eo \
locale-kf6-kfilemetadata-es \
locale-kf6-kfilemetadata-et \
locale-kf6-kfilemetadata-eu \
locale-kf6-kfilemetadata-fi \
locale-kf6-kfilemetadata-fr \
locale-kf6-kfilemetadata-ga \
locale-kf6-kfilemetadata-gd \
locale-kf6-kfilemetadata-gl \
locale-kf6-kfilemetadata-he \
locale-kf6-kfilemetadata-hi \
locale-kf6-kfilemetadata-hu \
locale-kf6-kfilemetadata-ia \
locale-kf6-kfilemetadata-id \
locale-kf6-kfilemetadata-is \
locale-kf6-kfilemetadata-it \
locale-kf6-kfilemetadata-ja \
locale-kf6-kfilemetadata-ka \
locale-kf6-kfilemetadata-ko \
locale-kf6-kfilemetadata-lt \
locale-kf6-kfilemetadata-lv \
locale-kf6-kfilemetadata-ml \
locale-kf6-kfilemetadata-nb \
locale-kf6-kfilemetadata-nds \
locale-kf6-kfilemetadata-nl \
locale-kf6-kfilemetadata-nn \
locale-kf6-kfilemetadata-pa \
locale-kf6-kfilemetadata-pl \
locale-kf6-kfilemetadata-pt \
locale-kf6-kfilemetadata-pt-BR \
locale-kf6-kfilemetadata-ro \
locale-kf6-kfilemetadata-ru \
locale-kf6-kfilemetadata-sk \
locale-kf6-kfilemetadata-sl \
locale-kf6-kfilemetadata-sr \
locale-kf6-kfilemetadata-sr@ijekavian \
locale-kf6-kfilemetadata-sr@ijekavianlatin \
locale-kf6-kfilemetadata-sr@latin \
locale-kf6-kfilemetadata-sv \
locale-kf6-kfilemetadata-ta \
locale-kf6-kfilemetadata-tr \
locale-kf6-kfilemetadata-ug \
locale-kf6-kfilemetadata-uk \
locale-kf6-kfilemetadata-zh-CN \
locale-kf6-kfilemetadata-zh-TW"

RDEPENDS:${PN} += "kf6-kfilemetadata"

inherit rpm
