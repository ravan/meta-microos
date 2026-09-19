SUMMARY = "Translations for package kf6-qqc2-desktop-style"
DESCRIPTION = "Provides translations for the 'kf6-qqc2-desktop-style' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-qqc2-desktop-style-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "a6b7d4ddb5388bdce6724a685a44281ef3ca57c999de71e8b15c14c712e6d2f3ae559a77a13b7754ee38f8ea62c36c1e2fca7881586c222be7ba5eb1ee853216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-qqc2-desktop-style-lang \
kf6-qqc2-desktop-style-lang-all \
locale-kf6-qqc2-desktop-style-ar \
locale-kf6-qqc2-desktop-style-ast \
locale-kf6-qqc2-desktop-style-ca \
locale-kf6-qqc2-desktop-style-ca@valencia \
locale-kf6-qqc2-desktop-style-cs \
locale-kf6-qqc2-desktop-style-de \
locale-kf6-qqc2-desktop-style-en-GB \
locale-kf6-qqc2-desktop-style-eo \
locale-kf6-qqc2-desktop-style-es \
locale-kf6-qqc2-desktop-style-eu \
locale-kf6-qqc2-desktop-style-fi \
locale-kf6-qqc2-desktop-style-fr \
locale-kf6-qqc2-desktop-style-ga \
locale-kf6-qqc2-desktop-style-gl \
locale-kf6-qqc2-desktop-style-he \
locale-kf6-qqc2-desktop-style-hi \
locale-kf6-qqc2-desktop-style-hu \
locale-kf6-qqc2-desktop-style-ia \
locale-kf6-qqc2-desktop-style-is \
locale-kf6-qqc2-desktop-style-it \
locale-kf6-qqc2-desktop-style-ka \
locale-kf6-qqc2-desktop-style-ko \
locale-kf6-qqc2-desktop-style-lt \
locale-kf6-qqc2-desktop-style-lv \
locale-kf6-qqc2-desktop-style-nb \
locale-kf6-qqc2-desktop-style-nl \
locale-kf6-qqc2-desktop-style-nn \
locale-kf6-qqc2-desktop-style-pl \
locale-kf6-qqc2-desktop-style-pt-BR \
locale-kf6-qqc2-desktop-style-ro \
locale-kf6-qqc2-desktop-style-ru \
locale-kf6-qqc2-desktop-style-sk \
locale-kf6-qqc2-desktop-style-sl \
locale-kf6-qqc2-desktop-style-sv \
locale-kf6-qqc2-desktop-style-ta \
locale-kf6-qqc2-desktop-style-tr \
locale-kf6-qqc2-desktop-style-ug \
locale-kf6-qqc2-desktop-style-uk \
locale-kf6-qqc2-desktop-style-zh-CN \
locale-kf6-qqc2-desktop-style-zh-TW"

RDEPENDS:${PN} += "kf6-qqc2-desktop-style"

inherit rpm
