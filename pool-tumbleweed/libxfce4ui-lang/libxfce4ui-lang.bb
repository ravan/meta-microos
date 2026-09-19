SUMMARY = "Languages for package libxfce4ui"
DESCRIPTION = "Provides translations to the package libxfce4ui"
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "libxfce4ui-lang-4.20.2-1.5.noarch.rpm"
RPM_HASH = "e56cf400e6f1009bd9314887a02c7d4d781d32ebf415deeb20af00342abe0ff16c277b3d45571d5b664fce550d7b7a595de1466c343ef03cffbbfdcd9a2f2408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxfce4ui-lang \
libxfce4ui-lang-all \
locale-libxfce4ui-ar \
locale-libxfce4ui-az \
locale-libxfce4ui-be \
locale-libxfce4ui-bg \
locale-libxfce4ui-bn \
locale-libxfce4ui-ca \
locale-libxfce4ui-cs \
locale-libxfce4ui-cy \
locale-libxfce4ui-da \
locale-libxfce4ui-de \
locale-libxfce4ui-el \
locale-libxfce4ui-en-AU \
locale-libxfce4ui-en-GB \
locale-libxfce4ui-eo \
locale-libxfce4ui-es \
locale-libxfce4ui-et \
locale-libxfce4ui-eu \
locale-libxfce4ui-fi \
locale-libxfce4ui-fr \
locale-libxfce4ui-gl \
locale-libxfce4ui-he \
locale-libxfce4ui-hr \
locale-libxfce4ui-hu \
locale-libxfce4ui-id \
locale-libxfce4ui-is \
locale-libxfce4ui-it \
locale-libxfce4ui-ja \
locale-libxfce4ui-ka \
locale-libxfce4ui-ko \
locale-libxfce4ui-lt \
locale-libxfce4ui-lv \
locale-libxfce4ui-ms \
locale-libxfce4ui-nb \
locale-libxfce4ui-nl \
locale-libxfce4ui-nn \
locale-libxfce4ui-oc \
locale-libxfce4ui-pa \
locale-libxfce4ui-pl \
locale-libxfce4ui-pt \
locale-libxfce4ui-pt-BR \
locale-libxfce4ui-ro \
locale-libxfce4ui-ru \
locale-libxfce4ui-si \
locale-libxfce4ui-sk \
locale-libxfce4ui-sl \
locale-libxfce4ui-sq \
locale-libxfce4ui-sr \
locale-libxfce4ui-sv \
locale-libxfce4ui-te \
locale-libxfce4ui-th \
locale-libxfce4ui-tr \
locale-libxfce4ui-ug \
locale-libxfce4ui-uk \
locale-libxfce4ui-vi \
locale-libxfce4ui-zh-CN \
locale-libxfce4ui-zh-HK \
locale-libxfce4ui-zh-TW"

RDEPENDS:${PN} += "libxfce4ui-2-0"

inherit rpm
