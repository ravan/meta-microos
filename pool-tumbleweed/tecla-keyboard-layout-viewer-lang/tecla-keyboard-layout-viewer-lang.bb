SUMMARY = "Translations for package tecla-keyboard-layout-viewer"
DESCRIPTION = "Provides translations for the 'tecla-keyboard-layout-viewer' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "tecla-keyboard-layout-viewer-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "6e07b518a4f5b37fb0a4a84b1aa33027f731cecf6af0007b6c252e190c7017f2e652f19af2f78cd2bbaadf0c8464260b503fac44b1cc72c1be32a6858cfc83b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tecla-keyboard-layout-viewer-ar \
locale-tecla-keyboard-layout-viewer-be \
locale-tecla-keyboard-layout-viewer-bg \
locale-tecla-keyboard-layout-viewer-ca \
locale-tecla-keyboard-layout-viewer-cs \
locale-tecla-keyboard-layout-viewer-da \
locale-tecla-keyboard-layout-viewer-de \
locale-tecla-keyboard-layout-viewer-el \
locale-tecla-keyboard-layout-viewer-en-GB \
locale-tecla-keyboard-layout-viewer-eo \
locale-tecla-keyboard-layout-viewer-es \
locale-tecla-keyboard-layout-viewer-eu \
locale-tecla-keyboard-layout-viewer-fa \
locale-tecla-keyboard-layout-viewer-fi \
locale-tecla-keyboard-layout-viewer-fr \
locale-tecla-keyboard-layout-viewer-fur \
locale-tecla-keyboard-layout-viewer-gl \
locale-tecla-keyboard-layout-viewer-he \
locale-tecla-keyboard-layout-viewer-hi \
locale-tecla-keyboard-layout-viewer-hu \
locale-tecla-keyboard-layout-viewer-ia \
locale-tecla-keyboard-layout-viewer-id \
locale-tecla-keyboard-layout-viewer-it \
locale-tecla-keyboard-layout-viewer-ka \
locale-tecla-keyboard-layout-viewer-kk \
locale-tecla-keyboard-layout-viewer-ko \
locale-tecla-keyboard-layout-viewer-lt \
locale-tecla-keyboard-layout-viewer-lv \
locale-tecla-keyboard-layout-viewer-nb \
locale-tecla-keyboard-layout-viewer-ne \
locale-tecla-keyboard-layout-viewer-nl \
locale-tecla-keyboard-layout-viewer-oc \
locale-tecla-keyboard-layout-viewer-pa \
locale-tecla-keyboard-layout-viewer-pl \
locale-tecla-keyboard-layout-viewer-pt \
locale-tecla-keyboard-layout-viewer-pt-BR \
locale-tecla-keyboard-layout-viewer-ro \
locale-tecla-keyboard-layout-viewer-ru \
locale-tecla-keyboard-layout-viewer-sk \
locale-tecla-keyboard-layout-viewer-sl \
locale-tecla-keyboard-layout-viewer-sr \
locale-tecla-keyboard-layout-viewer-sr@latin \
locale-tecla-keyboard-layout-viewer-sv \
locale-tecla-keyboard-layout-viewer-tr \
locale-tecla-keyboard-layout-viewer-ug \
locale-tecla-keyboard-layout-viewer-uk \
locale-tecla-keyboard-layout-viewer-zh-CN \
locale-tecla-keyboard-layout-viewer-zh-TW \
tecla-keyboard-layout-viewer-lang \
tecla-keyboard-layout-viewer-lang-all"

RDEPENDS:${PN} += "tecla-keyboard-layout-viewer"

inherit rpm
