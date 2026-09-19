SUMMARY = "Languages for Caja extensions"
DESCRIPTION = "Provides common translations shared by Caja file manager extensions."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extensions-common-lang-1.28.0-2.11.noarch.rpm"
RPM_HASH = "ddaf8891a3135c28a8a057df799c9a6e2416ad87e317339d2c14e207b0304b469cfa7b593e9a7985ce4b649369b9623463741f5def741af75735344839fb7747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-image-converter-lang \
caja-extension-open-terminal-lang \
caja-extension-sendto-lang \
caja-extension-share-lang \
caja-extension-wallpaper-lang \
caja-extension-xattr-av-lang \
caja-extension-xattr-tags-lang \
caja-extensions-common-lang \
locale-caja-extensions-common-af \
locale-caja-extensions-common-ar \
locale-caja-extensions-common-as \
locale-caja-extensions-common-ast \
locale-caja-extensions-common-az \
locale-caja-extensions-common-be \
locale-caja-extensions-common-bg \
locale-caja-extensions-common-bn \
locale-caja-extensions-common-bn-IN \
locale-caja-extensions-common-br \
locale-caja-extensions-common-bs \
locale-caja-extensions-common-ca \
locale-caja-extensions-common-ca@valencia \
locale-caja-extensions-common-cs \
locale-caja-extensions-common-cy \
locale-caja-extensions-common-da \
locale-caja-extensions-common-de \
locale-caja-extensions-common-dz \
locale-caja-extensions-common-el \
locale-caja-extensions-common-en-AU \
locale-caja-extensions-common-en-CA \
locale-caja-extensions-common-en-GB \
locale-caja-extensions-common-en-US \
locale-caja-extensions-common-eo \
locale-caja-extensions-common-es \
locale-caja-extensions-common-es-AR \
locale-caja-extensions-common-es-CL \
locale-caja-extensions-common-es-CO \
locale-caja-extensions-common-es-CR \
locale-caja-extensions-common-es-DO \
locale-caja-extensions-common-es-EC \
locale-caja-extensions-common-es-ES \
locale-caja-extensions-common-es-MX \
locale-caja-extensions-common-es-NI \
locale-caja-extensions-common-es-PA \
locale-caja-extensions-common-es-PE \
locale-caja-extensions-common-es-SV \
locale-caja-extensions-common-es-UY \
locale-caja-extensions-common-es-VE \
locale-caja-extensions-common-et \
locale-caja-extensions-common-eu \
locale-caja-extensions-common-fa \
locale-caja-extensions-common-fi \
locale-caja-extensions-common-fr \
locale-caja-extensions-common-fr-CA \
locale-caja-extensions-common-fur \
locale-caja-extensions-common-ga \
locale-caja-extensions-common-gl \
locale-caja-extensions-common-gu \
locale-caja-extensions-common-he \
locale-caja-extensions-common-hi \
locale-caja-extensions-common-hr \
locale-caja-extensions-common-hu \
locale-caja-extensions-common-ia \
locale-caja-extensions-common-id \
locale-caja-extensions-common-is \
locale-caja-extensions-common-it \
locale-caja-extensions-common-ja \
locale-caja-extensions-common-ka \
locale-caja-extensions-common-kk \
locale-caja-extensions-common-kn \
locale-caja-extensions-common-ko \
locale-caja-extensions-common-lt \
locale-caja-extensions-common-lv \
locale-caja-extensions-common-mai \
locale-caja-extensions-common-mk \
locale-caja-extensions-common-ml \
locale-caja-extensions-common-mr \
locale-caja-extensions-common-ms \
locale-caja-extensions-common-nb \
locale-caja-extensions-common-nds \
locale-caja-extensions-common-ne \
locale-caja-extensions-common-nl \
locale-caja-extensions-common-nn \
locale-caja-extensions-common-oc \
locale-caja-extensions-common-or \
locale-caja-extensions-common-pa \
locale-caja-extensions-common-pl \
locale-caja-extensions-common-pt \
locale-caja-extensions-common-pt-BR \
locale-caja-extensions-common-ro \
locale-caja-extensions-common-ru \
locale-caja-extensions-common-si \
locale-caja-extensions-common-sk \
locale-caja-extensions-common-sl \
locale-caja-extensions-common-sq \
locale-caja-extensions-common-sr \
locale-caja-extensions-common-sr@latin \
locale-caja-extensions-common-sv \
locale-caja-extensions-common-ta \
locale-caja-extensions-common-te \
locale-caja-extensions-common-th \
locale-caja-extensions-common-tr \
locale-caja-extensions-common-ug \
locale-caja-extensions-common-uk \
locale-caja-extensions-common-vi \
locale-caja-extensions-common-wa \
locale-caja-extensions-common-zh-CN \
locale-caja-extensions-common-zh-HK \
locale-caja-extensions-common-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
