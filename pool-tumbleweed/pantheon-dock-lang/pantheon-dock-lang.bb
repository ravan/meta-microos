SUMMARY = "Translations for package pantheon-dock"
DESCRIPTION = "Provides translations for the 'pantheon-dock' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.3"

RPM_NAME = "pantheon-dock-lang-8.3.3-1.2.noarch.rpm"
RPM_HASH = "ff9091285725d58eb1fc941809d8b25b08741c18761642422b0da297d0ae433c5b18f5ee3ba25c9dfc2b1068357a36c353989d5bc7a5c92318ce5ad496d80548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-dock-af \
locale-pantheon-dock-ar \
locale-pantheon-dock-as \
locale-pantheon-dock-ast \
locale-pantheon-dock-az \
locale-pantheon-dock-be \
locale-pantheon-dock-bg \
locale-pantheon-dock-bn \
locale-pantheon-dock-br \
locale-pantheon-dock-bs \
locale-pantheon-dock-ca \
locale-pantheon-dock-ca@valencia \
locale-pantheon-dock-cs \
locale-pantheon-dock-cy \
locale-pantheon-dock-da \
locale-pantheon-dock-de \
locale-pantheon-dock-dz \
locale-pantheon-dock-el \
locale-pantheon-dock-en-AU \
locale-pantheon-dock-en-CA \
locale-pantheon-dock-en-GB \
locale-pantheon-dock-eo \
locale-pantheon-dock-es \
locale-pantheon-dock-et \
locale-pantheon-dock-eu \
locale-pantheon-dock-fa \
locale-pantheon-dock-fi \
locale-pantheon-dock-fr \
locale-pantheon-dock-fr-CA \
locale-pantheon-dock-ga \
locale-pantheon-dock-gd \
locale-pantheon-dock-gl \
locale-pantheon-dock-gu \
locale-pantheon-dock-he \
locale-pantheon-dock-hi \
locale-pantheon-dock-hr \
locale-pantheon-dock-hu \
locale-pantheon-dock-ia \
locale-pantheon-dock-id \
locale-pantheon-dock-is \
locale-pantheon-dock-it \
locale-pantheon-dock-ja \
locale-pantheon-dock-ka \
locale-pantheon-dock-kk \
locale-pantheon-dock-km \
locale-pantheon-dock-kn \
locale-pantheon-dock-ko \
locale-pantheon-dock-lt \
locale-pantheon-dock-lv \
locale-pantheon-dock-mk \
locale-pantheon-dock-ml \
locale-pantheon-dock-mr \
locale-pantheon-dock-ms \
locale-pantheon-dock-nb \
locale-pantheon-dock-ne \
locale-pantheon-dock-nl \
locale-pantheon-dock-nn \
locale-pantheon-dock-oc \
locale-pantheon-dock-or \
locale-pantheon-dock-pa \
locale-pantheon-dock-pl \
locale-pantheon-dock-pt \
locale-pantheon-dock-pt-BR \
locale-pantheon-dock-ro \
locale-pantheon-dock-ru \
locale-pantheon-dock-si \
locale-pantheon-dock-sk \
locale-pantheon-dock-sl \
locale-pantheon-dock-sq \
locale-pantheon-dock-sr \
locale-pantheon-dock-sr@latin \
locale-pantheon-dock-sv \
locale-pantheon-dock-ta \
locale-pantheon-dock-te \
locale-pantheon-dock-th \
locale-pantheon-dock-tr \
locale-pantheon-dock-ug \
locale-pantheon-dock-uk \
locale-pantheon-dock-vi \
locale-pantheon-dock-wa \
locale-pantheon-dock-zh \
locale-pantheon-dock-zh-CN \
locale-pantheon-dock-zh-HK \
locale-pantheon-dock-zh-TW \
pantheon-dock-lang \
pantheon-dock-lang-all"

RDEPENDS:${PN} += "pantheon-dock"

inherit rpm
