SUMMARY = "Translations for package gnome-contacts"
DESCRIPTION = "Provides translations for the 'gnome-contacts' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-contacts-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "863c3487ff4b30788d07f214fce6d08c460af28694e07d5797c2de02c862c67a4360796b4d6cee0fcc44ed189bb82324bd238b6dbaab732730183ab78b358295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-contacts-lang \
gnome-contacts-lang-all \
locale-gnome-contacts-af \
locale-gnome-contacts-ar \
locale-gnome-contacts-as \
locale-gnome-contacts-ast \
locale-gnome-contacts-be \
locale-gnome-contacts-bg \
locale-gnome-contacts-bn-IN \
locale-gnome-contacts-bs \
locale-gnome-contacts-ca \
locale-gnome-contacts-ca@valencia \
locale-gnome-contacts-cs \
locale-gnome-contacts-da \
locale-gnome-contacts-de \
locale-gnome-contacts-el \
locale-gnome-contacts-en-CA \
locale-gnome-contacts-en-GB \
locale-gnome-contacts-eo \
locale-gnome-contacts-es \
locale-gnome-contacts-et \
locale-gnome-contacts-eu \
locale-gnome-contacts-fa \
locale-gnome-contacts-fi \
locale-gnome-contacts-fr \
locale-gnome-contacts-fur \
locale-gnome-contacts-ga \
locale-gnome-contacts-gd \
locale-gnome-contacts-gl \
locale-gnome-contacts-gu \
locale-gnome-contacts-he \
locale-gnome-contacts-hi \
locale-gnome-contacts-hr \
locale-gnome-contacts-hu \
locale-gnome-contacts-id \
locale-gnome-contacts-is \
locale-gnome-contacts-it \
locale-gnome-contacts-ja \
locale-gnome-contacts-ka \
locale-gnome-contacts-kk \
locale-gnome-contacts-kn \
locale-gnome-contacts-ko \
locale-gnome-contacts-lt \
locale-gnome-contacts-lv \
locale-gnome-contacts-mk \
locale-gnome-contacts-ml \
locale-gnome-contacts-mr \
locale-gnome-contacts-ms \
locale-gnome-contacts-nb \
locale-gnome-contacts-ne \
locale-gnome-contacts-nl \
locale-gnome-contacts-oc \
locale-gnome-contacts-or \
locale-gnome-contacts-pa \
locale-gnome-contacts-pl \
locale-gnome-contacts-pt \
locale-gnome-contacts-pt-BR \
locale-gnome-contacts-ro \
locale-gnome-contacts-ru \
locale-gnome-contacts-sk \
locale-gnome-contacts-sl \
locale-gnome-contacts-sr \
locale-gnome-contacts-sr@latin \
locale-gnome-contacts-sv \
locale-gnome-contacts-ta \
locale-gnome-contacts-te \
locale-gnome-contacts-th \
locale-gnome-contacts-tr \
locale-gnome-contacts-ug \
locale-gnome-contacts-uk \
locale-gnome-contacts-vi \
locale-gnome-contacts-zh-CN \
locale-gnome-contacts-zh-HK \
locale-gnome-contacts-zh-TW"

RDEPENDS:${PN} += "gnome-contacts"

inherit rpm
