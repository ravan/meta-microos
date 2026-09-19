SUMMARY = "Translations for package mutter"
DESCRIPTION = "Provides translations for the 'mutter' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "mutter-lang-50.4-1.1.noarch.rpm"
RPM_HASH = "573bebfa4e56038469735679c65e04596581e32cb08d453bfa29d8aceb17632d1c3acd8d68d788b7051ab3fae6e44d2400a8abb31a0b0fe71d723b2edea3a50d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mutter-ar \
locale-mutter-as \
locale-mutter-ast \
locale-mutter-az \
locale-mutter-be \
locale-mutter-be@latin \
locale-mutter-bg \
locale-mutter-bn \
locale-mutter-bn-IN \
locale-mutter-br \
locale-mutter-bs \
locale-mutter-ca \
locale-mutter-ca@valencia \
locale-mutter-cs \
locale-mutter-cy \
locale-mutter-da \
locale-mutter-de \
locale-mutter-dz \
locale-mutter-el \
locale-mutter-en-CA \
locale-mutter-en-GB \
locale-mutter-eo \
locale-mutter-es \
locale-mutter-et \
locale-mutter-eu \
locale-mutter-fa \
locale-mutter-fi \
locale-mutter-fr \
locale-mutter-fur \
locale-mutter-ga \
locale-mutter-gd \
locale-mutter-gl \
locale-mutter-gu \
locale-mutter-he \
locale-mutter-hi \
locale-mutter-hr \
locale-mutter-hu \
locale-mutter-ia \
locale-mutter-id \
locale-mutter-is \
locale-mutter-it \
locale-mutter-ja \
locale-mutter-ka \
locale-mutter-kk \
locale-mutter-kn \
locale-mutter-ko \
locale-mutter-lt \
locale-mutter-lv \
locale-mutter-mai \
locale-mutter-mk \
locale-mutter-ml \
locale-mutter-mr \
locale-mutter-ms \
locale-mutter-nb \
locale-mutter-nds \
locale-mutter-ne \
locale-mutter-nl \
locale-mutter-nn \
locale-mutter-oc \
locale-mutter-or \
locale-mutter-pa \
locale-mutter-pl \
locale-mutter-pt \
locale-mutter-pt-BR \
locale-mutter-ro \
locale-mutter-ru \
locale-mutter-si \
locale-mutter-sk \
locale-mutter-sl \
locale-mutter-sq \
locale-mutter-sr \
locale-mutter-sr@latin \
locale-mutter-sv \
locale-mutter-ta \
locale-mutter-te \
locale-mutter-th \
locale-mutter-tr \
locale-mutter-ug \
locale-mutter-uk \
locale-mutter-vi \
locale-mutter-wa \
locale-mutter-zh-CN \
locale-mutter-zh-HK \
locale-mutter-zh-TW \
mutter-lang \
mutter-lang-all"

RDEPENDS:${PN} += "mutter"

inherit rpm
