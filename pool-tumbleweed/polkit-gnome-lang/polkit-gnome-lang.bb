SUMMARY = "Translations for package polkit-gnome"
DESCRIPTION = "Provides translations for the 'polkit-gnome' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.105"

RPM_NAME = "polkit-gnome-lang-0.105-17.3.noarch.rpm"
RPM_HASH = "f0aac3879f87a21631de29d65b44316e927d8582857e1c4c76ec7e4c87ca87de73b9eae58a83991a0e847ed0bd43a8770caa9f90a50d8e44adbfb578661c0b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-polkit-gnome-ar \
locale-polkit-gnome-be \
locale-polkit-gnome-bn-IN \
locale-polkit-gnome-ca \
locale-polkit-gnome-ca@valencia \
locale-polkit-gnome-cs \
locale-polkit-gnome-da \
locale-polkit-gnome-de \
locale-polkit-gnome-el \
locale-polkit-gnome-en-GB \
locale-polkit-gnome-eo \
locale-polkit-gnome-es \
locale-polkit-gnome-eu \
locale-polkit-gnome-fi \
locale-polkit-gnome-fr \
locale-polkit-gnome-gl \
locale-polkit-gnome-gu \
locale-polkit-gnome-he \
locale-polkit-gnome-hi \
locale-polkit-gnome-hu \
locale-polkit-gnome-id \
locale-polkit-gnome-it \
locale-polkit-gnome-ja \
locale-polkit-gnome-kn \
locale-polkit-gnome-ko \
locale-polkit-gnome-lt \
locale-polkit-gnome-ml \
locale-polkit-gnome-mr \
locale-polkit-gnome-nb \
locale-polkit-gnome-or \
locale-polkit-gnome-pa \
locale-polkit-gnome-pl \
locale-polkit-gnome-pt \
locale-polkit-gnome-pt-BR \
locale-polkit-gnome-ro \
locale-polkit-gnome-ru \
locale-polkit-gnome-sk \
locale-polkit-gnome-sl \
locale-polkit-gnome-sr \
locale-polkit-gnome-sr@latin \
locale-polkit-gnome-sv \
locale-polkit-gnome-ta \
locale-polkit-gnome-te \
locale-polkit-gnome-th \
locale-polkit-gnome-tr \
locale-polkit-gnome-uk \
locale-polkit-gnome-vi \
locale-polkit-gnome-zh-CN \
locale-polkit-gnome-zh-HK \
locale-polkit-gnome-zh-TW \
polkit-gnome-lang \
polkit-gnome-lang-all"

RDEPENDS:${PN} += "polkit-gnome"

inherit rpm
