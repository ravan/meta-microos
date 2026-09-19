SUMMARY = "Translations for package xfce4-appfinder"
DESCRIPTION = "Provides translations for the 'xfce4-appfinder' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "xfce4-appfinder-lang-4.20.0-1.7.noarch.rpm"
RPM_HASH = "08a9ed3813b3ca147935e6e5d262128920102e1f92feb74695fdf97d3e5ea04cd2e3b7933128c7916c62f73e305a2c083946165edbf715a583755e58a8649284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-appfinder-ar \
locale-xfce4-appfinder-be \
locale-xfce4-appfinder-bg \
locale-xfce4-appfinder-bn \
locale-xfce4-appfinder-ca \
locale-xfce4-appfinder-cs \
locale-xfce4-appfinder-da \
locale-xfce4-appfinder-de \
locale-xfce4-appfinder-el \
locale-xfce4-appfinder-en-AU \
locale-xfce4-appfinder-en-CA \
locale-xfce4-appfinder-en-GB \
locale-xfce4-appfinder-eo \
locale-xfce4-appfinder-es \
locale-xfce4-appfinder-et \
locale-xfce4-appfinder-eu \
locale-xfce4-appfinder-fi \
locale-xfce4-appfinder-fr \
locale-xfce4-appfinder-gl \
locale-xfce4-appfinder-he \
locale-xfce4-appfinder-hi \
locale-xfce4-appfinder-hr \
locale-xfce4-appfinder-hu \
locale-xfce4-appfinder-id \
locale-xfce4-appfinder-is \
locale-xfce4-appfinder-it \
locale-xfce4-appfinder-ja \
locale-xfce4-appfinder-ko \
locale-xfce4-appfinder-lt \
locale-xfce4-appfinder-lv \
locale-xfce4-appfinder-ms \
locale-xfce4-appfinder-nb \
locale-xfce4-appfinder-nl \
locale-xfce4-appfinder-nn \
locale-xfce4-appfinder-oc \
locale-xfce4-appfinder-pa \
locale-xfce4-appfinder-pl \
locale-xfce4-appfinder-pt \
locale-xfce4-appfinder-pt-BR \
locale-xfce4-appfinder-ro \
locale-xfce4-appfinder-ru \
locale-xfce4-appfinder-si \
locale-xfce4-appfinder-sk \
locale-xfce4-appfinder-sl \
locale-xfce4-appfinder-sq \
locale-xfce4-appfinder-sr \
locale-xfce4-appfinder-sv \
locale-xfce4-appfinder-te \
locale-xfce4-appfinder-th \
locale-xfce4-appfinder-tr \
locale-xfce4-appfinder-ug \
locale-xfce4-appfinder-uk \
locale-xfce4-appfinder-vi \
locale-xfce4-appfinder-zh-CN \
locale-xfce4-appfinder-zh-HK \
locale-xfce4-appfinder-zh-TW \
xfce4-appfinder-lang \
xfce4-appfinder-lang-all"

RDEPENDS:${PN} += "xfce4-appfinder"

inherit rpm
