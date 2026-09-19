SUMMARY = "Translations for package dragonplayer"
DESCRIPTION = "Provides translations for the 'dragonplayer' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "dragonplayer-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "d71f31a992f6b71cbc4ee025f4b65d2bc2dde480b477a0f79f2e4424d8d26a5aa358fb15ddcc343d64bdf6b745fa9567fa4c092e6659f77d9b3682e4f73137bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dragonplayer-lang \
dragonplayer-lang-all \
locale-dragonplayer-ar \
locale-dragonplayer-ast \
locale-dragonplayer-be \
locale-dragonplayer-bg \
locale-dragonplayer-bs \
locale-dragonplayer-ca \
locale-dragonplayer-ca@valencia \
locale-dragonplayer-cs \
locale-dragonplayer-da \
locale-dragonplayer-de \
locale-dragonplayer-el \
locale-dragonplayer-en-GB \
locale-dragonplayer-eo \
locale-dragonplayer-es \
locale-dragonplayer-et \
locale-dragonplayer-eu \
locale-dragonplayer-fi \
locale-dragonplayer-fr \
locale-dragonplayer-ga \
locale-dragonplayer-gl \
locale-dragonplayer-he \
locale-dragonplayer-hi \
locale-dragonplayer-hr \
locale-dragonplayer-hu \
locale-dragonplayer-ia \
locale-dragonplayer-id \
locale-dragonplayer-is \
locale-dragonplayer-it \
locale-dragonplayer-ja \
locale-dragonplayer-ka \
locale-dragonplayer-kk \
locale-dragonplayer-km \
locale-dragonplayer-ko \
locale-dragonplayer-lt \
locale-dragonplayer-lv \
locale-dragonplayer-mr \
locale-dragonplayer-nb \
locale-dragonplayer-nds \
locale-dragonplayer-nl \
locale-dragonplayer-nn \
locale-dragonplayer-oc \
locale-dragonplayer-pa \
locale-dragonplayer-pl \
locale-dragonplayer-pt \
locale-dragonplayer-pt-BR \
locale-dragonplayer-ro \
locale-dragonplayer-ru \
locale-dragonplayer-sk \
locale-dragonplayer-sl \
locale-dragonplayer-sq \
locale-dragonplayer-sr \
locale-dragonplayer-sr@ijekavian \
locale-dragonplayer-sr@ijekavianlatin \
locale-dragonplayer-sr@latin \
locale-dragonplayer-sv \
locale-dragonplayer-th \
locale-dragonplayer-tr \
locale-dragonplayer-ug \
locale-dragonplayer-uk \
locale-dragonplayer-wa \
locale-dragonplayer-zh-CN \
locale-dragonplayer-zh-TW"

RDEPENDS:${PN} += "dragonplayer"

inherit rpm
