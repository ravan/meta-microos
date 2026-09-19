SUMMARY = "Translations for package kscreen6"
DESCRIPTION = "Provides translations for the 'kscreen6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kscreen6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "ab62ca08f707a17a0ad4c6f6f1020f2b063c000834ca152d0ad54566e4c80564e525535298f3d7ab95823c9f4a89a24920bf1ae8fee8e65bcc524e59f8ccc915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kscreen6-lang \
kscreen6-lang-all \
locale-kscreen6-ar \
locale-kscreen6-ast \
locale-kscreen6-az \
locale-kscreen6-bg \
locale-kscreen6-bs \
locale-kscreen6-ca \
locale-kscreen6-ca@valencia \
locale-kscreen6-cs \
locale-kscreen6-da \
locale-kscreen6-de \
locale-kscreen6-el \
locale-kscreen6-en-GB \
locale-kscreen6-eo \
locale-kscreen6-es \
locale-kscreen6-et \
locale-kscreen6-eu \
locale-kscreen6-fi \
locale-kscreen6-fr \
locale-kscreen6-ga \
locale-kscreen6-gl \
locale-kscreen6-he \
locale-kscreen6-hi \
locale-kscreen6-hu \
locale-kscreen6-ia \
locale-kscreen6-id \
locale-kscreen6-is \
locale-kscreen6-it \
locale-kscreen6-ja \
locale-kscreen6-ka \
locale-kscreen6-ko \
locale-kscreen6-lt \
locale-kscreen6-lv \
locale-kscreen6-ml \
locale-kscreen6-nb \
locale-kscreen6-nl \
locale-kscreen6-nn \
locale-kscreen6-pa \
locale-kscreen6-pl \
locale-kscreen6-pt \
locale-kscreen6-pt-BR \
locale-kscreen6-ro \
locale-kscreen6-ru \
locale-kscreen6-sk \
locale-kscreen6-sl \
locale-kscreen6-sr \
locale-kscreen6-sr@ijekavian \
locale-kscreen6-sr@ijekavianlatin \
locale-kscreen6-sr@latin \
locale-kscreen6-sv \
locale-kscreen6-ta \
locale-kscreen6-tr \
locale-kscreen6-uk \
locale-kscreen6-zh-CN \
locale-kscreen6-zh-TW"

RDEPENDS:${PN} += "kscreen6"

inherit rpm
