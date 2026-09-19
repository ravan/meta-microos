SUMMARY = "Translations for package gnome-tour"
DESCRIPTION = "Provides translations for the 'gnome-tour' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0.openSUSE+git20260413.334ffbd"

RPM_NAME = "gnome-tour-lang-50.0.openSUSE+git20260413.334ffbd-1.3.noarch.rpm"
RPM_HASH = "fce9bf32ec8c3e5f644de4810ff5bf04c9fd35f3ef17811f71d73395112f101226e306cd5c84f26d9526527006a33469cd24cec1658b749008094f2a08bece18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-tour-lang \
gnome-tour-lang-all \
locale-gnome-tour-ar \
locale-gnome-tour-be \
locale-gnome-tour-bg \
locale-gnome-tour-bn \
locale-gnome-tour-ca \
locale-gnome-tour-cs \
locale-gnome-tour-da \
locale-gnome-tour-de \
locale-gnome-tour-el \
locale-gnome-tour-en-GB \
locale-gnome-tour-eo \
locale-gnome-tour-es \
locale-gnome-tour-eu \
locale-gnome-tour-fa \
locale-gnome-tour-fi \
locale-gnome-tour-fr \
locale-gnome-tour-fur \
locale-gnome-tour-gl \
locale-gnome-tour-he \
locale-gnome-tour-hi \
locale-gnome-tour-hr \
locale-gnome-tour-hu \
locale-gnome-tour-ia \
locale-gnome-tour-id \
locale-gnome-tour-is \
locale-gnome-tour-it \
locale-gnome-tour-ja \
locale-gnome-tour-ka \
locale-gnome-tour-kk \
locale-gnome-tour-ko \
locale-gnome-tour-lt \
locale-gnome-tour-lv \
locale-gnome-tour-ml \
locale-gnome-tour-nb \
locale-gnome-tour-ne \
locale-gnome-tour-nl \
locale-gnome-tour-nn \
locale-gnome-tour-oc \
locale-gnome-tour-pa \
locale-gnome-tour-pl \
locale-gnome-tour-pt \
locale-gnome-tour-pt-BR \
locale-gnome-tour-ro \
locale-gnome-tour-ru \
locale-gnome-tour-sk \
locale-gnome-tour-sl \
locale-gnome-tour-sr \
locale-gnome-tour-sr@latin \
locale-gnome-tour-sv \
locale-gnome-tour-ta \
locale-gnome-tour-th \
locale-gnome-tour-tr \
locale-gnome-tour-ug \
locale-gnome-tour-uk \
locale-gnome-tour-vi \
locale-gnome-tour-zh-CN \
locale-gnome-tour-zh-TW"

RDEPENDS:${PN} += "gnome-tour"

inherit rpm
