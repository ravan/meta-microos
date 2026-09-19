SUMMARY = "Translations for package playmyvideos"
DESCRIPTION = "Provides translations for the 'playmyvideos' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "playmyvideos-lang-1.1.2-1.8.noarch.rpm"
RPM_HASH = "8e23bb64d16a1a7ac31038074f8b0aed38740d15059e8813ae5a6d7ea11226cc1fdf11c085bc58c32dd08f43033c7fa8b1928e506b43812f77fda02b29e5ea54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-playmyvideos-af \
locale-playmyvideos-ar \
locale-playmyvideos-as \
locale-playmyvideos-ast \
locale-playmyvideos-az \
locale-playmyvideos-be \
locale-playmyvideos-bg \
locale-playmyvideos-bn \
locale-playmyvideos-br \
locale-playmyvideos-bs \
locale-playmyvideos-ca \
locale-playmyvideos-cs \
locale-playmyvideos-cy \
locale-playmyvideos-da \
locale-playmyvideos-de \
locale-playmyvideos-dz \
locale-playmyvideos-el \
locale-playmyvideos-en-AU \
locale-playmyvideos-en-CA \
locale-playmyvideos-en-GB \
locale-playmyvideos-eo \
locale-playmyvideos-es \
locale-playmyvideos-et \
locale-playmyvideos-eu \
locale-playmyvideos-fa \
locale-playmyvideos-fi \
locale-playmyvideos-fr \
locale-playmyvideos-fr-CA \
locale-playmyvideos-ga \
locale-playmyvideos-gd \
locale-playmyvideos-gl \
locale-playmyvideos-gu \
locale-playmyvideos-he \
locale-playmyvideos-hi \
locale-playmyvideos-hr \
locale-playmyvideos-hu \
locale-playmyvideos-ia \
locale-playmyvideos-id \
locale-playmyvideos-is \
locale-playmyvideos-it \
locale-playmyvideos-ja \
locale-playmyvideos-ka \
locale-playmyvideos-kk \
locale-playmyvideos-km \
locale-playmyvideos-kn \
locale-playmyvideos-ko \
locale-playmyvideos-lt \
locale-playmyvideos-lv \
locale-playmyvideos-mk \
locale-playmyvideos-ml \
locale-playmyvideos-mr \
locale-playmyvideos-ms \
locale-playmyvideos-nb \
locale-playmyvideos-ne \
locale-playmyvideos-nl \
locale-playmyvideos-nn \
locale-playmyvideos-oc \
locale-playmyvideos-or \
locale-playmyvideos-pa \
locale-playmyvideos-pl \
locale-playmyvideos-pt \
locale-playmyvideos-pt-BR \
locale-playmyvideos-ro \
locale-playmyvideos-ru \
locale-playmyvideos-si \
locale-playmyvideos-sk \
locale-playmyvideos-sl \
locale-playmyvideos-sq \
locale-playmyvideos-sr \
locale-playmyvideos-sv \
locale-playmyvideos-ta \
locale-playmyvideos-te \
locale-playmyvideos-th \
locale-playmyvideos-tr \
locale-playmyvideos-ug \
locale-playmyvideos-uk \
locale-playmyvideos-vi \
locale-playmyvideos-wa \
locale-playmyvideos-zh \
locale-playmyvideos-zh-CN \
locale-playmyvideos-zh-HK \
locale-playmyvideos-zh-TW \
playmyvideos-lang \
playmyvideos-lang-all"

RDEPENDS:${PN} += "playmyvideos"

inherit rpm
