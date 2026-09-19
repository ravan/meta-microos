SUMMARY = "Translations for package gnome-weather"
DESCRIPTION = "Provides translations for the 'gnome-weather' package."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-weather-lang-50.0-1.2.noarch.rpm"
RPM_HASH = "8ff01962bdab03535b5f97e04e807aab18e981411a5f59a50aec24bb710894cd7713cfe60d67ff7c97f344200a6917b92ca792d1b908b75ef1567255683acf09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-weather-lang \
gnome-weather-lang-all \
locale-gnome-weather-af \
locale-gnome-weather-ar \
locale-gnome-weather-as \
locale-gnome-weather-az \
locale-gnome-weather-be \
locale-gnome-weather-be@latin \
locale-gnome-weather-bg \
locale-gnome-weather-bn \
locale-gnome-weather-bn-IN \
locale-gnome-weather-bs \
locale-gnome-weather-ca \
locale-gnome-weather-ca@valencia \
locale-gnome-weather-cs \
locale-gnome-weather-da \
locale-gnome-weather-de \
locale-gnome-weather-el \
locale-gnome-weather-en-GB \
locale-gnome-weather-eo \
locale-gnome-weather-es \
locale-gnome-weather-et \
locale-gnome-weather-eu \
locale-gnome-weather-fa \
locale-gnome-weather-fi \
locale-gnome-weather-fr \
locale-gnome-weather-fur \
locale-gnome-weather-ga \
locale-gnome-weather-gd \
locale-gnome-weather-gl \
locale-gnome-weather-gu \
locale-gnome-weather-he \
locale-gnome-weather-hi \
locale-gnome-weather-hr \
locale-gnome-weather-hu \
locale-gnome-weather-ia \
locale-gnome-weather-id \
locale-gnome-weather-is \
locale-gnome-weather-it \
locale-gnome-weather-ja \
locale-gnome-weather-ka \
locale-gnome-weather-kk \
locale-gnome-weather-kn \
locale-gnome-weather-ko \
locale-gnome-weather-lt \
locale-gnome-weather-lv \
locale-gnome-weather-ml \
locale-gnome-weather-ms \
locale-gnome-weather-nb \
locale-gnome-weather-ne \
locale-gnome-weather-nl \
locale-gnome-weather-nn \
locale-gnome-weather-oc \
locale-gnome-weather-pa \
locale-gnome-weather-pl \
locale-gnome-weather-pt \
locale-gnome-weather-pt-BR \
locale-gnome-weather-ro \
locale-gnome-weather-ru \
locale-gnome-weather-sk \
locale-gnome-weather-sl \
locale-gnome-weather-sr \
locale-gnome-weather-sr@latin \
locale-gnome-weather-sv \
locale-gnome-weather-ta \
locale-gnome-weather-te \
locale-gnome-weather-th \
locale-gnome-weather-tr \
locale-gnome-weather-ug \
locale-gnome-weather-uk \
locale-gnome-weather-vi \
locale-gnome-weather-zh-CN \
locale-gnome-weather-zh-HK \
locale-gnome-weather-zh-TW"

RDEPENDS:${PN} += "gnome-weather"

inherit rpm
