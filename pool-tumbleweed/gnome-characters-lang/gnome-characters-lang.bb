SUMMARY = "Translations for package gnome-characters"
DESCRIPTION = "Provides translations for the 'gnome-characters' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-characters-lang-50.0-2.1.noarch.rpm"
RPM_HASH = "e014ce6dabe94e132f0ab6cf979dac0f6794dd5cfe3eddce7a1fdf6adc1bfa4690c49f8e82ceb789d754700e81f7d85b8c4dc9403a0ff493592586c3f9049801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-characters-lang \
gnome-characters-lang-all \
locale-gnome-characters-af \
locale-gnome-characters-ar \
locale-gnome-characters-az \
locale-gnome-characters-be \
locale-gnome-characters-bg \
locale-gnome-characters-bn \
locale-gnome-characters-ca \
locale-gnome-characters-ca@valencia \
locale-gnome-characters-cs \
locale-gnome-characters-da \
locale-gnome-characters-de \
locale-gnome-characters-el \
locale-gnome-characters-en-GB \
locale-gnome-characters-eo \
locale-gnome-characters-es \
locale-gnome-characters-eu \
locale-gnome-characters-fa \
locale-gnome-characters-fi \
locale-gnome-characters-fr \
locale-gnome-characters-fur \
locale-gnome-characters-gd \
locale-gnome-characters-gl \
locale-gnome-characters-gu \
locale-gnome-characters-he \
locale-gnome-characters-hi \
locale-gnome-characters-hr \
locale-gnome-characters-hu \
locale-gnome-characters-ia \
locale-gnome-characters-id \
locale-gnome-characters-is \
locale-gnome-characters-it \
locale-gnome-characters-ja \
locale-gnome-characters-ka \
locale-gnome-characters-kk \
locale-gnome-characters-ko \
locale-gnome-characters-lt \
locale-gnome-characters-lv \
locale-gnome-characters-ml \
locale-gnome-characters-ms \
locale-gnome-characters-nb \
locale-gnome-characters-ne \
locale-gnome-characters-nl \
locale-gnome-characters-oc \
locale-gnome-characters-pa \
locale-gnome-characters-pl \
locale-gnome-characters-pt \
locale-gnome-characters-pt-BR \
locale-gnome-characters-ro \
locale-gnome-characters-ru \
locale-gnome-characters-sk \
locale-gnome-characters-sl \
locale-gnome-characters-sr \
locale-gnome-characters-sr@latin \
locale-gnome-characters-sv \
locale-gnome-characters-ta \
locale-gnome-characters-th \
locale-gnome-characters-tr \
locale-gnome-characters-ug \
locale-gnome-characters-uk \
locale-gnome-characters-zh-CN \
locale-gnome-characters-zh-TW"

RDEPENDS:${PN} += "gnome-characters"

inherit rpm
