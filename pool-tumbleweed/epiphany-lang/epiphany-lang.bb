SUMMARY = "Translations for package epiphany"
DESCRIPTION = "Provides translations for the 'epiphany' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.6"

RPM_NAME = "epiphany-lang-50.6-2.1.noarch.rpm"
RPM_HASH = "7bd8c8994f5a527e4b9f35e392df9a20ad21ada27d49722d29c1b7736c039aebd1bbf41a8d0fdab34c0489e934230608e1d5bd02b08a929d398fdcb40953d6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "epiphany-lang \
epiphany-lang-all \
locale-epiphany-af \
locale-epiphany-ar \
locale-epiphany-as \
locale-epiphany-ast \
locale-epiphany-az \
locale-epiphany-be \
locale-epiphany-be@latin \
locale-epiphany-bg \
locale-epiphany-bn \
locale-epiphany-bn-IN \
locale-epiphany-br \
locale-epiphany-bs \
locale-epiphany-ca \
locale-epiphany-ca@valencia \
locale-epiphany-cs \
locale-epiphany-cy \
locale-epiphany-da \
locale-epiphany-de \
locale-epiphany-dz \
locale-epiphany-el \
locale-epiphany-en-CA \
locale-epiphany-en-GB \
locale-epiphany-en@shaw \
locale-epiphany-eo \
locale-epiphany-es \
locale-epiphany-et \
locale-epiphany-eu \
locale-epiphany-fa \
locale-epiphany-fi \
locale-epiphany-fr \
locale-epiphany-fur \
locale-epiphany-ga \
locale-epiphany-gl \
locale-epiphany-gu \
locale-epiphany-he \
locale-epiphany-hi \
locale-epiphany-hr \
locale-epiphany-hu \
locale-epiphany-ia \
locale-epiphany-id \
locale-epiphany-is \
locale-epiphany-it \
locale-epiphany-ja \
locale-epiphany-ka \
locale-epiphany-kk \
locale-epiphany-km \
locale-epiphany-kn \
locale-epiphany-ko \
locale-epiphany-lt \
locale-epiphany-lv \
locale-epiphany-mai \
locale-epiphany-mk \
locale-epiphany-ml \
locale-epiphany-mr \
locale-epiphany-ms \
locale-epiphany-nb \
locale-epiphany-nds \
locale-epiphany-ne \
locale-epiphany-nl \
locale-epiphany-nn \
locale-epiphany-oc \
locale-epiphany-or \
locale-epiphany-pa \
locale-epiphany-pl \
locale-epiphany-pt \
locale-epiphany-pt-BR \
locale-epiphany-ro \
locale-epiphany-ru \
locale-epiphany-si \
locale-epiphany-sk \
locale-epiphany-sl \
locale-epiphany-sq \
locale-epiphany-sr \
locale-epiphany-sr@latin \
locale-epiphany-sv \
locale-epiphany-ta \
locale-epiphany-te \
locale-epiphany-th \
locale-epiphany-tr \
locale-epiphany-ug \
locale-epiphany-uk \
locale-epiphany-vi \
locale-epiphany-wa \
locale-epiphany-zh-CN \
locale-epiphany-zh-HK \
locale-epiphany-zh-TW"

RDEPENDS:${PN} += "epiphany"

inherit rpm
