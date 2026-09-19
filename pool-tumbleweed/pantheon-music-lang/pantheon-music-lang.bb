SUMMARY = "Translations for package pantheon-music"
DESCRIPTION = "Provides translations for the 'pantheon-music' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-music-lang-8.1.0-1.4.noarch.rpm"
RPM_HASH = "7a3ded4482156fab6653fb58d8bfdac389e2c017711e91e993a9302dbbcf609d2fa8f54560a536a51890ffc51a0805670d16bfb79818dc4724404c31b41d2749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-music-af \
locale-pantheon-music-ar \
locale-pantheon-music-as \
locale-pantheon-music-ast \
locale-pantheon-music-az \
locale-pantheon-music-be \
locale-pantheon-music-bg \
locale-pantheon-music-bn \
locale-pantheon-music-br \
locale-pantheon-music-bs \
locale-pantheon-music-ca \
locale-pantheon-music-cs \
locale-pantheon-music-cy \
locale-pantheon-music-da \
locale-pantheon-music-de \
locale-pantheon-music-dz \
locale-pantheon-music-el \
locale-pantheon-music-en-AU \
locale-pantheon-music-en-CA \
locale-pantheon-music-en-GB \
locale-pantheon-music-eo \
locale-pantheon-music-es \
locale-pantheon-music-et \
locale-pantheon-music-eu \
locale-pantheon-music-fa \
locale-pantheon-music-fi \
locale-pantheon-music-fr \
locale-pantheon-music-fr-CA \
locale-pantheon-music-ga \
locale-pantheon-music-gd \
locale-pantheon-music-gl \
locale-pantheon-music-gu \
locale-pantheon-music-he \
locale-pantheon-music-hi \
locale-pantheon-music-hr \
locale-pantheon-music-hu \
locale-pantheon-music-ia \
locale-pantheon-music-id \
locale-pantheon-music-is \
locale-pantheon-music-it \
locale-pantheon-music-ja \
locale-pantheon-music-ka \
locale-pantheon-music-kk \
locale-pantheon-music-km \
locale-pantheon-music-kn \
locale-pantheon-music-ko \
locale-pantheon-music-lt \
locale-pantheon-music-lv \
locale-pantheon-music-mk \
locale-pantheon-music-ml \
locale-pantheon-music-mr \
locale-pantheon-music-ms \
locale-pantheon-music-nb \
locale-pantheon-music-ne \
locale-pantheon-music-nl \
locale-pantheon-music-nn \
locale-pantheon-music-oc \
locale-pantheon-music-or \
locale-pantheon-music-pa \
locale-pantheon-music-pl \
locale-pantheon-music-pt \
locale-pantheon-music-pt-BR \
locale-pantheon-music-ro \
locale-pantheon-music-ru \
locale-pantheon-music-si \
locale-pantheon-music-sk \
locale-pantheon-music-sl \
locale-pantheon-music-sq \
locale-pantheon-music-sr \
locale-pantheon-music-sr@latin \
locale-pantheon-music-sv \
locale-pantheon-music-ta \
locale-pantheon-music-te \
locale-pantheon-music-th \
locale-pantheon-music-tr \
locale-pantheon-music-ug \
locale-pantheon-music-uk \
locale-pantheon-music-vi \
locale-pantheon-music-wa \
locale-pantheon-music-zh \
locale-pantheon-music-zh-CN \
locale-pantheon-music-zh-HK \
locale-pantheon-music-zh-TW \
pantheon-music-lang \
pantheon-music-lang-all"

RDEPENDS:${PN} += "pantheon-music"

inherit rpm
