SUMMARY = "Translations for package pantheon-photos"
DESCRIPTION = "Provides translations for the 'pantheon-photos' package."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-photos-lang-8.0.2-1.1.noarch.rpm"
RPM_HASH = "f490a068904502ed7d5b26f50e0bc6f7a1356e6ce6571717a306084a0d4c657b11cebccd993934ded1eb66d6dd15a7f2a27dc6d3a26afdf2cc95dff7e0b27fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-photos-af \
locale-pantheon-photos-ar \
locale-pantheon-photos-as \
locale-pantheon-photos-ast \
locale-pantheon-photos-az \
locale-pantheon-photos-be \
locale-pantheon-photos-bg \
locale-pantheon-photos-bn \
locale-pantheon-photos-bn-IN \
locale-pantheon-photos-br \
locale-pantheon-photos-bs \
locale-pantheon-photos-ca \
locale-pantheon-photos-cs \
locale-pantheon-photos-cy \
locale-pantheon-photos-da \
locale-pantheon-photos-de \
locale-pantheon-photos-dz \
locale-pantheon-photos-el \
locale-pantheon-photos-en-AU \
locale-pantheon-photos-en-CA \
locale-pantheon-photos-en-GB \
locale-pantheon-photos-eo \
locale-pantheon-photos-es \
locale-pantheon-photos-et \
locale-pantheon-photos-eu \
locale-pantheon-photos-fa \
locale-pantheon-photos-fi \
locale-pantheon-photos-fr \
locale-pantheon-photos-fr-CA \
locale-pantheon-photos-ga \
locale-pantheon-photos-gd \
locale-pantheon-photos-gl \
locale-pantheon-photos-gu \
locale-pantheon-photos-he \
locale-pantheon-photos-hi \
locale-pantheon-photos-hr \
locale-pantheon-photos-hu \
locale-pantheon-photos-ia \
locale-pantheon-photos-id \
locale-pantheon-photos-is \
locale-pantheon-photos-it \
locale-pantheon-photos-ja \
locale-pantheon-photos-ka \
locale-pantheon-photos-kk \
locale-pantheon-photos-km \
locale-pantheon-photos-kn \
locale-pantheon-photos-ko \
locale-pantheon-photos-lt \
locale-pantheon-photos-lv \
locale-pantheon-photos-mk \
locale-pantheon-photos-ml \
locale-pantheon-photos-mr \
locale-pantheon-photos-ms \
locale-pantheon-photos-nb \
locale-pantheon-photos-ne \
locale-pantheon-photos-nl \
locale-pantheon-photos-nn \
locale-pantheon-photos-oc \
locale-pantheon-photos-or \
locale-pantheon-photos-pa \
locale-pantheon-photos-pl \
locale-pantheon-photos-pt \
locale-pantheon-photos-pt-BR \
locale-pantheon-photos-ro \
locale-pantheon-photos-ru \
locale-pantheon-photos-si \
locale-pantheon-photos-sk \
locale-pantheon-photos-sl \
locale-pantheon-photos-sq \
locale-pantheon-photos-sr \
locale-pantheon-photos-sr@latin \
locale-pantheon-photos-sv \
locale-pantheon-photos-ta \
locale-pantheon-photos-te \
locale-pantheon-photos-th \
locale-pantheon-photos-tr \
locale-pantheon-photos-ug \
locale-pantheon-photos-uk \
locale-pantheon-photos-vi \
locale-pantheon-photos-wa \
locale-pantheon-photos-zh \
locale-pantheon-photos-zh-CN \
locale-pantheon-photos-zh-TW \
pantheon-photos-lang \
pantheon-photos-lang-all"

RDEPENDS:${PN} += "pantheon-photos"

inherit rpm
