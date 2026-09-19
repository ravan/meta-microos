SUMMARY = "Translations for package kf6-kpeople"
DESCRIPTION = "Provides translations for the 'kf6-kpeople' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpeople-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "b28ce2f416c1dff02db3979151afaccedc49ef0b9d730dcf1eab3d2efd5180598088046ca3f454242ab75a209ba56386f52cab24f0539b51b0d0bece159302d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kpeople-lang \
kf6-kpeople-lang-all \
locale-kf6-kpeople-ar \
locale-kf6-kpeople-ast \
locale-kf6-kpeople-az \
locale-kf6-kpeople-bg \
locale-kf6-kpeople-bs \
locale-kf6-kpeople-ca \
locale-kf6-kpeople-ca@valencia \
locale-kf6-kpeople-cs \
locale-kf6-kpeople-da \
locale-kf6-kpeople-de \
locale-kf6-kpeople-el \
locale-kf6-kpeople-en-GB \
locale-kf6-kpeople-eo \
locale-kf6-kpeople-es \
locale-kf6-kpeople-et \
locale-kf6-kpeople-eu \
locale-kf6-kpeople-fi \
locale-kf6-kpeople-fr \
locale-kf6-kpeople-ga \
locale-kf6-kpeople-gd \
locale-kf6-kpeople-gl \
locale-kf6-kpeople-he \
locale-kf6-kpeople-hi \
locale-kf6-kpeople-hu \
locale-kf6-kpeople-ia \
locale-kf6-kpeople-id \
locale-kf6-kpeople-is \
locale-kf6-kpeople-it \
locale-kf6-kpeople-ja \
locale-kf6-kpeople-ka \
locale-kf6-kpeople-ko \
locale-kf6-kpeople-lt \
locale-kf6-kpeople-lv \
locale-kf6-kpeople-ml \
locale-kf6-kpeople-nb \
locale-kf6-kpeople-nl \
locale-kf6-kpeople-nn \
locale-kf6-kpeople-pa \
locale-kf6-kpeople-pl \
locale-kf6-kpeople-pt \
locale-kf6-kpeople-pt-BR \
locale-kf6-kpeople-ro \
locale-kf6-kpeople-ru \
locale-kf6-kpeople-sk \
locale-kf6-kpeople-sl \
locale-kf6-kpeople-sr \
locale-kf6-kpeople-sr@ijekavian \
locale-kf6-kpeople-sr@ijekavianlatin \
locale-kf6-kpeople-sr@latin \
locale-kf6-kpeople-sv \
locale-kf6-kpeople-ta \
locale-kf6-kpeople-tr \
locale-kf6-kpeople-ug \
locale-kf6-kpeople-uk \
locale-kf6-kpeople-zh-CN \
locale-kf6-kpeople-zh-TW"

RDEPENDS:${PN} += "kf6-kpeople"

inherit rpm
