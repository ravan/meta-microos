SUMMARY = "Translations for package gnome-bluetooth"
DESCRIPTION = "Provides translations for the 'gnome-bluetooth' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "47.2"

RPM_NAME = "gnome-bluetooth-lang-47.2-1.3.noarch.rpm"
RPM_HASH = "5233d703f2983edc750e5edf89691621b0483d87cc41be18fc656976df6ba4591455dc7ff45f06ed206c87e8c6d39fcec189c25bda6d1bc37023dbbe4edefa22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-bluetooth-lang \
gnome-bluetooth-lang-all \
locale-gnome-bluetooth-af \
locale-gnome-bluetooth-ar \
locale-gnome-bluetooth-as \
locale-gnome-bluetooth-ast \
locale-gnome-bluetooth-be \
locale-gnome-bluetooth-bg \
locale-gnome-bluetooth-bn \
locale-gnome-bluetooth-bn-IN \
locale-gnome-bluetooth-bs \
locale-gnome-bluetooth-ca \
locale-gnome-bluetooth-ca@valencia \
locale-gnome-bluetooth-cs \
locale-gnome-bluetooth-da \
locale-gnome-bluetooth-de \
locale-gnome-bluetooth-el \
locale-gnome-bluetooth-en-GB \
locale-gnome-bluetooth-en@shaw \
locale-gnome-bluetooth-eo \
locale-gnome-bluetooth-es \
locale-gnome-bluetooth-et \
locale-gnome-bluetooth-eu \
locale-gnome-bluetooth-fa \
locale-gnome-bluetooth-fi \
locale-gnome-bluetooth-fr \
locale-gnome-bluetooth-fur \
locale-gnome-bluetooth-ga \
locale-gnome-bluetooth-gd \
locale-gnome-bluetooth-gl \
locale-gnome-bluetooth-gu \
locale-gnome-bluetooth-he \
locale-gnome-bluetooth-hi \
locale-gnome-bluetooth-hr \
locale-gnome-bluetooth-hu \
locale-gnome-bluetooth-id \
locale-gnome-bluetooth-is \
locale-gnome-bluetooth-it \
locale-gnome-bluetooth-ja \
locale-gnome-bluetooth-ka \
locale-gnome-bluetooth-kk \
locale-gnome-bluetooth-km \
locale-gnome-bluetooth-kn \
locale-gnome-bluetooth-ko \
locale-gnome-bluetooth-lt \
locale-gnome-bluetooth-lv \
locale-gnome-bluetooth-mai \
locale-gnome-bluetooth-mk \
locale-gnome-bluetooth-ml \
locale-gnome-bluetooth-mr \
locale-gnome-bluetooth-ms \
locale-gnome-bluetooth-nb \
locale-gnome-bluetooth-ne \
locale-gnome-bluetooth-nl \
locale-gnome-bluetooth-nn \
locale-gnome-bluetooth-oc \
locale-gnome-bluetooth-or \
locale-gnome-bluetooth-pa \
locale-gnome-bluetooth-pl \
locale-gnome-bluetooth-pt \
locale-gnome-bluetooth-pt-BR \
locale-gnome-bluetooth-ro \
locale-gnome-bluetooth-ru \
locale-gnome-bluetooth-sk \
locale-gnome-bluetooth-sl \
locale-gnome-bluetooth-sr \
locale-gnome-bluetooth-sr@latin \
locale-gnome-bluetooth-sv \
locale-gnome-bluetooth-ta \
locale-gnome-bluetooth-te \
locale-gnome-bluetooth-th \
locale-gnome-bluetooth-tr \
locale-gnome-bluetooth-ug \
locale-gnome-bluetooth-uk \
locale-gnome-bluetooth-vi \
locale-gnome-bluetooth-zh-CN \
locale-gnome-bluetooth-zh-HK \
locale-gnome-bluetooth-zh-TW"

RDEPENDS:${PN} += "gnome-bluetooth"

inherit rpm
