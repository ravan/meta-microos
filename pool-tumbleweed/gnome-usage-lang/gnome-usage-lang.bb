SUMMARY = "Translations for package gnome-usage"
DESCRIPTION = "Provides translations for the 'gnome-usage' package."
LICENSE = "GPL-3.0-only"

PV = "48.0+13"

RPM_NAME = "gnome-usage-lang-48.0+13-1.1.noarch.rpm"
RPM_HASH = "8c2f0f318da56ccd9579d437b918e3fd591c11b72d21bcac9599baf5670ebdc06ec1c20148e9c77fca89e8130b1e07877c401810e336f4fd169641456ef9ed78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-usage-lang \
gnome-usage-lang-all \
locale-gnome-usage-be \
locale-gnome-usage-bg \
locale-gnome-usage-ca \
locale-gnome-usage-cs \
locale-gnome-usage-da \
locale-gnome-usage-de \
locale-gnome-usage-el \
locale-gnome-usage-en-GB \
locale-gnome-usage-es \
locale-gnome-usage-eu \
locale-gnome-usage-fa \
locale-gnome-usage-fi \
locale-gnome-usage-fr \
locale-gnome-usage-fur \
locale-gnome-usage-gl \
locale-gnome-usage-he \
locale-gnome-usage-hi \
locale-gnome-usage-hr \
locale-gnome-usage-hu \
locale-gnome-usage-id \
locale-gnome-usage-it \
locale-gnome-usage-ja \
locale-gnome-usage-ka \
locale-gnome-usage-kk \
locale-gnome-usage-ko \
locale-gnome-usage-nb \
locale-gnome-usage-nl \
locale-gnome-usage-oc \
locale-gnome-usage-pl \
locale-gnome-usage-pt \
locale-gnome-usage-pt-BR \
locale-gnome-usage-ro \
locale-gnome-usage-ru \
locale-gnome-usage-sk \
locale-gnome-usage-sl \
locale-gnome-usage-sr \
locale-gnome-usage-sr@latin \
locale-gnome-usage-sv \
locale-gnome-usage-tr \
locale-gnome-usage-uk \
locale-gnome-usage-zh-CN \
locale-gnome-usage-zh-TW"

RDEPENDS:${PN} += "gnome-usage"

inherit rpm
