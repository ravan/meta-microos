SUMMARY = "Translations for package easyeffects"
DESCRIPTION = "Provides translations for the 'easyeffects' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.9"

RPM_NAME = "easyeffects-lang-8.2.9-1.1.noarch.rpm"
RPM_HASH = "19308df61ffd482f6ba20182c01816838d3badb0083379aa5480aa8957366d893fc1b01cd2aca89e256e86692e13035108d97c13afb7976feb00235fb5e259c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easyeffects-lang \
easyeffects-lang-all \
locale-easyeffects-af \
locale-easyeffects-ar \
locale-easyeffects-bg \
locale-easyeffects-ca \
locale-easyeffects-cs \
locale-easyeffects-da \
locale-easyeffects-de \
locale-easyeffects-es \
locale-easyeffects-es-CO \
locale-easyeffects-es-MX \
locale-easyeffects-es-VE \
locale-easyeffects-et \
locale-easyeffects-eu \
locale-easyeffects-fa \
locale-easyeffects-fr \
locale-easyeffects-ga \
locale-easyeffects-gl \
locale-easyeffects-hr \
locale-easyeffects-hu \
locale-easyeffects-it-IT \
locale-easyeffects-ja \
locale-easyeffects-ka \
locale-easyeffects-km \
locale-easyeffects-ko \
locale-easyeffects-nb-NO \
locale-easyeffects-nl \
locale-easyeffects-nn \
locale-easyeffects-pl \
locale-easyeffects-pt \
locale-easyeffects-pt-BR \
locale-easyeffects-ro \
locale-easyeffects-ru \
locale-easyeffects-sk \
locale-easyeffects-sr \
locale-easyeffects-sv \
locale-easyeffects-ta \
locale-easyeffects-th \
locale-easyeffects-tr \
locale-easyeffects-uk \
locale-easyeffects-vi \
locale-easyeffects-zh-CN \
locale-easyeffects-zh-Hant"

RDEPENDS:${PN} += "easyeffects"

inherit rpm
