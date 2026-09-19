SUMMARY = "Translations for package pantheon-bluetooth-daemon"
DESCRIPTION = "Provides translations for the 'pantheon-bluetooth-daemon' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "pantheon-bluetooth-daemon-lang-1.1.0-1.6.noarch.rpm"
RPM_HASH = "aa2c6578b5bd8e5272cc1a09b55f4445132db462a01c2939828a31643aa41fc2247b2675a737e3f023d939c0d4a731cb0ff443dd1b8e0a8747a29922a523a1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-bluetooth-daemon-af \
locale-pantheon-bluetooth-daemon-ar \
locale-pantheon-bluetooth-daemon-as \
locale-pantheon-bluetooth-daemon-ast \
locale-pantheon-bluetooth-daemon-az \
locale-pantheon-bluetooth-daemon-be \
locale-pantheon-bluetooth-daemon-bg \
locale-pantheon-bluetooth-daemon-bn \
locale-pantheon-bluetooth-daemon-br \
locale-pantheon-bluetooth-daemon-bs \
locale-pantheon-bluetooth-daemon-ca \
locale-pantheon-bluetooth-daemon-ca@valencia \
locale-pantheon-bluetooth-daemon-cs \
locale-pantheon-bluetooth-daemon-cy \
locale-pantheon-bluetooth-daemon-da \
locale-pantheon-bluetooth-daemon-de \
locale-pantheon-bluetooth-daemon-dz \
locale-pantheon-bluetooth-daemon-el \
locale-pantheon-bluetooth-daemon-en-AU \
locale-pantheon-bluetooth-daemon-en-CA \
locale-pantheon-bluetooth-daemon-en-GB \
locale-pantheon-bluetooth-daemon-eo \
locale-pantheon-bluetooth-daemon-es \
locale-pantheon-bluetooth-daemon-et \
locale-pantheon-bluetooth-daemon-eu \
locale-pantheon-bluetooth-daemon-fa \
locale-pantheon-bluetooth-daemon-fi \
locale-pantheon-bluetooth-daemon-fr \
locale-pantheon-bluetooth-daemon-fr-CA \
locale-pantheon-bluetooth-daemon-ga \
locale-pantheon-bluetooth-daemon-gd \
locale-pantheon-bluetooth-daemon-gl \
locale-pantheon-bluetooth-daemon-gu \
locale-pantheon-bluetooth-daemon-he \
locale-pantheon-bluetooth-daemon-hi \
locale-pantheon-bluetooth-daemon-hr \
locale-pantheon-bluetooth-daemon-hu \
locale-pantheon-bluetooth-daemon-ia \
locale-pantheon-bluetooth-daemon-id \
locale-pantheon-bluetooth-daemon-is \
locale-pantheon-bluetooth-daemon-it \
locale-pantheon-bluetooth-daemon-ja \
locale-pantheon-bluetooth-daemon-ka \
locale-pantheon-bluetooth-daemon-kk \
locale-pantheon-bluetooth-daemon-km \
locale-pantheon-bluetooth-daemon-kn \
locale-pantheon-bluetooth-daemon-ko \
locale-pantheon-bluetooth-daemon-lt \
locale-pantheon-bluetooth-daemon-lv \
locale-pantheon-bluetooth-daemon-mk \
locale-pantheon-bluetooth-daemon-ml \
locale-pantheon-bluetooth-daemon-mr \
locale-pantheon-bluetooth-daemon-ms \
locale-pantheon-bluetooth-daemon-nb \
locale-pantheon-bluetooth-daemon-ne \
locale-pantheon-bluetooth-daemon-nl \
locale-pantheon-bluetooth-daemon-nn \
locale-pantheon-bluetooth-daemon-oc \
locale-pantheon-bluetooth-daemon-or \
locale-pantheon-bluetooth-daemon-pa \
locale-pantheon-bluetooth-daemon-pl \
locale-pantheon-bluetooth-daemon-pt \
locale-pantheon-bluetooth-daemon-pt-BR \
locale-pantheon-bluetooth-daemon-ro \
locale-pantheon-bluetooth-daemon-ru \
locale-pantheon-bluetooth-daemon-si \
locale-pantheon-bluetooth-daemon-sk \
locale-pantheon-bluetooth-daemon-sl \
locale-pantheon-bluetooth-daemon-sq \
locale-pantheon-bluetooth-daemon-sr \
locale-pantheon-bluetooth-daemon-sr@latin \
locale-pantheon-bluetooth-daemon-sv \
locale-pantheon-bluetooth-daemon-ta \
locale-pantheon-bluetooth-daemon-te \
locale-pantheon-bluetooth-daemon-th \
locale-pantheon-bluetooth-daemon-tr \
locale-pantheon-bluetooth-daemon-ug \
locale-pantheon-bluetooth-daemon-uk \
locale-pantheon-bluetooth-daemon-vi \
locale-pantheon-bluetooth-daemon-wa \
locale-pantheon-bluetooth-daemon-zh \
locale-pantheon-bluetooth-daemon-zh-CN \
locale-pantheon-bluetooth-daemon-zh-HK \
locale-pantheon-bluetooth-daemon-zh-TW \
pantheon-bluetooth-daemon-lang \
pantheon-bluetooth-daemon-lang-all"

RDEPENDS:${PN} += "pantheon-bluetooth-daemon"

inherit rpm
