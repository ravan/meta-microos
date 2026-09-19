SUMMARY = "Translations for package evince"
DESCRIPTION = "Provides translations for the 'evince' package."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-lang-48.4-2.1.noarch.rpm"
RPM_HASH = "75e01cb6acd64c915bde11bc52d80acbcb55fd53e68c762014b630a4b68a2ea8b73bb98ac771e7bac49b3aad26811da24ddb9247770370515497953f41a2c666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "evince-lang \
evince-lang-all \
locale-evince-af \
locale-evince-ar \
locale-evince-as \
locale-evince-ast \
locale-evince-be \
locale-evince-be@latin \
locale-evince-bg \
locale-evince-bn \
locale-evince-bn-IN \
locale-evince-br \
locale-evince-bs \
locale-evince-ca \
locale-evince-ca@valencia \
locale-evince-cs \
locale-evince-cy \
locale-evince-da \
locale-evince-de \
locale-evince-dz \
locale-evince-el \
locale-evince-en-CA \
locale-evince-en-GB \
locale-evince-en@shaw \
locale-evince-eo \
locale-evince-es \
locale-evince-et \
locale-evince-eu \
locale-evince-fa \
locale-evince-fi \
locale-evince-fr \
locale-evince-fur \
locale-evince-ga \
locale-evince-gd \
locale-evince-gl \
locale-evince-gu \
locale-evince-he \
locale-evince-hi \
locale-evince-hr \
locale-evince-hu \
locale-evince-id \
locale-evince-is \
locale-evince-it \
locale-evince-ja \
locale-evince-ka \
locale-evince-kk \
locale-evince-km \
locale-evince-kn \
locale-evince-ko \
locale-evince-lt \
locale-evince-lv \
locale-evince-mai \
locale-evince-mk \
locale-evince-ml \
locale-evince-mr \
locale-evince-ms \
locale-evince-nb \
locale-evince-nds \
locale-evince-ne \
locale-evince-nl \
locale-evince-nn \
locale-evince-oc \
locale-evince-or \
locale-evince-pa \
locale-evince-pl \
locale-evince-pt \
locale-evince-pt-BR \
locale-evince-ro \
locale-evince-ru \
locale-evince-si \
locale-evince-sk \
locale-evince-sl \
locale-evince-sq \
locale-evince-sr \
locale-evince-sr@latin \
locale-evince-sv \
locale-evince-ta \
locale-evince-te \
locale-evince-th \
locale-evince-tr \
locale-evince-ug \
locale-evince-uk \
locale-evince-vi \
locale-evince-wa \
locale-evince-zh-CN \
locale-evince-zh-HK \
locale-evince-zh-TW"

RDEPENDS:${PN} += "evince"

inherit rpm
