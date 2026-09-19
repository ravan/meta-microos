SUMMARY = "Translations for package gnome-network-displays"
DESCRIPTION = "Provides translations for the 'gnome-network-displays' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.99.0"

RPM_NAME = "gnome-network-displays-lang-0.99.0-2.3.noarch.rpm"
RPM_HASH = "462b9998b54395c40f425d6f196e3421ca409dd685cd68962f4bb80a09949408f3dea9b2ccac75ec48c4b79ee519b60ffee7bc85638a00ae61f86840390718ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-network-displays-lang \
gnome-network-displays-lang-all \
locale-gnome-network-displays-bg \
locale-gnome-network-displays-ca \
locale-gnome-network-displays-cs \
locale-gnome-network-displays-da \
locale-gnome-network-displays-de \
locale-gnome-network-displays-el \
locale-gnome-network-displays-en-GB \
locale-gnome-network-displays-es \
locale-gnome-network-displays-eu \
locale-gnome-network-displays-fi \
locale-gnome-network-displays-fr \
locale-gnome-network-displays-fur \
locale-gnome-network-displays-he \
locale-gnome-network-displays-hi \
locale-gnome-network-displays-hr \
locale-gnome-network-displays-hu \
locale-gnome-network-displays-id \
locale-gnome-network-displays-it \
locale-gnome-network-displays-ja \
locale-gnome-network-displays-ka \
locale-gnome-network-displays-lt \
locale-gnome-network-displays-nl \
locale-gnome-network-displays-oc \
locale-gnome-network-displays-pl \
locale-gnome-network-displays-pt-BR \
locale-gnome-network-displays-ro \
locale-gnome-network-displays-ru \
locale-gnome-network-displays-sk \
locale-gnome-network-displays-sl \
locale-gnome-network-displays-sr \
locale-gnome-network-displays-sv \
locale-gnome-network-displays-tr \
locale-gnome-network-displays-uk \
locale-gnome-network-displays-zh-CN"

RDEPENDS:${PN} += "gnome-network-displays"

inherit rpm
