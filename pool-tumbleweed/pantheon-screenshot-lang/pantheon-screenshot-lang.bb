SUMMARY = "Translations for package pantheon-screenshot"
DESCRIPTION = "Provides translations for the 'pantheon-screenshot' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.4"

RPM_NAME = "pantheon-screenshot-lang-8.0.4-1.4.noarch.rpm"
RPM_HASH = "9b99262d8e5df7ec86708c84a85ccd227e94b85f4e7c7dce4ef0b5bcc09a5840c0b1c0f1f09514e96b7171103f83718c4c542e4ae8875108107c2555d59d07b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-screenshot-af \
locale-pantheon-screenshot-ar \
locale-pantheon-screenshot-as \
locale-pantheon-screenshot-ast \
locale-pantheon-screenshot-az \
locale-pantheon-screenshot-be \
locale-pantheon-screenshot-bg \
locale-pantheon-screenshot-bn \
locale-pantheon-screenshot-br \
locale-pantheon-screenshot-bs \
locale-pantheon-screenshot-ca \
locale-pantheon-screenshot-cs \
locale-pantheon-screenshot-cy \
locale-pantheon-screenshot-da \
locale-pantheon-screenshot-de \
locale-pantheon-screenshot-dz \
locale-pantheon-screenshot-el \
locale-pantheon-screenshot-en-AU \
locale-pantheon-screenshot-en-CA \
locale-pantheon-screenshot-en-GB \
locale-pantheon-screenshot-eo \
locale-pantheon-screenshot-es \
locale-pantheon-screenshot-et \
locale-pantheon-screenshot-eu \
locale-pantheon-screenshot-fa \
locale-pantheon-screenshot-fi \
locale-pantheon-screenshot-fr \
locale-pantheon-screenshot-fr-CA \
locale-pantheon-screenshot-ga \
locale-pantheon-screenshot-gd \
locale-pantheon-screenshot-gl \
locale-pantheon-screenshot-gu \
locale-pantheon-screenshot-he \
locale-pantheon-screenshot-hi \
locale-pantheon-screenshot-hr \
locale-pantheon-screenshot-hu \
locale-pantheon-screenshot-ia \
locale-pantheon-screenshot-id \
locale-pantheon-screenshot-is \
locale-pantheon-screenshot-it \
locale-pantheon-screenshot-ja \
locale-pantheon-screenshot-ka \
locale-pantheon-screenshot-kk \
locale-pantheon-screenshot-km \
locale-pantheon-screenshot-kn \
locale-pantheon-screenshot-ko \
locale-pantheon-screenshot-lt \
locale-pantheon-screenshot-lv \
locale-pantheon-screenshot-mk \
locale-pantheon-screenshot-ml \
locale-pantheon-screenshot-mr \
locale-pantheon-screenshot-ms \
locale-pantheon-screenshot-nb \
locale-pantheon-screenshot-ne \
locale-pantheon-screenshot-nl \
locale-pantheon-screenshot-nn \
locale-pantheon-screenshot-oc \
locale-pantheon-screenshot-or \
locale-pantheon-screenshot-pa \
locale-pantheon-screenshot-pl \
locale-pantheon-screenshot-pt \
locale-pantheon-screenshot-pt-BR \
locale-pantheon-screenshot-ro \
locale-pantheon-screenshot-ru \
locale-pantheon-screenshot-si \
locale-pantheon-screenshot-sk \
locale-pantheon-screenshot-sl \
locale-pantheon-screenshot-sq \
locale-pantheon-screenshot-sr \
locale-pantheon-screenshot-sv \
locale-pantheon-screenshot-ta \
locale-pantheon-screenshot-te \
locale-pantheon-screenshot-th \
locale-pantheon-screenshot-tr \
locale-pantheon-screenshot-ug \
locale-pantheon-screenshot-uk \
locale-pantheon-screenshot-vi \
locale-pantheon-screenshot-wa \
locale-pantheon-screenshot-zh \
locale-pantheon-screenshot-zh-CN \
locale-pantheon-screenshot-zh-TW \
pantheon-screenshot-lang \
pantheon-screenshot-lang-all"

RDEPENDS:${PN} += "pantheon-screenshot"

inherit rpm
