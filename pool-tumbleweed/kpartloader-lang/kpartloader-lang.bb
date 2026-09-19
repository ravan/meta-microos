SUMMARY = "Translations for package kpartloader"
DESCRIPTION = "Provides translations for the 'kpartloader' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only & LGPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kpartloader-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "de598af596981c04ce74e5410fac88577f40401b9a33c255c13e15a27bbebe1e7938c961d93eb6ed0fe5d2b6d508167f4d083d6c4cb95f99b7947f60ce92a970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpartloader-lang \
kpartloader-lang-all \
locale-kpartloader-ar \
locale-kpartloader-ast \
locale-kpartloader-az \
locale-kpartloader-bg \
locale-kpartloader-bs \
locale-kpartloader-ca \
locale-kpartloader-ca@valencia \
locale-kpartloader-cs \
locale-kpartloader-da \
locale-kpartloader-de \
locale-kpartloader-el \
locale-kpartloader-en-GB \
locale-kpartloader-eo \
locale-kpartloader-es \
locale-kpartloader-et \
locale-kpartloader-eu \
locale-kpartloader-fi \
locale-kpartloader-fr \
locale-kpartloader-ga \
locale-kpartloader-gl \
locale-kpartloader-he \
locale-kpartloader-hi \
locale-kpartloader-hr \
locale-kpartloader-hu \
locale-kpartloader-ia \
locale-kpartloader-id \
locale-kpartloader-is \
locale-kpartloader-it \
locale-kpartloader-ja \
locale-kpartloader-ka \
locale-kpartloader-kk \
locale-kpartloader-ko \
locale-kpartloader-lt \
locale-kpartloader-lv \
locale-kpartloader-mr \
locale-kpartloader-nb \
locale-kpartloader-nds \
locale-kpartloader-nl \
locale-kpartloader-nn \
locale-kpartloader-pa \
locale-kpartloader-pl \
locale-kpartloader-pt \
locale-kpartloader-pt-BR \
locale-kpartloader-ro \
locale-kpartloader-ru \
locale-kpartloader-sk \
locale-kpartloader-sl \
locale-kpartloader-sq \
locale-kpartloader-sv \
locale-kpartloader-tr \
locale-kpartloader-ug \
locale-kpartloader-uk \
locale-kpartloader-zh-CN \
locale-kpartloader-zh-TW"

RDEPENDS:${PN} += "kpartloader"

inherit rpm
