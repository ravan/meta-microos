SUMMARY = "Translations for package pantheon-terminal"
DESCRIPTION = "Provides translations for the 'pantheon-terminal' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-terminal-lang-8.1.0-1.1.noarch.rpm"
RPM_HASH = "d93e53019835e33b637ccf76c27d6a4ed586370b7afc828175526fc00b3dbdb1ade390be9ec869f88edd7a4735387a63e8284ac1df7a1ed76935c9602ffb93e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-terminal-af \
locale-pantheon-terminal-ar \
locale-pantheon-terminal-as \
locale-pantheon-terminal-ast \
locale-pantheon-terminal-az \
locale-pantheon-terminal-be \
locale-pantheon-terminal-bg \
locale-pantheon-terminal-bn \
locale-pantheon-terminal-br \
locale-pantheon-terminal-bs \
locale-pantheon-terminal-ca \
locale-pantheon-terminal-cs \
locale-pantheon-terminal-cy \
locale-pantheon-terminal-da \
locale-pantheon-terminal-de \
locale-pantheon-terminal-dz \
locale-pantheon-terminal-el \
locale-pantheon-terminal-en-AU \
locale-pantheon-terminal-en-CA \
locale-pantheon-terminal-en-GB \
locale-pantheon-terminal-eo \
locale-pantheon-terminal-es \
locale-pantheon-terminal-et \
locale-pantheon-terminal-eu \
locale-pantheon-terminal-fa \
locale-pantheon-terminal-fi \
locale-pantheon-terminal-fr \
locale-pantheon-terminal-fr-CA \
locale-pantheon-terminal-ga \
locale-pantheon-terminal-gd \
locale-pantheon-terminal-gl \
locale-pantheon-terminal-gu \
locale-pantheon-terminal-he \
locale-pantheon-terminal-hi \
locale-pantheon-terminal-hr \
locale-pantheon-terminal-hu \
locale-pantheon-terminal-ia \
locale-pantheon-terminal-id \
locale-pantheon-terminal-is \
locale-pantheon-terminal-it \
locale-pantheon-terminal-ja \
locale-pantheon-terminal-ka \
locale-pantheon-terminal-kk \
locale-pantheon-terminal-km \
locale-pantheon-terminal-kn \
locale-pantheon-terminal-ko \
locale-pantheon-terminal-lt \
locale-pantheon-terminal-lv \
locale-pantheon-terminal-mk \
locale-pantheon-terminal-ml \
locale-pantheon-terminal-mr \
locale-pantheon-terminal-ms \
locale-pantheon-terminal-nb \
locale-pantheon-terminal-ne \
locale-pantheon-terminal-nl \
locale-pantheon-terminal-nn \
locale-pantheon-terminal-oc \
locale-pantheon-terminal-or \
locale-pantheon-terminal-pa \
locale-pantheon-terminal-pl \
locale-pantheon-terminal-pt \
locale-pantheon-terminal-pt-BR \
locale-pantheon-terminal-ro \
locale-pantheon-terminal-ru \
locale-pantheon-terminal-si \
locale-pantheon-terminal-sk \
locale-pantheon-terminal-sl \
locale-pantheon-terminal-sq \
locale-pantheon-terminal-sr \
locale-pantheon-terminal-sv \
locale-pantheon-terminal-ta \
locale-pantheon-terminal-te \
locale-pantheon-terminal-th \
locale-pantheon-terminal-tr \
locale-pantheon-terminal-ug \
locale-pantheon-terminal-uk \
locale-pantheon-terminal-vi \
locale-pantheon-terminal-wa \
locale-pantheon-terminal-zh \
locale-pantheon-terminal-zh-CN \
locale-pantheon-terminal-zh-TW \
pantheon-terminal-lang \
pantheon-terminal-lang-all"

RDEPENDS:${PN} += "pantheon-terminal"

inherit rpm
