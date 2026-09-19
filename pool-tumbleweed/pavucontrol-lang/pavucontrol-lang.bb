SUMMARY = "Translations for package pavucontrol"
DESCRIPTION = "Provides translations for the 'pavucontrol' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.2"

RPM_NAME = "pavucontrol-lang-6.2-1.3.noarch.rpm"
RPM_HASH = "117a0cb8cd72656a4b06c2ea2565d4f3bb6623c01c5529ec7991c914d468b125d4a374b9cb244b0f9899988cb0944f16248e314e4516b4059a5ca871e456bbe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pavucontrol-af \
locale-pavucontrol-ar \
locale-pavucontrol-as \
locale-pavucontrol-ast \
locale-pavucontrol-be \
locale-pavucontrol-bn-IN \
locale-pavucontrol-ca \
locale-pavucontrol-ca@valencia \
locale-pavucontrol-cs \
locale-pavucontrol-da \
locale-pavucontrol-de \
locale-pavucontrol-el \
locale-pavucontrol-es \
locale-pavucontrol-eu \
locale-pavucontrol-fi \
locale-pavucontrol-fr \
locale-pavucontrol-gl \
locale-pavucontrol-gu \
locale-pavucontrol-he \
locale-pavucontrol-hi \
locale-pavucontrol-hr \
locale-pavucontrol-hu \
locale-pavucontrol-id \
locale-pavucontrol-it \
locale-pavucontrol-ja \
locale-pavucontrol-ka \
locale-pavucontrol-kk \
locale-pavucontrol-kn \
locale-pavucontrol-ko \
locale-pavucontrol-lt \
locale-pavucontrol-ml \
locale-pavucontrol-mr \
locale-pavucontrol-nb-NO \
locale-pavucontrol-nl \
locale-pavucontrol-nn \
locale-pavucontrol-or \
locale-pavucontrol-pa \
locale-pavucontrol-pl \
locale-pavucontrol-pt \
locale-pavucontrol-pt-BR \
locale-pavucontrol-ro \
locale-pavucontrol-ru \
locale-pavucontrol-si \
locale-pavucontrol-sk \
locale-pavucontrol-sl \
locale-pavucontrol-sr \
locale-pavucontrol-sr@latin \
locale-pavucontrol-sv \
locale-pavucontrol-ta \
locale-pavucontrol-te \
locale-pavucontrol-th \
locale-pavucontrol-tr \
locale-pavucontrol-uk \
locale-pavucontrol-zh-CN \
locale-pavucontrol-zh-TW \
pavucontrol-lang \
pavucontrol-lang-all"

RDEPENDS:${PN} += "pavucontrol"

inherit rpm
