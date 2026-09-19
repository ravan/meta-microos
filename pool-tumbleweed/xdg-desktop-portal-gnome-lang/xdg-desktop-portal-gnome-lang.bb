SUMMARY = "Translations for package xdg-desktop-portal-gnome"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-gnome' package."
LICENSE = "LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "xdg-desktop-portal-gnome-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "626b9c0b4896cb1823d944564f898e1fae41859c248878d35ef32169c9a7cac204f61de4a980c62e6ee81abebba3721bf54f39e02c496628cbfedbcd968947e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-desktop-portal-gnome-ar \
locale-xdg-desktop-portal-gnome-be \
locale-xdg-desktop-portal-gnome-bg \
locale-xdg-desktop-portal-gnome-ca \
locale-xdg-desktop-portal-gnome-cs \
locale-xdg-desktop-portal-gnome-da \
locale-xdg-desktop-portal-gnome-de \
locale-xdg-desktop-portal-gnome-el \
locale-xdg-desktop-portal-gnome-en-GB \
locale-xdg-desktop-portal-gnome-eo \
locale-xdg-desktop-portal-gnome-es \
locale-xdg-desktop-portal-gnome-eu \
locale-xdg-desktop-portal-gnome-fa \
locale-xdg-desktop-portal-gnome-fi \
locale-xdg-desktop-portal-gnome-fr \
locale-xdg-desktop-portal-gnome-fur \
locale-xdg-desktop-portal-gnome-gl \
locale-xdg-desktop-portal-gnome-he \
locale-xdg-desktop-portal-gnome-hi \
locale-xdg-desktop-portal-gnome-hr \
locale-xdg-desktop-portal-gnome-hu \
locale-xdg-desktop-portal-gnome-ia \
locale-xdg-desktop-portal-gnome-id \
locale-xdg-desktop-portal-gnome-is \
locale-xdg-desktop-portal-gnome-it \
locale-xdg-desktop-portal-gnome-ja \
locale-xdg-desktop-portal-gnome-ka \
locale-xdg-desktop-portal-gnome-kk \
locale-xdg-desktop-portal-gnome-ko \
locale-xdg-desktop-portal-gnome-lt \
locale-xdg-desktop-portal-gnome-lv \
locale-xdg-desktop-portal-gnome-nb \
locale-xdg-desktop-portal-gnome-ne \
locale-xdg-desktop-portal-gnome-nl \
locale-xdg-desktop-portal-gnome-oc \
locale-xdg-desktop-portal-gnome-pa \
locale-xdg-desktop-portal-gnome-pl \
locale-xdg-desktop-portal-gnome-pt \
locale-xdg-desktop-portal-gnome-pt-BR \
locale-xdg-desktop-portal-gnome-ro \
locale-xdg-desktop-portal-gnome-ru \
locale-xdg-desktop-portal-gnome-sk \
locale-xdg-desktop-portal-gnome-sl \
locale-xdg-desktop-portal-gnome-sr \
locale-xdg-desktop-portal-gnome-sr@latin \
locale-xdg-desktop-portal-gnome-sv \
locale-xdg-desktop-portal-gnome-th \
locale-xdg-desktop-portal-gnome-tr \
locale-xdg-desktop-portal-gnome-ug \
locale-xdg-desktop-portal-gnome-uk \
locale-xdg-desktop-portal-gnome-zh-CN \
locale-xdg-desktop-portal-gnome-zh-TW \
xdg-desktop-portal-gnome-lang \
xdg-desktop-portal-gnome-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal-gnome"

inherit rpm
