SUMMARY = "Translations for package kf6-kcmutils"
DESCRIPTION = "Provides translations for the 'kf6-kcmutils' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcmutils-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "55bf1114336a55545422db9f864350fea4e37bd390210e4049b55f07bf6a514517a667fd1d6a946fd2951342c0303ce74b0ab7efbfd66032d7781193709e94e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kcmutils-lang \
kf6-kcmutils-lang-all \
locale-kf6-kcmutils-ar \
locale-kf6-kcmutils-ast \
locale-kf6-kcmutils-be \
locale-kf6-kcmutils-bg \
locale-kf6-kcmutils-ca \
locale-kf6-kcmutils-ca@valencia \
locale-kf6-kcmutils-cs \
locale-kf6-kcmutils-de \
locale-kf6-kcmutils-en-GB \
locale-kf6-kcmutils-eo \
locale-kf6-kcmutils-es \
locale-kf6-kcmutils-eu \
locale-kf6-kcmutils-fi \
locale-kf6-kcmutils-fr \
locale-kf6-kcmutils-ga \
locale-kf6-kcmutils-gl \
locale-kf6-kcmutils-he \
locale-kf6-kcmutils-hi \
locale-kf6-kcmutils-hu \
locale-kf6-kcmutils-ia \
locale-kf6-kcmutils-id \
locale-kf6-kcmutils-is \
locale-kf6-kcmutils-it \
locale-kf6-kcmutils-ja \
locale-kf6-kcmutils-ka \
locale-kf6-kcmutils-ko \
locale-kf6-kcmutils-lt \
locale-kf6-kcmutils-lv \
locale-kf6-kcmutils-nb \
locale-kf6-kcmutils-nl \
locale-kf6-kcmutils-nn \
locale-kf6-kcmutils-pl \
locale-kf6-kcmutils-pt-BR \
locale-kf6-kcmutils-ro \
locale-kf6-kcmutils-ru \
locale-kf6-kcmutils-sk \
locale-kf6-kcmutils-sl \
locale-kf6-kcmutils-sv \
locale-kf6-kcmutils-ta \
locale-kf6-kcmutils-tr \
locale-kf6-kcmutils-ug \
locale-kf6-kcmutils-uk \
locale-kf6-kcmutils-zh-CN \
locale-kf6-kcmutils-zh-TW"

RDEPENDS:${PN} += "kf6-kcmutils"

inherit rpm
