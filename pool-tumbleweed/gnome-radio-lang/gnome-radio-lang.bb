SUMMARY = "Translations for package gnome-radio"
DESCRIPTION = "Provides translations for the 'gnome-radio' package."
LICENSE = "GPL-3.0-or-later"

PV = "128"

RPM_NAME = "gnome-radio-lang-128-1.10.noarch.rpm"
RPM_HASH = "cf521d6f9295fee940464b58ae324fe22d7600961782284f7a10e861881bb8518ed54bc14462af2812931428872b0ab4cdb058632407ce2972219159712fef38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-radio-lang \
gnome-radio-lang-all \
locale-gnome-radio-ca \
locale-gnome-radio-cs \
locale-gnome-radio-de \
locale-gnome-radio-es \
locale-gnome-radio-fr \
locale-gnome-radio-hu \
locale-gnome-radio-id \
locale-gnome-radio-nb \
locale-gnome-radio-pl \
locale-gnome-radio-pt-BR \
locale-gnome-radio-sl \
locale-gnome-radio-sr \
locale-gnome-radio-sv"

RDEPENDS:${PN} += "gnome-radio"

inherit rpm
