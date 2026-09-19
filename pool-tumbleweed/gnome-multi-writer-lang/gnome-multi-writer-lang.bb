SUMMARY = "Translations for package gnome-multi-writer"
DESCRIPTION = "Provides translations for the 'gnome-multi-writer' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.35.90+26"

RPM_NAME = "gnome-multi-writer-lang-3.35.90+26-3.4.noarch.rpm"
RPM_HASH = "a6c0c26b8c3d713ea9669bcffdc293d8c0a40931b0b5f35f2b9513fcce182d751db4aefcddf97bdc15521d49a2a9c15fdc628ec69fb938ec872af5c821dcb165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-multi-writer-lang \
gnome-multi-writer-lang-all \
locale-gnome-multi-writer-bs \
locale-gnome-multi-writer-ca \
locale-gnome-multi-writer-cs \
locale-gnome-multi-writer-da \
locale-gnome-multi-writer-de \
locale-gnome-multi-writer-el \
locale-gnome-multi-writer-en-GB \
locale-gnome-multi-writer-es \
locale-gnome-multi-writer-eu \
locale-gnome-multi-writer-fa \
locale-gnome-multi-writer-fi \
locale-gnome-multi-writer-fr \
locale-gnome-multi-writer-fur \
locale-gnome-multi-writer-gl \
locale-gnome-multi-writer-he \
locale-gnome-multi-writer-hr \
locale-gnome-multi-writer-hu \
locale-gnome-multi-writer-id \
locale-gnome-multi-writer-it \
locale-gnome-multi-writer-ja \
locale-gnome-multi-writer-ka \
locale-gnome-multi-writer-ko \
locale-gnome-multi-writer-nb \
locale-gnome-multi-writer-nl \
locale-gnome-multi-writer-oc \
locale-gnome-multi-writer-pl \
locale-gnome-multi-writer-pt \
locale-gnome-multi-writer-pt-BR \
locale-gnome-multi-writer-ro \
locale-gnome-multi-writer-ru \
locale-gnome-multi-writer-sk \
locale-gnome-multi-writer-sl \
locale-gnome-multi-writer-sr \
locale-gnome-multi-writer-sr@latin \
locale-gnome-multi-writer-sv \
locale-gnome-multi-writer-tr \
locale-gnome-multi-writer-uk \
locale-gnome-multi-writer-zh-CN \
locale-gnome-multi-writer-zh-TW"

RDEPENDS:${PN} += "gnome-multi-writer"

inherit rpm
