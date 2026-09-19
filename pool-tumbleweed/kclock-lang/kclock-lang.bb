SUMMARY = "Translations for package kclock"
DESCRIPTION = "Provides translations for the 'kclock' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kclock-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "551307d4c27c49bb9dfebab2fa10215d6e705408c06b5a95c110a26107a792000f56d2a24ae14bdb80f903b3b3193946e9a23c19e870d75242ae21b9967b0945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kclock-lang \
kclock-lang-all \
locale-kclock-ar \
locale-kclock-ast \
locale-kclock-bg \
locale-kclock-ca \
locale-kclock-ca@valencia \
locale-kclock-cs \
locale-kclock-da \
locale-kclock-de \
locale-kclock-el \
locale-kclock-en-GB \
locale-kclock-eo \
locale-kclock-es \
locale-kclock-eu \
locale-kclock-fi \
locale-kclock-fr \
locale-kclock-ga \
locale-kclock-gl \
locale-kclock-he \
locale-kclock-hi \
locale-kclock-hu \
locale-kclock-ia \
locale-kclock-it \
locale-kclock-ja \
locale-kclock-ka \
locale-kclock-ko \
locale-kclock-lt \
locale-kclock-lv \
locale-kclock-nl \
locale-kclock-nn \
locale-kclock-pa \
locale-kclock-pl \
locale-kclock-pt \
locale-kclock-pt-BR \
locale-kclock-ro \
locale-kclock-ru \
locale-kclock-sk \
locale-kclock-sl \
locale-kclock-sv \
locale-kclock-th \
locale-kclock-tr \
locale-kclock-ug \
locale-kclock-uk \
locale-kclock-zh-CN \
locale-kclock-zh-TW"

RDEPENDS:${PN} += "kclock"

inherit rpm
