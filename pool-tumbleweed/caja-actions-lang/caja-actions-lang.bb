SUMMARY = "Translations for package caja-actions"
DESCRIPTION = "Provides translations for the 'caja-actions' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-actions-lang-1.28.0-1.10.noarch.rpm"
RPM_HASH = "e557c5f3f3d3ffcb1bb26deaaf6d26b449b624b5c84fc860ae9dbbf51e403416a0ccf7a17a06ac822923e4ecf2d90c01bccd4928dc1d3667ad5c4e7ea82577e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-actions-lang \
caja-actions-lang-all \
locale-caja-actions-af \
locale-caja-actions-ar \
locale-caja-actions-as \
locale-caja-actions-ast \
locale-caja-actions-az \
locale-caja-actions-be \
locale-caja-actions-bg \
locale-caja-actions-bn \
locale-caja-actions-bn-IN \
locale-caja-actions-br \
locale-caja-actions-bs \
locale-caja-actions-ca \
locale-caja-actions-ca@valencia \
locale-caja-actions-cs \
locale-caja-actions-cy \
locale-caja-actions-da \
locale-caja-actions-de \
locale-caja-actions-dz \
locale-caja-actions-el \
locale-caja-actions-en-AU \
locale-caja-actions-en-CA \
locale-caja-actions-en-GB \
locale-caja-actions-eo \
locale-caja-actions-es \
locale-caja-actions-es-AR \
locale-caja-actions-es-CO \
locale-caja-actions-es-MX \
locale-caja-actions-et \
locale-caja-actions-eu \
locale-caja-actions-fa \
locale-caja-actions-fi \
locale-caja-actions-fr \
locale-caja-actions-fur \
locale-caja-actions-ga \
locale-caja-actions-gl \
locale-caja-actions-gu \
locale-caja-actions-he \
locale-caja-actions-hi \
locale-caja-actions-hr \
locale-caja-actions-hu \
locale-caja-actions-id \
locale-caja-actions-is \
locale-caja-actions-it \
locale-caja-actions-ja \
locale-caja-actions-ka \
locale-caja-actions-kk \
locale-caja-actions-kn \
locale-caja-actions-ko \
locale-caja-actions-lt \
locale-caja-actions-lv \
locale-caja-actions-mai \
locale-caja-actions-mk \
locale-caja-actions-ml \
locale-caja-actions-mr \
locale-caja-actions-ms \
locale-caja-actions-nb \
locale-caja-actions-nds \
locale-caja-actions-ne \
locale-caja-actions-nl \
locale-caja-actions-nn \
locale-caja-actions-oc \
locale-caja-actions-or \
locale-caja-actions-pa \
locale-caja-actions-pl \
locale-caja-actions-pt \
locale-caja-actions-pt-BR \
locale-caja-actions-ro \
locale-caja-actions-ru \
locale-caja-actions-si \
locale-caja-actions-sk \
locale-caja-actions-sl \
locale-caja-actions-sq \
locale-caja-actions-sr \
locale-caja-actions-sr@latin \
locale-caja-actions-sv \
locale-caja-actions-ta \
locale-caja-actions-te \
locale-caja-actions-th \
locale-caja-actions-tr \
locale-caja-actions-ug \
locale-caja-actions-uk \
locale-caja-actions-vi \
locale-caja-actions-wa \
locale-caja-actions-zh-CN \
locale-caja-actions-zh-HK \
locale-caja-actions-zh-TW"

RDEPENDS:${PN} += "caja-actions"

inherit rpm
