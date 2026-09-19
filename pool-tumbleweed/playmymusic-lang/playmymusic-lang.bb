SUMMARY = "Translations for package playmymusic"
DESCRIPTION = "Provides translations for the 'playmymusic' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "playmymusic-lang-2.2.1-1.9.noarch.rpm"
RPM_HASH = "ff7db4c4b7fc104198ec325f982891bb1ad10ba7277908209b3cdcbd78077dd9a125ee7410369665f0df40d4e0f679d7fecf65b23a0285d74c8354931428a6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-playmymusic-af \
locale-playmymusic-ar \
locale-playmymusic-as \
locale-playmymusic-ast \
locale-playmymusic-az \
locale-playmymusic-be \
locale-playmymusic-bg \
locale-playmymusic-bn \
locale-playmymusic-br \
locale-playmymusic-bs \
locale-playmymusic-ca \
locale-playmymusic-cs \
locale-playmymusic-cy \
locale-playmymusic-da \
locale-playmymusic-de \
locale-playmymusic-dz \
locale-playmymusic-el \
locale-playmymusic-en-AU \
locale-playmymusic-en-CA \
locale-playmymusic-en-GB \
locale-playmymusic-eo \
locale-playmymusic-es \
locale-playmymusic-et \
locale-playmymusic-eu \
locale-playmymusic-fa \
locale-playmymusic-fi \
locale-playmymusic-fr \
locale-playmymusic-fr-CA \
locale-playmymusic-ga \
locale-playmymusic-gd \
locale-playmymusic-gl \
locale-playmymusic-gu \
locale-playmymusic-he \
locale-playmymusic-hi \
locale-playmymusic-hr \
locale-playmymusic-hu \
locale-playmymusic-ia \
locale-playmymusic-id \
locale-playmymusic-is \
locale-playmymusic-it \
locale-playmymusic-ja \
locale-playmymusic-ka \
locale-playmymusic-kk \
locale-playmymusic-km \
locale-playmymusic-kn \
locale-playmymusic-ko \
locale-playmymusic-lt \
locale-playmymusic-lv \
locale-playmymusic-mk \
locale-playmymusic-ml \
locale-playmymusic-mr \
locale-playmymusic-ms \
locale-playmymusic-nb \
locale-playmymusic-ne \
locale-playmymusic-nl \
locale-playmymusic-nn \
locale-playmymusic-oc \
locale-playmymusic-or \
locale-playmymusic-pa \
locale-playmymusic-pl \
locale-playmymusic-pt \
locale-playmymusic-pt-BR \
locale-playmymusic-ro \
locale-playmymusic-ru \
locale-playmymusic-si \
locale-playmymusic-sk \
locale-playmymusic-sl \
locale-playmymusic-sq \
locale-playmymusic-sr \
locale-playmymusic-sv \
locale-playmymusic-ta \
locale-playmymusic-te \
locale-playmymusic-th \
locale-playmymusic-tr \
locale-playmymusic-ug \
locale-playmymusic-uk \
locale-playmymusic-vi \
locale-playmymusic-wa \
locale-playmymusic-zh \
locale-playmymusic-zh-HK \
locale-playmymusic-zh-TW \
playmymusic-lang \
playmymusic-lang-all"

RDEPENDS:${PN} += "playmymusic"

inherit rpm
