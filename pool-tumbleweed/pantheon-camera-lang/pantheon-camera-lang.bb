SUMMARY = "Translations for package pantheon-camera"
DESCRIPTION = "Provides translations for the 'pantheon-camera' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-camera-lang-8.0.2-1.4.noarch.rpm"
RPM_HASH = "1f40c9c87c598b9cdabf65fedd673506a971cc2dfa13bdf3afdc49c9ea3468021f82d2fd89b1f692a0edb95e06aa53036ea4fde475d506862c5f5bfe697225f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-camera-af \
locale-pantheon-camera-ar \
locale-pantheon-camera-az \
locale-pantheon-camera-be \
locale-pantheon-camera-bg \
locale-pantheon-camera-bn \
locale-pantheon-camera-bs \
locale-pantheon-camera-ca \
locale-pantheon-camera-cs \
locale-pantheon-camera-da \
locale-pantheon-camera-de \
locale-pantheon-camera-el \
locale-pantheon-camera-en-AU \
locale-pantheon-camera-en-CA \
locale-pantheon-camera-en-GB \
locale-pantheon-camera-eo \
locale-pantheon-camera-es \
locale-pantheon-camera-et \
locale-pantheon-camera-eu \
locale-pantheon-camera-fa \
locale-pantheon-camera-fi \
locale-pantheon-camera-fr \
locale-pantheon-camera-fr-CA \
locale-pantheon-camera-ga \
locale-pantheon-camera-gl \
locale-pantheon-camera-he \
locale-pantheon-camera-hi \
locale-pantheon-camera-hr \
locale-pantheon-camera-hu \
locale-pantheon-camera-id \
locale-pantheon-camera-is \
locale-pantheon-camera-it \
locale-pantheon-camera-ja \
locale-pantheon-camera-ka \
locale-pantheon-camera-kn \
locale-pantheon-camera-ko \
locale-pantheon-camera-lt \
locale-pantheon-camera-lv \
locale-pantheon-camera-mk \
locale-pantheon-camera-mr \
locale-pantheon-camera-ms \
locale-pantheon-camera-nb \
locale-pantheon-camera-nb-NO \
locale-pantheon-camera-nl \
locale-pantheon-camera-nn \
locale-pantheon-camera-pa \
locale-pantheon-camera-pl \
locale-pantheon-camera-pt \
locale-pantheon-camera-pt-BR \
locale-pantheon-camera-ro \
locale-pantheon-camera-ru \
locale-pantheon-camera-si \
locale-pantheon-camera-sk \
locale-pantheon-camera-sl \
locale-pantheon-camera-sq \
locale-pantheon-camera-sr \
locale-pantheon-camera-sv \
locale-pantheon-camera-ta \
locale-pantheon-camera-te \
locale-pantheon-camera-th \
locale-pantheon-camera-tr \
locale-pantheon-camera-ug \
locale-pantheon-camera-uk \
locale-pantheon-camera-vi \
locale-pantheon-camera-zh \
locale-pantheon-camera-zh-CN \
locale-pantheon-camera-zh-TW \
pantheon-camera-lang \
pantheon-camera-lang-all"

RDEPENDS:${PN} += "pantheon-camera"

inherit rpm
