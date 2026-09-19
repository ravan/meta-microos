SUMMARY = "Translations for package gnome-firmware"
DESCRIPTION = "Provides translations for the 'gnome-firmware' package."
LICENSE = "GPL-2.0-or-later"

PV = "49.0"

RPM_NAME = "gnome-firmware-lang-49.0-2.3.noarch.rpm"
RPM_HASH = "95829e5ebbe20127ff145d49f61afcb4e97231059d997bc36d6bcd2f97f1672442cad6aafea3f528822217486d5db4709db8f1815671cbfd3f40ccb439cd9158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-firmware-lang \
gnome-firmware-lang-all \
locale-gnome-firmware-bg \
locale-gnome-firmware-ca \
locale-gnome-firmware-cs \
locale-gnome-firmware-da \
locale-gnome-firmware-de \
locale-gnome-firmware-en-GB \
locale-gnome-firmware-es \
locale-gnome-firmware-eu \
locale-gnome-firmware-fa \
locale-gnome-firmware-fi \
locale-gnome-firmware-fr \
locale-gnome-firmware-fur \
locale-gnome-firmware-gl \
locale-gnome-firmware-he \
locale-gnome-firmware-hi \
locale-gnome-firmware-hr \
locale-gnome-firmware-hu \
locale-gnome-firmware-id \
locale-gnome-firmware-it \
locale-gnome-firmware-ka \
locale-gnome-firmware-nl \
locale-gnome-firmware-pa \
locale-gnome-firmware-pl \
locale-gnome-firmware-pt-BR \
locale-gnome-firmware-ru \
locale-gnome-firmware-sk \
locale-gnome-firmware-sl \
locale-gnome-firmware-sr \
locale-gnome-firmware-sv \
locale-gnome-firmware-tr \
locale-gnome-firmware-uk \
locale-gnome-firmware-zh-CN \
locale-gnome-firmware-zh-TW"

RDEPENDS:${PN} += "gnome-firmware"

inherit rpm
