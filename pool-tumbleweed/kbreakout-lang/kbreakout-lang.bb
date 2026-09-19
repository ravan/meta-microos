SUMMARY = "Translations for package kbreakout"
DESCRIPTION = "Provides translations for the 'kbreakout' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kbreakout-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "f497986a61d7f5c10e0e1f51e394f15edf2d296322ad5a56f351d34cdc8968f26a009edb3902615328233c1c36f02e49a81643725f6661d90f4f286ab7b59ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbreakout-lang \
kbreakout-lang-all \
locale-kbreakout-ar \
locale-kbreakout-ast \
locale-kbreakout-bs \
locale-kbreakout-ca \
locale-kbreakout-ca@valencia \
locale-kbreakout-cs \
locale-kbreakout-da \
locale-kbreakout-de \
locale-kbreakout-el \
locale-kbreakout-en-GB \
locale-kbreakout-eo \
locale-kbreakout-es \
locale-kbreakout-et \
locale-kbreakout-eu \
locale-kbreakout-fi \
locale-kbreakout-fr \
locale-kbreakout-ga \
locale-kbreakout-gl \
locale-kbreakout-gu \
locale-kbreakout-he \
locale-kbreakout-hi \
locale-kbreakout-hr \
locale-kbreakout-hu \
locale-kbreakout-ia \
locale-kbreakout-id \
locale-kbreakout-is \
locale-kbreakout-it \
locale-kbreakout-ja \
locale-kbreakout-ka \
locale-kbreakout-kk \
locale-kbreakout-km \
locale-kbreakout-ko \
locale-kbreakout-lt \
locale-kbreakout-lv \
locale-kbreakout-mai \
locale-kbreakout-ml \
locale-kbreakout-mr \
locale-kbreakout-nb \
locale-kbreakout-nds \
locale-kbreakout-nl \
locale-kbreakout-nn \
locale-kbreakout-pl \
locale-kbreakout-pt \
locale-kbreakout-pt-BR \
locale-kbreakout-ro \
locale-kbreakout-ru \
locale-kbreakout-sk \
locale-kbreakout-sl \
locale-kbreakout-sq \
locale-kbreakout-sr \
locale-kbreakout-sr@ijekavian \
locale-kbreakout-sr@ijekavianlatin \
locale-kbreakout-sr@latin \
locale-kbreakout-sv \
locale-kbreakout-th \
locale-kbreakout-tr \
locale-kbreakout-ug \
locale-kbreakout-uk \
locale-kbreakout-wa \
locale-kbreakout-zh-CN \
locale-kbreakout-zh-TW"

RDEPENDS:${PN} += "kbreakout"

inherit rpm
