SUMMARY = "Translations for package maliit-keyboard"
DESCRIPTION = "Provides translations for the 'maliit-keyboard' package."
LICENSE = "BSD-3-Clause & LGPL-3.0-only & CC-BY-3.0"

PV = "2.3.1"

RPM_NAME = "maliit-keyboard-lang-2.3.1-3.10.noarch.rpm"
RPM_HASH = "eab4b43a274f963415c47fb610f186ab35113e5de973ac47e47341fff71a9577ced88205af209a93ef7e247cb5a6af338dd7d1ee5fa2754d97448d46f3377617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-maliit-keyboard-af \
locale-maliit-keyboard-ar \
locale-maliit-keyboard-ast \
locale-maliit-keyboard-az \
locale-maliit-keyboard-be \
locale-maliit-keyboard-bg \
locale-maliit-keyboard-bn \
locale-maliit-keyboard-br \
locale-maliit-keyboard-bs \
locale-maliit-keyboard-ca \
locale-maliit-keyboard-cs \
locale-maliit-keyboard-cy \
locale-maliit-keyboard-da \
locale-maliit-keyboard-de \
locale-maliit-keyboard-el \
locale-maliit-keyboard-en-AU \
locale-maliit-keyboard-en-GB \
locale-maliit-keyboard-eo \
locale-maliit-keyboard-es \
locale-maliit-keyboard-et \
locale-maliit-keyboard-eu \
locale-maliit-keyboard-fa \
locale-maliit-keyboard-fi \
locale-maliit-keyboard-fr \
locale-maliit-keyboard-fr-CA \
locale-maliit-keyboard-fr-CH \
locale-maliit-keyboard-gd \
locale-maliit-keyboard-gl \
locale-maliit-keyboard-he \
locale-maliit-keyboard-hr \
locale-maliit-keyboard-hu \
locale-maliit-keyboard-ia \
locale-maliit-keyboard-id \
locale-maliit-keyboard-it \
locale-maliit-keyboard-ja \
locale-maliit-keyboard-ka \
locale-maliit-keyboard-kk \
locale-maliit-keyboard-km \
locale-maliit-keyboard-kn \
locale-maliit-keyboard-ko \
locale-maliit-keyboard-lt \
locale-maliit-keyboard-lv \
locale-maliit-keyboard-mr \
locale-maliit-keyboard-ms \
locale-maliit-keyboard-nb \
locale-maliit-keyboard-ne \
locale-maliit-keyboard-nl \
locale-maliit-keyboard-oc \
locale-maliit-keyboard-pa \
locale-maliit-keyboard-pl \
locale-maliit-keyboard-pt \
locale-maliit-keyboard-pt-BR \
locale-maliit-keyboard-ro \
locale-maliit-keyboard-ru \
locale-maliit-keyboard-si \
locale-maliit-keyboard-sk \
locale-maliit-keyboard-sl \
locale-maliit-keyboard-sq \
locale-maliit-keyboard-sr \
locale-maliit-keyboard-sv \
locale-maliit-keyboard-ta \
locale-maliit-keyboard-th \
locale-maliit-keyboard-tr \
locale-maliit-keyboard-ug \
locale-maliit-keyboard-uk \
locale-maliit-keyboard-vi \
locale-maliit-keyboard-zh-CN \
locale-maliit-keyboard-zh-HK \
locale-maliit-keyboard-zh-TW \
maliit-keyboard-lang \
maliit-keyboard-lang-all"

RDEPENDS:${PN} += "maliit-keyboard"

inherit rpm
