SUMMARY = "Translations for package menulibre"
DESCRIPTION = "Provides translations for the 'menulibre' package."
LICENSE = "GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "menulibre-lang-2.4.0-1.4.noarch.rpm"
RPM_HASH = "95e4bf8175537367a02ac90cdd8ae464fa11990cededc41e36fb4306ab5d9074a5ba68489ece5085c745fdcad77e6cb0ad733da3cd68714a7a79bd89bc1f5fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-menulibre-ar \
locale-menulibre-br \
locale-menulibre-ca \
locale-menulibre-cs \
locale-menulibre-da \
locale-menulibre-de \
locale-menulibre-el \
locale-menulibre-en-AU \
locale-menulibre-en-GB \
locale-menulibre-eo \
locale-menulibre-es \
locale-menulibre-eu \
locale-menulibre-fi \
locale-menulibre-fr \
locale-menulibre-gl \
locale-menulibre-he \
locale-menulibre-hr \
locale-menulibre-is \
locale-menulibre-it \
locale-menulibre-ja \
locale-menulibre-kk \
locale-menulibre-ko \
locale-menulibre-lt \
locale-menulibre-ml \
locale-menulibre-ms \
locale-menulibre-nb \
locale-menulibre-nl \
locale-menulibre-pl \
locale-menulibre-pt \
locale-menulibre-pt-BR \
locale-menulibre-pt-PT \
locale-menulibre-ru \
locale-menulibre-si \
locale-menulibre-sk \
locale-menulibre-sl \
locale-menulibre-sr \
locale-menulibre-sv \
locale-menulibre-tr \
locale-menulibre-uk \
locale-menulibre-zh-CN \
locale-menulibre-zh-HK \
locale-menulibre-zh-TW \
menulibre-lang \
menulibre-lang-all"

RDEPENDS:${PN} += "menulibre"

inherit rpm
