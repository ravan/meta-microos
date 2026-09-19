SUMMARY = "Translations for package xfconf"
DESCRIPTION = "Provides translations for the 'xfconf' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "xfconf-lang-4.20.0-1.9.noarch.rpm"
RPM_HASH = "df71c32b3d3cd889b4e663483dead276ef1f3ad8017eca7348e36122c3227662490fb0db5b58333c5de7c4b34437d511d9965ebf623843957c716d3794464657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfconf-ar \
locale-xfconf-be \
locale-xfconf-bg \
locale-xfconf-bn \
locale-xfconf-ca \
locale-xfconf-cs \
locale-xfconf-da \
locale-xfconf-de \
locale-xfconf-el \
locale-xfconf-en-AU \
locale-xfconf-en-CA \
locale-xfconf-en-GB \
locale-xfconf-es \
locale-xfconf-et \
locale-xfconf-eu \
locale-xfconf-fi \
locale-xfconf-fr \
locale-xfconf-gl \
locale-xfconf-he \
locale-xfconf-hi \
locale-xfconf-hr \
locale-xfconf-hu \
locale-xfconf-id \
locale-xfconf-is \
locale-xfconf-it \
locale-xfconf-ja \
locale-xfconf-ko \
locale-xfconf-lt \
locale-xfconf-lv \
locale-xfconf-ms \
locale-xfconf-nb \
locale-xfconf-nl \
locale-xfconf-nn \
locale-xfconf-oc \
locale-xfconf-pa \
locale-xfconf-pl \
locale-xfconf-pt \
locale-xfconf-pt-BR \
locale-xfconf-ro \
locale-xfconf-ru \
locale-xfconf-si \
locale-xfconf-sk \
locale-xfconf-sl \
locale-xfconf-sq \
locale-xfconf-sr \
locale-xfconf-sv \
locale-xfconf-te \
locale-xfconf-th \
locale-xfconf-tr \
locale-xfconf-ug \
locale-xfconf-uk \
locale-xfconf-zh-CN \
locale-xfconf-zh-HK \
locale-xfconf-zh-TW \
xfconf-lang \
xfconf-lang-all"

RDEPENDS:${PN} += "xfconf"

inherit rpm
