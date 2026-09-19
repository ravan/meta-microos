SUMMARY = "Translations for package xfmpc"
DESCRIPTION = "Provides translations for the 'xfmpc' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "xfmpc-lang-0.4.0-1.6.noarch.rpm"
RPM_HASH = "bd9c4ab0692d6ee3094b613f6ad6fb203d7f422f46b7fb82541f2c159d5a268d08ace156536ba607a43d99ceae14b01b0eb462be9b5544e5589da8702fd46bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfmpc-ar \
locale-xfmpc-be \
locale-xfmpc-bg \
locale-xfmpc-ca \
locale-xfmpc-cs \
locale-xfmpc-da \
locale-xfmpc-de \
locale-xfmpc-el \
locale-xfmpc-en-AU \
locale-xfmpc-en-GB \
locale-xfmpc-es \
locale-xfmpc-et \
locale-xfmpc-eu \
locale-xfmpc-fi \
locale-xfmpc-fr \
locale-xfmpc-gl \
locale-xfmpc-he \
locale-xfmpc-hr \
locale-xfmpc-hu \
locale-xfmpc-id \
locale-xfmpc-is \
locale-xfmpc-it \
locale-xfmpc-ja \
locale-xfmpc-ko \
locale-xfmpc-lt \
locale-xfmpc-ms \
locale-xfmpc-nb \
locale-xfmpc-nl \
locale-xfmpc-oc \
locale-xfmpc-pl \
locale-xfmpc-pt \
locale-xfmpc-pt-BR \
locale-xfmpc-ro \
locale-xfmpc-ru \
locale-xfmpc-si \
locale-xfmpc-sk \
locale-xfmpc-sl \
locale-xfmpc-sq \
locale-xfmpc-sr \
locale-xfmpc-sv \
locale-xfmpc-th \
locale-xfmpc-tr \
locale-xfmpc-ug \
locale-xfmpc-uk \
locale-xfmpc-zh-CN \
locale-xfmpc-zh-TW \
xfmpc-lang \
xfmpc-lang-all"

RDEPENDS:${PN} += "xfmpc"

inherit rpm
