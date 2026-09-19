SUMMARY = "Translations for package xdg-desktop-portal-gtk"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.3"

RPM_NAME = "xdg-desktop-portal-gtk-lang-1.15.3-1.5.noarch.rpm"
RPM_HASH = "223eabdf9d0085753504241fb75a9a502b081935edb88a0f88899490e4f71bb148cf69b5ca88616533ff6ca651a2f3191dd46f3f60cdef67adfb6cb40c18a6dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-desktop-portal-gtk-be \
locale-xdg-desktop-portal-gtk-ca \
locale-xdg-desktop-portal-gtk-cs \
locale-xdg-desktop-portal-gtk-da \
locale-xdg-desktop-portal-gtk-de \
locale-xdg-desktop-portal-gtk-en-GB \
locale-xdg-desktop-portal-gtk-es \
locale-xdg-desktop-portal-gtk-fr \
locale-xdg-desktop-portal-gtk-gl \
locale-xdg-desktop-portal-gtk-he \
locale-xdg-desktop-portal-gtk-hi \
locale-xdg-desktop-portal-gtk-hr \
locale-xdg-desktop-portal-gtk-hu \
locale-xdg-desktop-portal-gtk-id \
locale-xdg-desktop-portal-gtk-it \
locale-xdg-desktop-portal-gtk-ja \
locale-xdg-desktop-portal-gtk-ka \
locale-xdg-desktop-portal-gtk-lt \
locale-xdg-desktop-portal-gtk-nl \
locale-xdg-desktop-portal-gtk-oc \
locale-xdg-desktop-portal-gtk-pl \
locale-xdg-desktop-portal-gtk-pt \
locale-xdg-desktop-portal-gtk-pt-BR \
locale-xdg-desktop-portal-gtk-ro \
locale-xdg-desktop-portal-gtk-ru \
locale-xdg-desktop-portal-gtk-sk \
locale-xdg-desktop-portal-gtk-sl \
locale-xdg-desktop-portal-gtk-sr \
locale-xdg-desktop-portal-gtk-sv \
locale-xdg-desktop-portal-gtk-tr \
locale-xdg-desktop-portal-gtk-uk \
locale-xdg-desktop-portal-gtk-zh-CN \
locale-xdg-desktop-portal-gtk-zh-TW \
xdg-desktop-portal-gtk-lang \
xdg-desktop-portal-gtk-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal-gtk"

inherit rpm
