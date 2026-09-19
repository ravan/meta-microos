SUMMARY = "Translations for package pantheon-code"
DESCRIPTION = "Provides translations for the 'pantheon-code' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.2"

RPM_NAME = "pantheon-code-lang-8.3.2-1.1.noarch.rpm"
RPM_HASH = "927d4deaaea869e62ef37c0247ade0e66520652e98324b51acc53b25e9c73a2dd95e16d7a256121ffc1f8b274bfb90a6c1c8f147ba7a944be56ad2d3d85b5966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-code-af \
locale-pantheon-code-ar \
locale-pantheon-code-as \
locale-pantheon-code-ast \
locale-pantheon-code-az \
locale-pantheon-code-be \
locale-pantheon-code-bg \
locale-pantheon-code-bn \
locale-pantheon-code-br \
locale-pantheon-code-bs \
locale-pantheon-code-ca \
locale-pantheon-code-ca@valencia \
locale-pantheon-code-cs \
locale-pantheon-code-cy \
locale-pantheon-code-da \
locale-pantheon-code-de \
locale-pantheon-code-dz \
locale-pantheon-code-el \
locale-pantheon-code-en-AU \
locale-pantheon-code-en-CA \
locale-pantheon-code-en-GB \
locale-pantheon-code-eo \
locale-pantheon-code-es \
locale-pantheon-code-et \
locale-pantheon-code-eu \
locale-pantheon-code-fa \
locale-pantheon-code-fi \
locale-pantheon-code-fr \
locale-pantheon-code-fr-CA \
locale-pantheon-code-ga \
locale-pantheon-code-gd \
locale-pantheon-code-gl \
locale-pantheon-code-gu \
locale-pantheon-code-he \
locale-pantheon-code-hi \
locale-pantheon-code-hr \
locale-pantheon-code-hu \
locale-pantheon-code-ia \
locale-pantheon-code-id \
locale-pantheon-code-is \
locale-pantheon-code-it \
locale-pantheon-code-ja \
locale-pantheon-code-ka \
locale-pantheon-code-kk \
locale-pantheon-code-km \
locale-pantheon-code-kn \
locale-pantheon-code-ko \
locale-pantheon-code-lt \
locale-pantheon-code-lv \
locale-pantheon-code-mk \
locale-pantheon-code-ml \
locale-pantheon-code-mr \
locale-pantheon-code-ms \
locale-pantheon-code-nb \
locale-pantheon-code-ne \
locale-pantheon-code-nl \
locale-pantheon-code-nn \
locale-pantheon-code-oc \
locale-pantheon-code-or \
locale-pantheon-code-pa \
locale-pantheon-code-pl \
locale-pantheon-code-pt \
locale-pantheon-code-pt-BR \
locale-pantheon-code-ro \
locale-pantheon-code-ru \
locale-pantheon-code-si \
locale-pantheon-code-sk \
locale-pantheon-code-sl \
locale-pantheon-code-sq \
locale-pantheon-code-sr \
locale-pantheon-code-sv \
locale-pantheon-code-ta \
locale-pantheon-code-te \
locale-pantheon-code-th \
locale-pantheon-code-tr \
locale-pantheon-code-ug \
locale-pantheon-code-uk \
locale-pantheon-code-vi \
locale-pantheon-code-wa \
locale-pantheon-code-zh \
locale-pantheon-code-zh-CN \
locale-pantheon-code-zh-HK \
locale-pantheon-code-zh-Hant \
locale-pantheon-code-zh-TW \
pantheon-code-lang \
pantheon-code-lang-all"

RDEPENDS:${PN} += "pantheon-code"

inherit rpm
