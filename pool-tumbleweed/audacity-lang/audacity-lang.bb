SUMMARY = "Translations for package audacity"
DESCRIPTION = "Provides translations for the 'audacity' package."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later & GPL-3.0-only"

PV = "3.7.9"

RPM_NAME = "audacity-lang-3.7.9-1.1.noarch.rpm"
RPM_HASH = "fab32909b88a7d469051b5ad9483c0e85d2611477047b54f8920ed644df32760cff8ff9fa93c6b9f7a973660d793a619218a09b0e33cef6586f9df6e9822a0d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audacity-lang \
audacity-lang-all \
locale-audacity-af \
locale-audacity-ar \
locale-audacity-be \
locale-audacity-bg \
locale-audacity-bn \
locale-audacity-bs \
locale-audacity-ca \
locale-audacity-cs \
locale-audacity-cy \
locale-audacity-da \
locale-audacity-de \
locale-audacity-el \
locale-audacity-es \
locale-audacity-eu \
locale-audacity-fa \
locale-audacity-fi \
locale-audacity-fr \
locale-audacity-ga \
locale-audacity-gl \
locale-audacity-he \
locale-audacity-hi \
locale-audacity-hr \
locale-audacity-hu \
locale-audacity-id \
locale-audacity-it \
locale-audacity-ja \
locale-audacity-ka \
locale-audacity-km \
locale-audacity-ko \
locale-audacity-lt \
locale-audacity-mk \
locale-audacity-mr \
locale-audacity-nb \
locale-audacity-nl \
locale-audacity-oc \
locale-audacity-pl \
locale-audacity-pt-BR \
locale-audacity-pt-PT \
locale-audacity-ro \
locale-audacity-ru \
locale-audacity-sk \
locale-audacity-sl \
locale-audacity-sv \
locale-audacity-ta \
locale-audacity-tr \
locale-audacity-uk \
locale-audacity-vi \
locale-audacity-zh-CN \
locale-audacity-zh-TW"

RDEPENDS:${PN} += "audacity"

inherit rpm
