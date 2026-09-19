SUMMARY = "Translations for package findutils"
DESCRIPTION = "Provides translations for the 'findutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.11.0"

RPM_NAME = "findutils-lang-4.11.0-1.2.noarch.rpm"
RPM_HASH = "7c847a473691054f6e640ee1d78d4fde9e64f568ab9b327bcd8e3bc0398ec7e285951bc728b8e06dcbee5984bd7b6069fa69618e6a8b10e433c6d32d11dd3da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findutils-lang \
findutils-lang-all \
locale-findutils-ar \
locale-findutils-be \
locale-findutils-bg \
locale-findutils-ca \
locale-findutils-cs \
locale-findutils-da \
locale-findutils-de \
locale-findutils-el \
locale-findutils-eo \
locale-findutils-es \
locale-findutils-et \
locale-findutils-fi \
locale-findutils-fr \
locale-findutils-ga \
locale-findutils-gl \
locale-findutils-hr \
locale-findutils-hu \
locale-findutils-id \
locale-findutils-it \
locale-findutils-ja \
locale-findutils-ka \
locale-findutils-ko \
locale-findutils-lt \
locale-findutils-ms \
locale-findutils-nb \
locale-findutils-nl \
locale-findutils-pl \
locale-findutils-pt \
locale-findutils-pt-BR \
locale-findutils-ro \
locale-findutils-ru \
locale-findutils-sk \
locale-findutils-sl \
locale-findutils-sr \
locale-findutils-sv \
locale-findutils-tr \
locale-findutils-uk \
locale-findutils-vi \
locale-findutils-zh-CN \
locale-findutils-zh-TW"

RDEPENDS:${PN} += "findutils"

inherit rpm
