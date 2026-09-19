SUMMARY = "Translations for package gtk-vnc"
DESCRIPTION = "Provides translations for the 'gtk-vnc' package."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "gtk-vnc-lang-1.5.0-5.2.noarch.rpm"
RPM_HASH = "4ce80fa8012d4faa784343a21f5be9bdaddf3fe61fcd873806e30b86f737aef9597c0ed0739edd795e6b323ffbde783d17df834f61f15a8b3c4e5cb73cc15000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk-vnc-lang \
gtk-vnc-lang-all \
locale-gtk-vnc-be \
locale-gtk-vnc-bs \
locale-gtk-vnc-ca \
locale-gtk-vnc-ca@valencia \
locale-gtk-vnc-cs \
locale-gtk-vnc-da \
locale-gtk-vnc-de \
locale-gtk-vnc-el \
locale-gtk-vnc-en-GB \
locale-gtk-vnc-eo \
locale-gtk-vnc-es \
locale-gtk-vnc-eu \
locale-gtk-vnc-fa \
locale-gtk-vnc-fr \
locale-gtk-vnc-fur \
locale-gtk-vnc-gd \
locale-gtk-vnc-gl \
locale-gtk-vnc-he \
locale-gtk-vnc-hi \
locale-gtk-vnc-hr \
locale-gtk-vnc-hu \
locale-gtk-vnc-id \
locale-gtk-vnc-it \
locale-gtk-vnc-ja \
locale-gtk-vnc-ka \
locale-gtk-vnc-ko \
locale-gtk-vnc-lt \
locale-gtk-vnc-lv \
locale-gtk-vnc-nb \
locale-gtk-vnc-nds \
locale-gtk-vnc-nl \
locale-gtk-vnc-oc \
locale-gtk-vnc-pa \
locale-gtk-vnc-pl \
locale-gtk-vnc-pt \
locale-gtk-vnc-pt-BR \
locale-gtk-vnc-ro \
locale-gtk-vnc-ru \
locale-gtk-vnc-sk \
locale-gtk-vnc-sl \
locale-gtk-vnc-sr \
locale-gtk-vnc-sr@latin \
locale-gtk-vnc-sv \
locale-gtk-vnc-te \
locale-gtk-vnc-th \
locale-gtk-vnc-tr \
locale-gtk-vnc-uk \
locale-gtk-vnc-zh-CN \
locale-gtk-vnc-zh-HK \
locale-gtk-vnc-zh-TW"

RDEPENDS:${PN} += "gtk-vnc"

inherit rpm
