SUMMARY = "Translations for package kcalutils"
DESCRIPTION = "Provides translations for the 'kcalutils' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kcalutils-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4dc6bc24174d4e9a951c65fdd1dbff17d06957b4857aac91b6e7fa558632e15b57f53a5633f3f173996c404ae7c10c200e8ff192e2b6da8c44c4718bf00d70bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcalutils-lang \
kcalutils-lang-all \
locale-kcalutils-ar \
locale-kcalutils-ast \
locale-kcalutils-az \
locale-kcalutils-bg \
locale-kcalutils-bs \
locale-kcalutils-ca \
locale-kcalutils-ca@valencia \
locale-kcalutils-cs \
locale-kcalutils-da \
locale-kcalutils-de \
locale-kcalutils-el \
locale-kcalutils-en-GB \
locale-kcalutils-eo \
locale-kcalutils-es \
locale-kcalutils-et \
locale-kcalutils-eu \
locale-kcalutils-fi \
locale-kcalutils-fr \
locale-kcalutils-ga \
locale-kcalutils-gl \
locale-kcalutils-he \
locale-kcalutils-hi \
locale-kcalutils-hr \
locale-kcalutils-hu \
locale-kcalutils-ia \
locale-kcalutils-it \
locale-kcalutils-ja \
locale-kcalutils-ka \
locale-kcalutils-kk \
locale-kcalutils-km \
locale-kcalutils-ko \
locale-kcalutils-lt \
locale-kcalutils-mai \
locale-kcalutils-mr \
locale-kcalutils-nb \
locale-kcalutils-nds \
locale-kcalutils-nl \
locale-kcalutils-nn \
locale-kcalutils-pa \
locale-kcalutils-pl \
locale-kcalutils-pt \
locale-kcalutils-pt-BR \
locale-kcalutils-ro \
locale-kcalutils-ru \
locale-kcalutils-sk \
locale-kcalutils-sl \
locale-kcalutils-sr \
locale-kcalutils-sr@ijekavian \
locale-kcalutils-sr@ijekavianlatin \
locale-kcalutils-sr@latin \
locale-kcalutils-sv \
locale-kcalutils-ta \
locale-kcalutils-tr \
locale-kcalutils-ug \
locale-kcalutils-uk \
locale-kcalutils-zh-CN \
locale-kcalutils-zh-TW"

RDEPENDS:${PN} += "kcalutils"

inherit rpm
