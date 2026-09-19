SUMMARY = "Translations for package gnome-connections"
DESCRIPTION = "Provides translations for the 'gnome-connections' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-connections-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "c9d479f06b70af3b433453a27f4f290cee564a615f10fb78ea0ef2436c40578cd38656448f2fff5c48c6498b74786889fde2788fc30da44a845959a62980b4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-connections-lang \
gnome-connections-lang-all \
locale-gnome-connections-be \
locale-gnome-connections-bg \
locale-gnome-connections-ca \
locale-gnome-connections-cs \
locale-gnome-connections-da \
locale-gnome-connections-de \
locale-gnome-connections-el \
locale-gnome-connections-en-GB \
locale-gnome-connections-eo \
locale-gnome-connections-es \
locale-gnome-connections-eu \
locale-gnome-connections-fa \
locale-gnome-connections-fi \
locale-gnome-connections-fr \
locale-gnome-connections-fur \
locale-gnome-connections-gl \
locale-gnome-connections-he \
locale-gnome-connections-hi \
locale-gnome-connections-hr \
locale-gnome-connections-hu \
locale-gnome-connections-id \
locale-gnome-connections-is \
locale-gnome-connections-it \
locale-gnome-connections-ja \
locale-gnome-connections-ka \
locale-gnome-connections-kk \
locale-gnome-connections-ko \
locale-gnome-connections-lt \
locale-gnome-connections-lv \
locale-gnome-connections-nb \
locale-gnome-connections-ne \
locale-gnome-connections-nl \
locale-gnome-connections-oc \
locale-gnome-connections-pa \
locale-gnome-connections-pl \
locale-gnome-connections-pt \
locale-gnome-connections-pt-BR \
locale-gnome-connections-ro \
locale-gnome-connections-ru \
locale-gnome-connections-sk \
locale-gnome-connections-sl \
locale-gnome-connections-sr \
locale-gnome-connections-sr@latin \
locale-gnome-connections-sv \
locale-gnome-connections-th \
locale-gnome-connections-tr \
locale-gnome-connections-ug \
locale-gnome-connections-uk \
locale-gnome-connections-vi \
locale-gnome-connections-zh-CN \
locale-gnome-connections-zh-TW"

RDEPENDS:${PN} += "gnome-connections"

inherit rpm
