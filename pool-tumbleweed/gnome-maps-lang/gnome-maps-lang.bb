SUMMARY = "Translations for package gnome-maps"
DESCRIPTION = "Provides translations for the 'gnome-maps' package."
LICENSE = "Apache-2.0 & CC-BY-3.0 & GPL-2.0-or-later & BSD-3-Clause & ISC & MIT"

PV = "50.5"

RPM_NAME = "gnome-maps-lang-50.5-1.1.noarch.rpm"
RPM_HASH = "386360c634c26f426339ec30436cf9aa13018c53fe0ded945154c057c0dab71e1cc5b4c4e412155b1e6d2c3463cfddd9dfb6e9d095b016684300873ed2775887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-maps-lang \
gnome-maps-lang-all \
locale-gnome-maps-af \
locale-gnome-maps-ar \
locale-gnome-maps-as \
locale-gnome-maps-be \
locale-gnome-maps-bg \
locale-gnome-maps-bs \
locale-gnome-maps-ca \
locale-gnome-maps-ca@valencia \
locale-gnome-maps-cs \
locale-gnome-maps-da \
locale-gnome-maps-de \
locale-gnome-maps-el \
locale-gnome-maps-en-GB \
locale-gnome-maps-eo \
locale-gnome-maps-es \
locale-gnome-maps-et \
locale-gnome-maps-eu \
locale-gnome-maps-fa \
locale-gnome-maps-fi \
locale-gnome-maps-fr \
locale-gnome-maps-fur \
locale-gnome-maps-ga \
locale-gnome-maps-gd \
locale-gnome-maps-gl \
locale-gnome-maps-he \
locale-gnome-maps-hi \
locale-gnome-maps-hr \
locale-gnome-maps-hu \
locale-gnome-maps-id \
locale-gnome-maps-is \
locale-gnome-maps-it \
locale-gnome-maps-ja \
locale-gnome-maps-ka \
locale-gnome-maps-kk \
locale-gnome-maps-kn \
locale-gnome-maps-ko \
locale-gnome-maps-lt \
locale-gnome-maps-lv \
locale-gnome-maps-ml \
locale-gnome-maps-ms \
locale-gnome-maps-nb \
locale-gnome-maps-ne \
locale-gnome-maps-nl \
locale-gnome-maps-oc \
locale-gnome-maps-pa \
locale-gnome-maps-pl \
locale-gnome-maps-pt \
locale-gnome-maps-pt-BR \
locale-gnome-maps-ro \
locale-gnome-maps-ru \
locale-gnome-maps-sk \
locale-gnome-maps-sl \
locale-gnome-maps-sr \
locale-gnome-maps-sr@latin \
locale-gnome-maps-sv \
locale-gnome-maps-ta \
locale-gnome-maps-te \
locale-gnome-maps-th \
locale-gnome-maps-tr \
locale-gnome-maps-ug \
locale-gnome-maps-uk \
locale-gnome-maps-vi \
locale-gnome-maps-zh-CN \
locale-gnome-maps-zh-HK \
locale-gnome-maps-zh-TW"

RDEPENDS:${PN} += "gnome-maps"

inherit rpm
