SUMMARY = "Translations for package gnome-recipes"
DESCRIPTION = "Provides translations for the 'gnome-recipes' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4+117"

RPM_NAME = "gnome-recipes-lang-2.0.4+117-3.6.noarch.rpm"
RPM_HASH = "bf8d80fc74678de35cc796d57b8cc6b9c34c2dd88efe02563c1c69ddbca1ce9e8b163aa7272e06c332343d20f9b2d5d791e04d48da43cb67067586fd42caf6e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-recipes-lang \
gnome-recipes-lang-all \
locale-gnome-recipes-ar \
locale-gnome-recipes-ca \
locale-gnome-recipes-cs \
locale-gnome-recipes-de \
locale-gnome-recipes-en-GB \
locale-gnome-recipes-es \
locale-gnome-recipes-eu \
locale-gnome-recipes-fi \
locale-gnome-recipes-fr \
locale-gnome-recipes-fur \
locale-gnome-recipes-hi \
locale-gnome-recipes-hr \
locale-gnome-recipes-hu \
locale-gnome-recipes-id \
locale-gnome-recipes-ka \
locale-gnome-recipes-ko \
locale-gnome-recipes-nb \
locale-gnome-recipes-nl \
locale-gnome-recipes-pl \
locale-gnome-recipes-pt-BR \
locale-gnome-recipes-sk \
locale-gnome-recipes-sl \
locale-gnome-recipes-sr \
locale-gnome-recipes-sv \
locale-gnome-recipes-tr \
locale-gnome-recipes-uk \
locale-gnome-recipes-zh-CN \
locale-gnome-recipes-zh-TW"

RDEPENDS:${PN} += "gnome-recipes"

inherit rpm
