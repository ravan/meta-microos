SUMMARY = "Translations for package pantheon-mail"
DESCRIPTION = "Provides translations for the 'pantheon-mail' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.0"

RPM_NAME = "pantheon-mail-lang-8.0.0-2.6.noarch.rpm"
RPM_HASH = "990b48f7c42f5abe3539dbbc49e73d0598e974d4e66bf50ee7f11b206a3e44ebcf92f365bbbdabe40465bfc0d0982596fc1872b0ad3f5a43a3145df36c674a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-mail-af \
locale-pantheon-mail-ar \
locale-pantheon-mail-as \
locale-pantheon-mail-ast \
locale-pantheon-mail-az \
locale-pantheon-mail-be \
locale-pantheon-mail-bg \
locale-pantheon-mail-bn \
locale-pantheon-mail-br \
locale-pantheon-mail-bs \
locale-pantheon-mail-ca \
locale-pantheon-mail-cs \
locale-pantheon-mail-cy \
locale-pantheon-mail-da \
locale-pantheon-mail-de \
locale-pantheon-mail-dz \
locale-pantheon-mail-el \
locale-pantheon-mail-en-AU \
locale-pantheon-mail-en-CA \
locale-pantheon-mail-en-GB \
locale-pantheon-mail-eo \
locale-pantheon-mail-es \
locale-pantheon-mail-et \
locale-pantheon-mail-eu \
locale-pantheon-mail-fa \
locale-pantheon-mail-fi \
locale-pantheon-mail-fr \
locale-pantheon-mail-fr-CA \
locale-pantheon-mail-ga \
locale-pantheon-mail-gd \
locale-pantheon-mail-gl \
locale-pantheon-mail-gu \
locale-pantheon-mail-he \
locale-pantheon-mail-hi \
locale-pantheon-mail-hr \
locale-pantheon-mail-hu \
locale-pantheon-mail-ia \
locale-pantheon-mail-id \
locale-pantheon-mail-is \
locale-pantheon-mail-it \
locale-pantheon-mail-ja \
locale-pantheon-mail-ka \
locale-pantheon-mail-kk \
locale-pantheon-mail-km \
locale-pantheon-mail-kn \
locale-pantheon-mail-ko \
locale-pantheon-mail-lt \
locale-pantheon-mail-lv \
locale-pantheon-mail-mk \
locale-pantheon-mail-ml \
locale-pantheon-mail-mr \
locale-pantheon-mail-ms \
locale-pantheon-mail-nb \
locale-pantheon-mail-ne \
locale-pantheon-mail-nl \
locale-pantheon-mail-nn \
locale-pantheon-mail-oc \
locale-pantheon-mail-or \
locale-pantheon-mail-pa \
locale-pantheon-mail-pl \
locale-pantheon-mail-pt \
locale-pantheon-mail-pt-BR \
locale-pantheon-mail-ro \
locale-pantheon-mail-ru \
locale-pantheon-mail-si \
locale-pantheon-mail-sk \
locale-pantheon-mail-sl \
locale-pantheon-mail-sq \
locale-pantheon-mail-sr \
locale-pantheon-mail-sr@latin \
locale-pantheon-mail-sv \
locale-pantheon-mail-ta \
locale-pantheon-mail-te \
locale-pantheon-mail-th \
locale-pantheon-mail-tr \
locale-pantheon-mail-ug \
locale-pantheon-mail-uk \
locale-pantheon-mail-vi \
locale-pantheon-mail-wa \
locale-pantheon-mail-zh \
locale-pantheon-mail-zh-CN \
locale-pantheon-mail-zh-HK \
locale-pantheon-mail-zh-TW \
pantheon-mail-lang \
pantheon-mail-lang-all"

RDEPENDS:${PN} += "pantheon-mail"

inherit rpm
