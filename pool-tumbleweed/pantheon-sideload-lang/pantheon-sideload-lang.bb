SUMMARY = "Translations for package pantheon-sideload"
DESCRIPTION = "Provides translations for the 'pantheon-sideload' package."
LICENSE = "GPL-3.0-or-later"

PV = "6.3.1"

RPM_NAME = "pantheon-sideload-lang-6.3.1-1.4.noarch.rpm"
RPM_HASH = "5dafe3098a5deff18e26fcccb41dbfa4da623e7626a30869e7a64a8484acecb9f07a7483a41db308c9baee268daf263e97d37a1fe6e165c9b5a38422609deedb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-sideload-af \
locale-pantheon-sideload-ar \
locale-pantheon-sideload-as \
locale-pantheon-sideload-ast \
locale-pantheon-sideload-az \
locale-pantheon-sideload-be \
locale-pantheon-sideload-bg \
locale-pantheon-sideload-bn \
locale-pantheon-sideload-br \
locale-pantheon-sideload-bs \
locale-pantheon-sideload-ca \
locale-pantheon-sideload-ca@valencia \
locale-pantheon-sideload-cs \
locale-pantheon-sideload-cy \
locale-pantheon-sideload-da \
locale-pantheon-sideload-de \
locale-pantheon-sideload-dz \
locale-pantheon-sideload-el \
locale-pantheon-sideload-en-AU \
locale-pantheon-sideload-en-CA \
locale-pantheon-sideload-en-GB \
locale-pantheon-sideload-eo \
locale-pantheon-sideload-es \
locale-pantheon-sideload-et \
locale-pantheon-sideload-eu \
locale-pantheon-sideload-fa \
locale-pantheon-sideload-fi \
locale-pantheon-sideload-fr \
locale-pantheon-sideload-fr-CA \
locale-pantheon-sideload-ga \
locale-pantheon-sideload-gd \
locale-pantheon-sideload-gl \
locale-pantheon-sideload-gu \
locale-pantheon-sideload-he \
locale-pantheon-sideload-hi \
locale-pantheon-sideload-hr \
locale-pantheon-sideload-hu \
locale-pantheon-sideload-ia \
locale-pantheon-sideload-id \
locale-pantheon-sideload-is \
locale-pantheon-sideload-it \
locale-pantheon-sideload-ja \
locale-pantheon-sideload-ka \
locale-pantheon-sideload-kk \
locale-pantheon-sideload-km \
locale-pantheon-sideload-kn \
locale-pantheon-sideload-ko \
locale-pantheon-sideload-lt \
locale-pantheon-sideload-lv \
locale-pantheon-sideload-mk \
locale-pantheon-sideload-ml \
locale-pantheon-sideload-mr \
locale-pantheon-sideload-ms \
locale-pantheon-sideload-nb \
locale-pantheon-sideload-ne \
locale-pantheon-sideload-nl \
locale-pantheon-sideload-nn \
locale-pantheon-sideload-oc \
locale-pantheon-sideload-or \
locale-pantheon-sideload-pa \
locale-pantheon-sideload-pl \
locale-pantheon-sideload-pt \
locale-pantheon-sideload-pt-BR \
locale-pantheon-sideload-ro \
locale-pantheon-sideload-ru \
locale-pantheon-sideload-si \
locale-pantheon-sideload-sk \
locale-pantheon-sideload-sl \
locale-pantheon-sideload-sq \
locale-pantheon-sideload-sr \
locale-pantheon-sideload-sr@latin \
locale-pantheon-sideload-sv \
locale-pantheon-sideload-ta \
locale-pantheon-sideload-te \
locale-pantheon-sideload-th \
locale-pantheon-sideload-tr \
locale-pantheon-sideload-ug \
locale-pantheon-sideload-uk \
locale-pantheon-sideload-vi \
locale-pantheon-sideload-wa \
locale-pantheon-sideload-zh \
locale-pantheon-sideload-zh-CN \
locale-pantheon-sideload-zh-HK \
locale-pantheon-sideload-zh-TW \
pantheon-sideload-lang \
pantheon-sideload-lang-all"

RDEPENDS:${PN} += "pantheon-sideload"

inherit rpm
