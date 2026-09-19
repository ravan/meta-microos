SUMMARY = "Translations for package kblocks"
DESCRIPTION = "Provides translations for the 'kblocks' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kblocks-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "f6f1e0930ec8aea1df91c4bade88a6ad5a43641f2a853145b71e4af4bdeb28f803d17458927d218c5cce3a63ddc60854efaaf386d9adfcd11d0eee263043c717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kblocks-lang \
kblocks-lang-all \
locale-kblocks-ar \
locale-kblocks-ast \
locale-kblocks-bg \
locale-kblocks-bs \
locale-kblocks-ca \
locale-kblocks-ca@valencia \
locale-kblocks-cs \
locale-kblocks-da \
locale-kblocks-de \
locale-kblocks-el \
locale-kblocks-en-GB \
locale-kblocks-eo \
locale-kblocks-es \
locale-kblocks-et \
locale-kblocks-eu \
locale-kblocks-fi \
locale-kblocks-fr \
locale-kblocks-ga \
locale-kblocks-gl \
locale-kblocks-gu \
locale-kblocks-he \
locale-kblocks-hi \
locale-kblocks-hr \
locale-kblocks-hu \
locale-kblocks-ia \
locale-kblocks-id \
locale-kblocks-is \
locale-kblocks-it \
locale-kblocks-ja \
locale-kblocks-ka \
locale-kblocks-kk \
locale-kblocks-km \
locale-kblocks-ko \
locale-kblocks-lt \
locale-kblocks-lv \
locale-kblocks-mai \
locale-kblocks-ml \
locale-kblocks-mr \
locale-kblocks-nb \
locale-kblocks-nds \
locale-kblocks-nl \
locale-kblocks-nn \
locale-kblocks-pl \
locale-kblocks-pt \
locale-kblocks-pt-BR \
locale-kblocks-ro \
locale-kblocks-ru \
locale-kblocks-sk \
locale-kblocks-sl \
locale-kblocks-sq \
locale-kblocks-sr \
locale-kblocks-sr@ijekavian \
locale-kblocks-sr@ijekavianlatin \
locale-kblocks-sr@latin \
locale-kblocks-sv \
locale-kblocks-th \
locale-kblocks-tr \
locale-kblocks-ug \
locale-kblocks-uk \
locale-kblocks-zh-CN \
locale-kblocks-zh-TW"

RDEPENDS:${PN} += "kblocks"

inherit rpm
