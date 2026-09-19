SUMMARY = "Translations for package colord"
DESCRIPTION = "Provides translations for the 'colord' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.8"

RPM_NAME = "colord-lang-1.4.8-3.1.noarch.rpm"
RPM_HASH = "f7607b22c6c4e27e74ceeb68a22f253737ae5d83b2616542bca919fd59da4b55959b204ca9f8a51530eed83613cd1c5a919dc30196c9b3f69e598c9b93cc2967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-lang \
colord-lang-all \
locale-colord-ar \
locale-colord-as \
locale-colord-be \
locale-colord-bg \
locale-colord-bn-IN \
locale-colord-ca \
locale-colord-cs \
locale-colord-da \
locale-colord-de \
locale-colord-el \
locale-colord-en-GB \
locale-colord-eo \
locale-colord-es \
locale-colord-eu \
locale-colord-fi \
locale-colord-fr \
locale-colord-fur \
locale-colord-gl \
locale-colord-gu \
locale-colord-he \
locale-colord-hi \
locale-colord-hr \
locale-colord-hu \
locale-colord-id \
locale-colord-is \
locale-colord-it \
locale-colord-ja \
locale-colord-ka \
locale-colord-kk \
locale-colord-kn \
locale-colord-ko \
locale-colord-lt \
locale-colord-lv \
locale-colord-ml \
locale-colord-mr \
locale-colord-nb \
locale-colord-nl \
locale-colord-oc \
locale-colord-or \
locale-colord-pa \
locale-colord-pl \
locale-colord-pt \
locale-colord-pt-BR \
locale-colord-ro \
locale-colord-ru \
locale-colord-si \
locale-colord-sk \
locale-colord-sl \
locale-colord-sq \
locale-colord-sr \
locale-colord-sr@latin \
locale-colord-sv \
locale-colord-ta \
locale-colord-th \
locale-colord-tr \
locale-colord-uk \
locale-colord-zh-CN \
locale-colord-zh-TW"

RDEPENDS:${PN} += "colord"

inherit rpm
