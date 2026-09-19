SUMMARY = "Translations for package pantheon-tasks"
DESCRIPTION = "Provides translations for the 'pantheon-tasks' package."
LICENSE = "GPL-3.0-or-later"

PV = "6.3.3"

RPM_NAME = "pantheon-tasks-lang-6.3.3-2.3.noarch.rpm"
RPM_HASH = "e73bfb7d6bd4eae07116e8f5402236de6ba828c9b2ee91e19a50dc68e21c6baf3775b8141be171665c2ab8a1cb18752b0c6a854bf123ebcc27f5f24ee85ea7e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-tasks-af \
locale-pantheon-tasks-ar \
locale-pantheon-tasks-as \
locale-pantheon-tasks-ast \
locale-pantheon-tasks-az \
locale-pantheon-tasks-be \
locale-pantheon-tasks-bg \
locale-pantheon-tasks-bn \
locale-pantheon-tasks-br \
locale-pantheon-tasks-bs \
locale-pantheon-tasks-ca \
locale-pantheon-tasks-cs \
locale-pantheon-tasks-cy \
locale-pantheon-tasks-da \
locale-pantheon-tasks-de \
locale-pantheon-tasks-dz \
locale-pantheon-tasks-el \
locale-pantheon-tasks-en-AU \
locale-pantheon-tasks-en-CA \
locale-pantheon-tasks-en-GB \
locale-pantheon-tasks-eo \
locale-pantheon-tasks-es \
locale-pantheon-tasks-et \
locale-pantheon-tasks-eu \
locale-pantheon-tasks-fa \
locale-pantheon-tasks-fi \
locale-pantheon-tasks-fr \
locale-pantheon-tasks-fr-CA \
locale-pantheon-tasks-ga \
locale-pantheon-tasks-gd \
locale-pantheon-tasks-gl \
locale-pantheon-tasks-gu \
locale-pantheon-tasks-he \
locale-pantheon-tasks-hi \
locale-pantheon-tasks-hr \
locale-pantheon-tasks-hu \
locale-pantheon-tasks-ia \
locale-pantheon-tasks-id \
locale-pantheon-tasks-is \
locale-pantheon-tasks-it \
locale-pantheon-tasks-ja \
locale-pantheon-tasks-ka \
locale-pantheon-tasks-kk \
locale-pantheon-tasks-km \
locale-pantheon-tasks-kn \
locale-pantheon-tasks-ko \
locale-pantheon-tasks-lt \
locale-pantheon-tasks-lv \
locale-pantheon-tasks-mk \
locale-pantheon-tasks-ml \
locale-pantheon-tasks-mr \
locale-pantheon-tasks-ms \
locale-pantheon-tasks-nb \
locale-pantheon-tasks-ne \
locale-pantheon-tasks-nl \
locale-pantheon-tasks-nn \
locale-pantheon-tasks-oc \
locale-pantheon-tasks-or \
locale-pantheon-tasks-pa \
locale-pantheon-tasks-pl \
locale-pantheon-tasks-pt \
locale-pantheon-tasks-pt-BR \
locale-pantheon-tasks-ro \
locale-pantheon-tasks-ru \
locale-pantheon-tasks-si \
locale-pantheon-tasks-sk \
locale-pantheon-tasks-sl \
locale-pantheon-tasks-sq \
locale-pantheon-tasks-sr \
locale-pantheon-tasks-sv \
locale-pantheon-tasks-ta \
locale-pantheon-tasks-te \
locale-pantheon-tasks-th \
locale-pantheon-tasks-tr \
locale-pantheon-tasks-ug \
locale-pantheon-tasks-uk \
locale-pantheon-tasks-vi \
locale-pantheon-tasks-wa \
locale-pantheon-tasks-zh \
locale-pantheon-tasks-zh-CN \
locale-pantheon-tasks-zh-HK \
locale-pantheon-tasks-zh-TW \
pantheon-tasks-lang \
pantheon-tasks-lang-all"

RDEPENDS:${PN} += "pantheon-tasks"

inherit rpm
