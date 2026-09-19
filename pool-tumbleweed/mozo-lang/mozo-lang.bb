SUMMARY = "Translations for package mozo"
DESCRIPTION = "Provides translations for the 'mozo' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "mozo-lang-1.28.0-2.4.noarch.rpm"
RPM_HASH = "37d1bdb864780519b667187b52666fe878e7cc626f433f8d7312c812051a461b29d395cb9fd8fefd48d75ec8657bf86def483dc0d2f4a9c47485e7077bdc9cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mozo-af \
locale-mozo-ar \
locale-mozo-as \
locale-mozo-ast \
locale-mozo-az \
locale-mozo-be \
locale-mozo-bg \
locale-mozo-bn \
locale-mozo-bn-IN \
locale-mozo-br \
locale-mozo-bs \
locale-mozo-ca \
locale-mozo-ca@valencia \
locale-mozo-cs \
locale-mozo-cy \
locale-mozo-da \
locale-mozo-de \
locale-mozo-dz \
locale-mozo-el \
locale-mozo-en-AU \
locale-mozo-en-CA \
locale-mozo-en-GB \
locale-mozo-eo \
locale-mozo-es \
locale-mozo-es-AR \
locale-mozo-es-CL \
locale-mozo-es-CO \
locale-mozo-es-CR \
locale-mozo-es-DO \
locale-mozo-es-EC \
locale-mozo-es-ES \
locale-mozo-es-MX \
locale-mozo-es-NI \
locale-mozo-es-PA \
locale-mozo-es-PE \
locale-mozo-es-PR \
locale-mozo-es-SV \
locale-mozo-es-UY \
locale-mozo-es-VE \
locale-mozo-et \
locale-mozo-eu \
locale-mozo-fa \
locale-mozo-fi \
locale-mozo-fr \
locale-mozo-fr-CA \
locale-mozo-fur \
locale-mozo-ga \
locale-mozo-gd \
locale-mozo-gl \
locale-mozo-gu \
locale-mozo-he \
locale-mozo-hi \
locale-mozo-hr \
locale-mozo-hu \
locale-mozo-ia \
locale-mozo-id \
locale-mozo-is \
locale-mozo-it \
locale-mozo-ja \
locale-mozo-ka \
locale-mozo-kk \
locale-mozo-km \
locale-mozo-kn \
locale-mozo-ko \
locale-mozo-lt \
locale-mozo-lv \
locale-mozo-mai \
locale-mozo-mk \
locale-mozo-ml \
locale-mozo-mr \
locale-mozo-ms \
locale-mozo-nb \
locale-mozo-nds \
locale-mozo-ne \
locale-mozo-nl \
locale-mozo-nn \
locale-mozo-oc \
locale-mozo-or \
locale-mozo-pa \
locale-mozo-pl \
locale-mozo-pt \
locale-mozo-pt-BR \
locale-mozo-ro \
locale-mozo-ru \
locale-mozo-si \
locale-mozo-sk \
locale-mozo-sl \
locale-mozo-sq \
locale-mozo-sr \
locale-mozo-sr@latin \
locale-mozo-sv \
locale-mozo-ta \
locale-mozo-te \
locale-mozo-th \
locale-mozo-tr \
locale-mozo-ug \
locale-mozo-uk \
locale-mozo-vi \
locale-mozo-wa \
locale-mozo-zh-CN \
locale-mozo-zh-HK \
locale-mozo-zh-TW \
mozo-lang \
mozo-lang-all"

RDEPENDS:${PN} += "mozo"

inherit rpm
