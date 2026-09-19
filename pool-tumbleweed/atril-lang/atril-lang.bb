SUMMARY = "Translations for package atril"
DESCRIPTION = "Provides translations for the 'atril' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "atril-lang-1.28.4-1.2.noarch.rpm"
RPM_HASH = "4d7e939d2b88a0c59d54701b807f113a381f801d316888d878db8624fcf2873b596fd5adff22d9520536a049caea3c96bb563cf8175107c0002bddbb4202276d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atril-lang \
atril-lang-all \
locale-atril-af \
locale-atril-ar \
locale-atril-as \
locale-atril-ast \
locale-atril-az \
locale-atril-be \
locale-atril-bg \
locale-atril-bn \
locale-atril-bn-IN \
locale-atril-br \
locale-atril-bs \
locale-atril-ca \
locale-atril-ca@valencia \
locale-atril-cs \
locale-atril-cy \
locale-atril-da \
locale-atril-de \
locale-atril-de-CH \
locale-atril-dz \
locale-atril-el \
locale-atril-en-AU \
locale-atril-en-CA \
locale-atril-en-GB \
locale-atril-eo \
locale-atril-es \
locale-atril-es-AR \
locale-atril-es-CL \
locale-atril-es-CO \
locale-atril-es-CR \
locale-atril-es-DO \
locale-atril-es-EC \
locale-atril-es-ES \
locale-atril-es-MX \
locale-atril-es-NI \
locale-atril-es-PA \
locale-atril-es-PE \
locale-atril-es-PR \
locale-atril-es-SV \
locale-atril-es-UY \
locale-atril-es-VE \
locale-atril-et \
locale-atril-eu \
locale-atril-fa \
locale-atril-fi \
locale-atril-fr \
locale-atril-fr-CA \
locale-atril-fur \
locale-atril-ga \
locale-atril-gd \
locale-atril-gl \
locale-atril-gu \
locale-atril-he \
locale-atril-hi \
locale-atril-hr \
locale-atril-hu \
locale-atril-ia \
locale-atril-id \
locale-atril-is \
locale-atril-it \
locale-atril-ja \
locale-atril-ka \
locale-atril-kk \
locale-atril-km \
locale-atril-kn \
locale-atril-ko \
locale-atril-lt \
locale-atril-lv \
locale-atril-mai \
locale-atril-mk \
locale-atril-ml \
locale-atril-mr \
locale-atril-ms \
locale-atril-nb \
locale-atril-nds \
locale-atril-ne \
locale-atril-nl \
locale-atril-nn \
locale-atril-oc \
locale-atril-or \
locale-atril-pa \
locale-atril-pl \
locale-atril-pt \
locale-atril-pt-BR \
locale-atril-ro \
locale-atril-ru \
locale-atril-si \
locale-atril-sk \
locale-atril-sl \
locale-atril-sq \
locale-atril-sr \
locale-atril-sr@latin \
locale-atril-sv \
locale-atril-ta \
locale-atril-te \
locale-atril-th \
locale-atril-tr \
locale-atril-ug \
locale-atril-uk \
locale-atril-vi \
locale-atril-wa \
locale-atril-zh-CN \
locale-atril-zh-HK \
locale-atril-zh-TW"

RDEPENDS:${PN} += "atril"

inherit rpm
