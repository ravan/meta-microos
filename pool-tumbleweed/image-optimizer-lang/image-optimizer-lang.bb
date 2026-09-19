SUMMARY = "Translations for package image-optimizer"
DESCRIPTION = "Provides translations for the 'image-optimizer' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "image-optimizer-lang-0.5.0-1.1.noarch.rpm"
RPM_HASH = "20e767420c173c4844e9f85da72b37a73d88cc03126fcee5c21d9ea8e640cf5e1974676e9a870359aa85a03f6c929562e82337b1e97faf6210eda3dc614e7f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "image-optimizer-lang \
image-optimizer-lang-all \
locale-image-optimizer-af \
locale-image-optimizer-ar \
locale-image-optimizer-as \
locale-image-optimizer-ast \
locale-image-optimizer-az \
locale-image-optimizer-be \
locale-image-optimizer-bg \
locale-image-optimizer-bn \
locale-image-optimizer-br \
locale-image-optimizer-bs \
locale-image-optimizer-ca \
locale-image-optimizer-cs \
locale-image-optimizer-cy \
locale-image-optimizer-da \
locale-image-optimizer-de \
locale-image-optimizer-dz \
locale-image-optimizer-el \
locale-image-optimizer-en-AU \
locale-image-optimizer-en-CA \
locale-image-optimizer-en-GB \
locale-image-optimizer-eo \
locale-image-optimizer-es \
locale-image-optimizer-et \
locale-image-optimizer-eu \
locale-image-optimizer-fa \
locale-image-optimizer-fi \
locale-image-optimizer-fr \
locale-image-optimizer-fr-CA \
locale-image-optimizer-ga \
locale-image-optimizer-gd \
locale-image-optimizer-gl \
locale-image-optimizer-gu \
locale-image-optimizer-he \
locale-image-optimizer-hi \
locale-image-optimizer-hr \
locale-image-optimizer-hu \
locale-image-optimizer-ia \
locale-image-optimizer-id \
locale-image-optimizer-is \
locale-image-optimizer-it \
locale-image-optimizer-ja \
locale-image-optimizer-ka \
locale-image-optimizer-kk \
locale-image-optimizer-km \
locale-image-optimizer-kn \
locale-image-optimizer-ko \
locale-image-optimizer-lt \
locale-image-optimizer-lv \
locale-image-optimizer-mk \
locale-image-optimizer-ml \
locale-image-optimizer-mr \
locale-image-optimizer-ms \
locale-image-optimizer-nb \
locale-image-optimizer-ne \
locale-image-optimizer-nl \
locale-image-optimizer-nn \
locale-image-optimizer-oc \
locale-image-optimizer-or \
locale-image-optimizer-pa \
locale-image-optimizer-pl \
locale-image-optimizer-pt \
locale-image-optimizer-pt-BR \
locale-image-optimizer-ro \
locale-image-optimizer-ru \
locale-image-optimizer-si \
locale-image-optimizer-sk \
locale-image-optimizer-sl \
locale-image-optimizer-sq \
locale-image-optimizer-sr \
locale-image-optimizer-sv \
locale-image-optimizer-ta \
locale-image-optimizer-te \
locale-image-optimizer-th \
locale-image-optimizer-tr \
locale-image-optimizer-ug \
locale-image-optimizer-uk \
locale-image-optimizer-vi \
locale-image-optimizer-wa \
locale-image-optimizer-zh \
locale-image-optimizer-zh-HK \
locale-image-optimizer-zh-TW"

RDEPENDS:${PN} += "image-optimizer"

inherit rpm
