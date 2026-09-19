SUMMARY = "Translations for package pantheon-videos"
DESCRIPTION = "Provides translations for the 'pantheon-videos' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-videos-lang-8.0.2-1.4.noarch.rpm"
RPM_HASH = "f696097144f845c99b56671655adfa313854b68d237a61aff4fa1921954080b325b1061550da828f2e528b3544c598621c255d3bd3d98dbf9189027bedeef1bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-videos-af \
locale-pantheon-videos-ar \
locale-pantheon-videos-as \
locale-pantheon-videos-ast \
locale-pantheon-videos-az \
locale-pantheon-videos-be \
locale-pantheon-videos-bg \
locale-pantheon-videos-bn \
locale-pantheon-videos-br \
locale-pantheon-videos-bs \
locale-pantheon-videos-ca \
locale-pantheon-videos-cs \
locale-pantheon-videos-cy \
locale-pantheon-videos-da \
locale-pantheon-videos-de \
locale-pantheon-videos-dz \
locale-pantheon-videos-el \
locale-pantheon-videos-en-AU \
locale-pantheon-videos-en-CA \
locale-pantheon-videos-en-GB \
locale-pantheon-videos-eo \
locale-pantheon-videos-es \
locale-pantheon-videos-et \
locale-pantheon-videos-eu \
locale-pantheon-videos-fa \
locale-pantheon-videos-fi \
locale-pantheon-videos-fr \
locale-pantheon-videos-fr-CA \
locale-pantheon-videos-ga \
locale-pantheon-videos-gd \
locale-pantheon-videos-gl \
locale-pantheon-videos-gu \
locale-pantheon-videos-he \
locale-pantheon-videos-hi \
locale-pantheon-videos-hr \
locale-pantheon-videos-hu \
locale-pantheon-videos-ia \
locale-pantheon-videos-id \
locale-pantheon-videos-is \
locale-pantheon-videos-it \
locale-pantheon-videos-ja \
locale-pantheon-videos-ka \
locale-pantheon-videos-kk \
locale-pantheon-videos-km \
locale-pantheon-videos-kn \
locale-pantheon-videos-ko \
locale-pantheon-videos-lt \
locale-pantheon-videos-lv \
locale-pantheon-videos-mk \
locale-pantheon-videos-ml \
locale-pantheon-videos-mr \
locale-pantheon-videos-ms \
locale-pantheon-videos-nb \
locale-pantheon-videos-ne \
locale-pantheon-videos-nl \
locale-pantheon-videos-nn \
locale-pantheon-videos-oc \
locale-pantheon-videos-or \
locale-pantheon-videos-pa \
locale-pantheon-videos-pl \
locale-pantheon-videos-pt \
locale-pantheon-videos-pt-BR \
locale-pantheon-videos-ro \
locale-pantheon-videos-ru \
locale-pantheon-videos-si \
locale-pantheon-videos-sk \
locale-pantheon-videos-sl \
locale-pantheon-videos-sq \
locale-pantheon-videos-sr \
locale-pantheon-videos-sv \
locale-pantheon-videos-ta \
locale-pantheon-videos-te \
locale-pantheon-videos-th \
locale-pantheon-videos-tr \
locale-pantheon-videos-ug \
locale-pantheon-videos-uk \
locale-pantheon-videos-vi \
locale-pantheon-videos-wa \
locale-pantheon-videos-zh \
locale-pantheon-videos-zh-CN \
locale-pantheon-videos-zh-HK \
locale-pantheon-videos-zh-TW \
pantheon-videos-lang \
pantheon-videos-lang-all"

RDEPENDS:${PN} += "pantheon-videos"

inherit rpm
