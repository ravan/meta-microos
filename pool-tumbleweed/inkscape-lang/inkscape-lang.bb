SUMMARY = "Translations for package inkscape"
DESCRIPTION = "Provides translations for the 'inkscape' package."
LICENSE = "GPL-3.0-only"

PV = "1.4.4+git2.3454cb1dab"

RPM_NAME = "inkscape-lang-1.4.4+git2.3454cb1dab-1.2.noarch.rpm"
RPM_HASH = "b78b98e69d1b3c6e3541d1f366a345659a862f413e2e5e57e2f7a408960f5307f7b2f9b643913723c8737d6988927fe92ee8314280d6fcd7009e432f049d9269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inkscape-lang \
inkscape-lang-all \
locale-inkscape-ar \
locale-inkscape-as \
locale-inkscape-az \
locale-inkscape-be \
locale-inkscape-bg \
locale-inkscape-bn \
locale-inkscape-br \
locale-inkscape-ca \
locale-inkscape-ca@valencia \
locale-inkscape-cs \
locale-inkscape-da \
locale-inkscape-de \
locale-inkscape-dz \
locale-inkscape-el \
locale-inkscape-en-AU \
locale-inkscape-en-CA \
locale-inkscape-en-GB \
locale-inkscape-eo \
locale-inkscape-es \
locale-inkscape-es-MX \
locale-inkscape-et \
locale-inkscape-eu \
locale-inkscape-fa \
locale-inkscape-fi \
locale-inkscape-fr \
locale-inkscape-ga \
locale-inkscape-gl \
locale-inkscape-gu \
locale-inkscape-he \
locale-inkscape-hi \
locale-inkscape-hr \
locale-inkscape-hu \
locale-inkscape-id \
locale-inkscape-is \
locale-inkscape-it \
locale-inkscape-ja \
locale-inkscape-km \
locale-inkscape-kn \
locale-inkscape-ko \
locale-inkscape-lt \
locale-inkscape-lv \
locale-inkscape-mai \
locale-inkscape-mk \
locale-inkscape-ml \
locale-inkscape-mr \
locale-inkscape-nb \
locale-inkscape-ne \
locale-inkscape-nl \
locale-inkscape-nn \
locale-inkscape-or \
locale-inkscape-pa \
locale-inkscape-pl \
locale-inkscape-pt \
locale-inkscape-pt-BR \
locale-inkscape-ro \
locale-inkscape-ru \
locale-inkscape-sk \
locale-inkscape-sl \
locale-inkscape-sq \
locale-inkscape-sr \
locale-inkscape-sr@latin \
locale-inkscape-sv \
locale-inkscape-ta \
locale-inkscape-te \
locale-inkscape-th \
locale-inkscape-tr \
locale-inkscape-uk \
locale-inkscape-vi \
locale-inkscape-zh-CN \
locale-inkscape-zh-TW"

RDEPENDS:${PN} += "inkscape"

inherit rpm
