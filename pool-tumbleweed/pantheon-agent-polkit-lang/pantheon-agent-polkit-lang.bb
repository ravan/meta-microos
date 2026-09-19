SUMMARY = "Translations for package pantheon-agent-polkit"
DESCRIPTION = "Provides translations for the 'pantheon-agent-polkit' package."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-agent-polkit-lang-8.1.0-1.1.noarch.rpm"
RPM_HASH = "875ad59f1aa77c93bde352743689c005693b5544cc34385e8d4302132024baa527e634f3d86b305f73fbb218b6f67297bc8e6b6e18516eae80e2b86fcc98e0aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-agent-polkit-af \
locale-pantheon-agent-polkit-ar \
locale-pantheon-agent-polkit-as \
locale-pantheon-agent-polkit-ast \
locale-pantheon-agent-polkit-az \
locale-pantheon-agent-polkit-be \
locale-pantheon-agent-polkit-bg \
locale-pantheon-agent-polkit-bn \
locale-pantheon-agent-polkit-br \
locale-pantheon-agent-polkit-bs \
locale-pantheon-agent-polkit-ca \
locale-pantheon-agent-polkit-ca@valencia \
locale-pantheon-agent-polkit-cs \
locale-pantheon-agent-polkit-cy \
locale-pantheon-agent-polkit-da \
locale-pantheon-agent-polkit-de \
locale-pantheon-agent-polkit-dz \
locale-pantheon-agent-polkit-el \
locale-pantheon-agent-polkit-en-AU \
locale-pantheon-agent-polkit-en-CA \
locale-pantheon-agent-polkit-en-GB \
locale-pantheon-agent-polkit-eo \
locale-pantheon-agent-polkit-es \
locale-pantheon-agent-polkit-et \
locale-pantheon-agent-polkit-eu \
locale-pantheon-agent-polkit-fa \
locale-pantheon-agent-polkit-fi \
locale-pantheon-agent-polkit-fr \
locale-pantheon-agent-polkit-fr-CA \
locale-pantheon-agent-polkit-ga \
locale-pantheon-agent-polkit-gd \
locale-pantheon-agent-polkit-gl \
locale-pantheon-agent-polkit-gu \
locale-pantheon-agent-polkit-he \
locale-pantheon-agent-polkit-hi \
locale-pantheon-agent-polkit-hr \
locale-pantheon-agent-polkit-hu \
locale-pantheon-agent-polkit-ia \
locale-pantheon-agent-polkit-id \
locale-pantheon-agent-polkit-is \
locale-pantheon-agent-polkit-it \
locale-pantheon-agent-polkit-ja \
locale-pantheon-agent-polkit-ka \
locale-pantheon-agent-polkit-kk \
locale-pantheon-agent-polkit-km \
locale-pantheon-agent-polkit-kn \
locale-pantheon-agent-polkit-ko \
locale-pantheon-agent-polkit-lt \
locale-pantheon-agent-polkit-lv \
locale-pantheon-agent-polkit-mk \
locale-pantheon-agent-polkit-ml \
locale-pantheon-agent-polkit-mr \
locale-pantheon-agent-polkit-ms \
locale-pantheon-agent-polkit-nb \
locale-pantheon-agent-polkit-ne \
locale-pantheon-agent-polkit-nl \
locale-pantheon-agent-polkit-nn \
locale-pantheon-agent-polkit-oc \
locale-pantheon-agent-polkit-or \
locale-pantheon-agent-polkit-pa \
locale-pantheon-agent-polkit-pl \
locale-pantheon-agent-polkit-pt \
locale-pantheon-agent-polkit-pt-BR \
locale-pantheon-agent-polkit-ro \
locale-pantheon-agent-polkit-ru \
locale-pantheon-agent-polkit-si \
locale-pantheon-agent-polkit-sk \
locale-pantheon-agent-polkit-sl \
locale-pantheon-agent-polkit-sq \
locale-pantheon-agent-polkit-sr \
locale-pantheon-agent-polkit-sr@latin \
locale-pantheon-agent-polkit-sv \
locale-pantheon-agent-polkit-ta \
locale-pantheon-agent-polkit-te \
locale-pantheon-agent-polkit-th \
locale-pantheon-agent-polkit-tr \
locale-pantheon-agent-polkit-ug \
locale-pantheon-agent-polkit-uk \
locale-pantheon-agent-polkit-vi \
locale-pantheon-agent-polkit-wa \
locale-pantheon-agent-polkit-zh \
locale-pantheon-agent-polkit-zh-CN \
locale-pantheon-agent-polkit-zh-HK \
locale-pantheon-agent-polkit-zh-TW \
pantheon-agent-polkit-lang \
pantheon-agent-polkit-lang-all"

RDEPENDS:${PN} += "pantheon-agent-polkit"

inherit rpm
