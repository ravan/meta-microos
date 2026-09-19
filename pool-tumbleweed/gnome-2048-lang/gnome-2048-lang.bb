SUMMARY = "Translations for package gnome-2048"
DESCRIPTION = "Provides translations for the 'gnome-2048' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.2"

RPM_NAME = "gnome-2048-lang-50.2-2.3.noarch.rpm"
RPM_HASH = "1e784c18b0a8f0ccde9fd235047a37bf433c65ba54e203c3124175add09a0b90fe5cfc0d250b4be9a04d67813b308d1eeb09a75caa6f0e9181ade8216dbee136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-2048-lang \
gnome-2048-lang-all \
locale-gnome-2048-af \
locale-gnome-2048-ar \
locale-gnome-2048-be \
locale-gnome-2048-bg \
locale-gnome-2048-bs \
locale-gnome-2048-ca \
locale-gnome-2048-ca@valencia \
locale-gnome-2048-cs \
locale-gnome-2048-da \
locale-gnome-2048-de \
locale-gnome-2048-el \
locale-gnome-2048-en-GB \
locale-gnome-2048-eo \
locale-gnome-2048-es \
locale-gnome-2048-eu \
locale-gnome-2048-fa \
locale-gnome-2048-fi \
locale-gnome-2048-fr \
locale-gnome-2048-fur \
locale-gnome-2048-gl \
locale-gnome-2048-he \
locale-gnome-2048-hi \
locale-gnome-2048-hr \
locale-gnome-2048-hu \
locale-gnome-2048-id \
locale-gnome-2048-is \
locale-gnome-2048-it \
locale-gnome-2048-ja \
locale-gnome-2048-ka \
locale-gnome-2048-kk \
locale-gnome-2048-ko \
locale-gnome-2048-lt \
locale-gnome-2048-lv \
locale-gnome-2048-ml \
locale-gnome-2048-ms \
locale-gnome-2048-nb \
locale-gnome-2048-ne \
locale-gnome-2048-nl \
locale-gnome-2048-oc \
locale-gnome-2048-pa \
locale-gnome-2048-pl \
locale-gnome-2048-pt \
locale-gnome-2048-pt-BR \
locale-gnome-2048-ro \
locale-gnome-2048-ru \
locale-gnome-2048-sk \
locale-gnome-2048-sl \
locale-gnome-2048-sr \
locale-gnome-2048-sr@latin \
locale-gnome-2048-sv \
locale-gnome-2048-ta \
locale-gnome-2048-th \
locale-gnome-2048-tr \
locale-gnome-2048-uk \
locale-gnome-2048-zh-CN \
locale-gnome-2048-zh-TW"

RDEPENDS:${PN} += "gnome-2048"

inherit rpm
